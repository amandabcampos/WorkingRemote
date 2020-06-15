package co.amandacampos.movingremote;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
		ModelAndView mav = new ModelAndView("home");
		
		
		List<StateCityPopCrime> thisList1 = stateCityPopCrimeRepo.findAll();
		List<StateCountyPoliticalEducation> thisList2 = stateCountyPoliticalEducationRepo.findAll();
		List<StateCountyCityDenTimezone> thisList3 = stateCountyCityDenTimezoneRepo.findAll();
		
		
		mav.addObject("thisList1", thisList1);
		mav.addObject("thisList2", thisList2);
		mav.addObject("thisList3", thisList3);
		
		return mav;
	}
	
//	@PostMapping("/")
//	public ModelAndView home(@RequestParam("pop") List<String> pop) {
//		System.out.println(pop);
//		System.out.println(pop.size());
//		return null;
//	}

}
