package co.amandacampos.movingremote;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.amandacampos.movingremote.entities.StateCityPopCrime;
import co.amandacampos.movingremote.entities.StateCountyCityDenTimezone;
import co.amandacampos.movingremote.entities.StateCountyPoliticalEducation;
import co.amandacampos.movingremote.repos.StateCityPopCrimeRepo;
import co.amandacampos.movingremote.repos.StateCountyCityDenTimezoneRepo;
import co.amandacampos.movingremote.repos.StateCountyPoliticalEducationRepo;

@Controller
public class MovingRemoteController {

	@Autowired
	private StateCityPopCrimeRepo stateCityPopCrimeRepo;

	@Autowired
	private StateCountyPoliticalEducationRepo stateCountyPoliticalEducationRepo;

	@Autowired
	private StateCountyCityDenTimezoneRepo stateCountyCityDenTimezoneRepo;

	@RequestMapping("/")
	public ModelAndView home() {

		return new ModelAndView("home");

	}

	@PostMapping("/")
	public ModelAndView home(@RequestParam(name = "popmin", required = false) Double popmin,
			@RequestParam(name = "popmax", required = false) Double popmax,
			@RequestParam(name = "political", required = false) List<String> political,
			@RequestParam(name = "education", required = false) List<String> education,
			@RequestParam(name = "crime", required = false) List<String> crime,
			@RequestParam(name = "timezone", required = false) List<String> timezone) {

		// TODO: MAKE SURE ALL FIELDS HAVE AT LEAST ONE SELECTION
		// TODO: Add current time next to the timezones
		// TODO: Clean StateCountyCityDenTimezone to get rid of duplicates and decrease computation time

//		PART 1: Finding a County after selecting from Political and Education
		
		List<StateCountyPoliticalEducation> subPol = new ArrayList<>();

		for (int i = 0; i < political.size(); i++) {
			subPol.addAll(stateCountyPoliticalEducationRepo.findByPolitical(political.get(i)));
		}

		List<StateCountyPoliticalEducation> subEd = new ArrayList<>();

		for (int i = 0; i < education.size(); i++) {
			subEd.addAll(stateCountyPoliticalEducationRepo.findByEducation(education.get(i)));
		}

		List<String> state1 = new ArrayList<>();
		List<String> county1 = new ArrayList<>();

		for (StateCountyPoliticalEducation ob : subPol) {
			if (subEd.contains(ob)) {
				state1.add(ob.getState());
				county1.add(ob.getCounty());
			}
		}

//		End PART 1

//      PART 2: Regarding the pre-selected counties, and incorporating timezone, find suitable cities

		List<StateCountyCityDenTimezone> selec1 = new ArrayList<>();

		for (int i = 0; i < state1.size(); i++) {
			selec1.addAll(stateCountyCityDenTimezoneRepo.findByStateAndCounty(state1.get(i), county1.get(i)));
		}

		// selec1 gets duplicate

		if (selec1.size() > 0) {

			List<StateCountyCityDenTimezone> subTime = new ArrayList<>();

			for (int i = 0; i < timezone.size(); i++) {
				subTime.addAll(stateCountyCityDenTimezoneRepo.findByTimezone(timezone.get(i)));
			}

			List<String> state2 = new ArrayList<>();
			List<String> city2 = new ArrayList<>();

			for (StateCountyCityDenTimezone ab : subTime) {
				if (selec1.contains(ab)) {
					state2.add(ab.getState());
					city2.add(ab.getCity());
				}
			}

//      End PART 2
//      PART 3: Regarding the pre-selected cities, and incorporating crime and population, find suitable cities

			List<StateCityPopCrime> selec2 = new ArrayList<>();

			for (int i = 0; i < state2.size(); i++) {
				selec2.addAll(stateCityPopCrimeRepo.findByStateAndCity(state2.get(i), city2.get(i)));
			}

			// Duplicates are still on selec2

			if (selec2.size() > 0) {

				List<StateCityPopCrime> subCrime = new ArrayList<>();
				for (int i = 0; i < crime.size(); i++) {
					subCrime.addAll(stateCityPopCrimeRepo.findByCrime(crime.get(i)));
				}

				List<StateCityPopCrime> subPop = new ArrayList<>();
				subPop.addAll(stateCityPopCrimeRepo.findByPopulationGreaterThanAndPopulationLessThan(popmin, popmax));

				List<StateCityPopCrime> preSelected = new ArrayList<>();

				for (StateCityPopCrime ct : subCrime) {
					if (subPop.contains(ct)) {
						preSelected.add(ct);
					}
				}

				List<StateCityPopCrime> selected = new ArrayList<>();

				for (StateCityPopCrime we : preSelected) {
					if (selec2.contains(we)) {
						selected.add(we); // Duplicates disappear here bc there's no duplicates on the last table
					}
				}

				if (selected.size() > 0) {
					return new ModelAndView("tableResult", "selected", selected);
				} 
			}
		}
		return new ModelAndView("noResult", "message", "No results found");
	}

}
