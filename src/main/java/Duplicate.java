import java.util.ArrayList;
import java.util.List;

public class Duplicate{
	
	public static void main(String[] args) {
		String[] cities = getCities();
		String[] counties = getCounties();
		String[] timezone = getTimezone();
		
		List<String> nonDupliCounties = new ArrayList<>();
		List<String> nonDupliCities = new ArrayList<>();
		List<String> nonDupliTimezone = new ArrayList<>();
		
		
		
		for (int i=0; i<cities.length; i++) {
			int count = 0;
			for (int j=0; j<cities.length; j++) {
				if (cities[i].equals(cities[j]) && counties[i].equals(counties[j])) {
					count++;
				}
			}
			if (count==1) {      //WRONG!!!!!!!!
				nonDupliCounties.add(counties[i]);
				nonDupliCities.add(cities[i]);
				nonDupliTimezone.add(timezone[i]);
			}
		}
		
		
		System.out.println("---------------------------------------------------");
		
		for (int i=0; i<nonDupliCounties.size(); i++) {
			System.out.println(nonDupliCounties.get(i));
		}
		
		System.out.println("---------------------------------------------------");
		
		for (int i=0; i<nonDupliCities.size(); i++) {
			System.out.println(nonDupliCities.get(i));
		}
		
		System.out.println("---------------------------------------------------");
		
		for (int i=0; i<nonDupliTimezone.size(); i++) {
			System.out.println(nonDupliTimezone.get(i));
		}
		
		
		
		
	}
	
	public static String[] getCities() {
		
		String citiesString = "Avon\n" + 
				"Bloomfield\n" + 
				"Bristol\n" + 
				"Burlington\n" + 
				"Broad Brook\n" + 
				"Canaan\n" + 
				"Canton\n" + 
				"Canton Center\n" + 
				"Colebrook\n" + 
				"Collinsville\n" + 
				"East Berlin\n" + 
				"East Canaan\n" + 
				"East Granby\n" + 
				"East Hartland\n" + 
				"Ellington\n" + 
				"Falls Village\n" + 
				"Farmington\n" + 
				"Glastonbury\n" + 
				"Granby\n" + 
				"Berlin\n" + 
				"Lakeville\n" + 
				"Manchester\n" + 
				"Manchester\n" + 
				"Bolton\n" + 
				"New Britain\n" + 
				"New Britain\n" + 
				"New Britain\n" + 
				"New Hartford\n" + 
				"Norfolk\n" + 
				"North Canton\n" + 
				"North Granby\n" + 
				"Pine Meadow\n" + 
				"Plainville\n" + 
				"Barkhamsted\n" + 
				"Riverton\n" + 
				"Vernon Rockville\n" + 
				"Rocky Hill\n" + 
				"Salisbury\n" + 
				"Sharon\n" + 
				"Simsbury\n" + 
				"Somers\n" + 
				"South Glastonbury\n" + 
				"South Windsor\n" + 
				"Stafford Springs\n" + 
				"Suffield\n" + 
				"Tariffville\n" + 
				"Enfield\n" + 
				"Tolland\n" + 
				"Unionville\n" + 
				"East Windsor\n" + 
				"Weatogue\n" + 
				"West Granby\n" + 
				"West Hartland\n" + 
				"West Simsbury\n" + 
				"West Suffield\n" + 
				"Windsor\n" + 
				"Windsor Locks\n" + 
				"Winsted\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"West Hartford\n" + 
				"East Hartford\n" + 
				"Wethersfield\n" + 
				"West Hartford\n" + 
				"Newington\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"West Hartford\n" + 
				"East Hartford\n" + 
				"West Hartford\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Willimantic\n" + 
				"Amston\n" + 
				"Andover\n" + 
				"Brooklyn\n" + 
				"Chaplin\n" + 
				"Columbia\n" + 
				"Coventry\n" + 
				"Danielson\n" + 
				"Dayville\n" + 
				"Eastford\n" + 
				"East Killingly\n" + 
				"Hampton\n" + 
				"Hebron\n" + 
				"Lebanon\n" + 
				"Mansfield Center\n" + 
				"North Franklin\n" + 
				"North Grosvenordale\n" + 
				"North Windham\n" + 
				"Pomfret Center\n" + 
				"Putnam\n" + 
				"Quinebaug\n" + 
				"Rogers\n" + 
				"Scotland\n" + 
				"South Windham\n" + 
				"Storrs Mansfield\n" + 
				"Storrs Mansfield\n" + 
				"Thompson\n" + 
				"Ashford\n" + 
				"Willington\n" + 
				"Windham\n" + 
				"Woodstock\n" + 
				"Woodstock Valley\n" + 
				"New London\n" + 
				"Baltic\n" + 
				"Canterbury\n" + 
				"Central Village\n" + 
				"East Lyme\n" + 
				"Bozrah\n" + 
				"Gales Ferry\n" + 
				"Gilman\n" + 
				"Ledyard\n" + 
				"Groton\n" + 
				"Hanover\n" + 
				"Jewett City\n" + 
				"Montville\n" + 
				"Moosup\n" + 
				"Mystic\n" + 
				"Niantic\n" + 
				"North Stonington\n" + 
				"Norwich\n" + 
				"Preston\n" + 
				"Oakdale\n" + 
				"Old Lyme\n" + 
				"Oneco\n" + 
				"Plainfield\n" + 
				"Quaker Hill\n" + 
				"South Lyme\n" + 
				"Sterling\n" + 
				"Stonington\n" + 
				"Pawcatuck\n" + 
				"Taftville\n" + 
				"Uncasville\n" + 
				"Voluntown\n" + 
				"Waterford\n" + 
				"Wauregan\n" + 
				"Yantic\n" + 
				"Ansonia\n" + 
				"Beacon Falls\n" + 
				"Branford\n" + 
				"Centerbrook\n" + 
				"Cheshire\n" + 
				"Chester\n" + 
				"Clinton\n" + 
				"Cobalt\n" + 
				"Colchester\n" + 
				"Cromwell\n" + 
				"Deep River\n" + 
				"Derby\n" + 
				"Killingworth\n" + 
				"Salem\n" + 
				"Durham\n" + 
				"East Haddam\n" + 
				"East Hampton\n" + 
				"Essex\n" + 
				"Guilford\n" + 
				"Haddam\n" + 
				"Higganum\n" + 
				"Ivoryton\n" + 
				"Madison\n" + 
				"Marion\n" + 
				"Marlborough\n" + 
				"Meriden\n" + 
				"Meriden\n" + 
				"Middlefield\n" + 
				"Middle Haddam\n" + 
				"Middletown\n" + 
				"Milford\n" + 
				"Milford\n" + 
				"Milldale\n" + 
				"Monroe\n" + 
				"Moodus\n" + 
				"Newtown\n" + 
				"North Branford\n" + 
				"Northford\n" + 
				"North Haven\n" + 
				"Old Saybrook\n" + 
				"Orange\n" + 
				"Oxford\n" + 
				"Plantsville\n" + 
				"Portland\n" + 
				"Rockfall\n" + 
				"Sandy Hook\n" + 
				"Seymour\n" + 
				"Shelton\n" + 
				"Southbury\n" + 
				"Southington\n" + 
				"Wallingford\n" + 
				"Westbrook\n" + 
				"New Haven\n" + 
				"New Haven\n" + 
				"East Haven\n" + 
				"New Haven\n" + 
				"Hamden\n" + 
				"New Haven\n" + 
				"West Haven\n" + 
				"Hamden\n" + 
				"Hamden\n" + 
				"New Haven\n" + 
				"Bethany\n" + 
				"Woodbridge\n" + 
				"Bridgeport\n" + 
				"Bridgeport\n" + 
				"Bridgeport\n" + 
				"Bridgeport\n" + 
				"Bridgeport\n" + 
				"Bridgeport\n" + 
				"Trumbull\n" + 
				"Easton\n" + 
				"Stratford\n" + 
				"Stratford\n" + 
				"Waterbury\n" + 
				"Waterbury\n" + 
				"Waterbury\n" + 
				"Waterbury\n" + 
				"Waterbury\n" + 
				"Waterbury\n" + 
				"Prospect\n" + 
				"Wolcott\n" + 
				"Bantam\n" + 
				"Bethlehem\n" + 
				"Bridgewater\n" + 
				"Cornwall Bridge\n" + 
				"Gaylordsville\n" + 
				"Goshen\n" + 
				"Kent\n" + 
				"Lakeside\n" + 
				"Litchfield\n" + 
				"Middlebury\n" + 
				"Morris\n" + 
				"Naugatuck\n" + 
				"New Milford\n" + 
				"New Preston Marble Dale\n" + 
				"Northfield\n" + 
				"Oakville\n" + 
				"Plymouth\n" + 
				"Roxbury\n" + 
				"Sherman\n" + 
				"South Kent\n" + 
				"Terryville\n" + 
				"Thomaston\n" + 
				"Torrington\n" + 
				"Harwinton\n" + 
				"Washington\n" + 
				"Washington Depot\n" + 
				"Watertown\n" + 
				"West Cornwall\n" + 
				"Woodbury\n" + 
				"Bethel\n" + 
				"Brookfield\n" + 
				"Cos Cob\n" + 
				"Danbury\n" + 
				"Danbury\n" + 
				"New Fairfield\n" + 
				"Darien\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Greenwich\n" + 
				"Greenwich\n" + 
				"New Canaan\n" + 
				"Norwalk\n" + 
				"Norwalk\n" + 
				"Norwalk\n" + 
				"Norwalk\n" + 
				"Norwalk\n" + 
				"Norwalk\n" + 
				"Old Greenwich\n" + 
				"Ridgefield\n" + 
				"Riverside\n" + 
				"Westport\n" + 
				"Weston\n" + 
				"Southport\n" + 
				"Redding\n" + 
				"Wilton\n" + 
				"Stamford\n" + 
				"Stamford\n" + 
				"Stamford\n" + 
				"Stamford\n" + 
				"Stamford\n" + 
				"Stamford";
		String[] cities = citiesString.split("\n");
		return cities;
	}
	
	public static String[] getCounties() {
		String countiesString = "Hartford\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Litchfield\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Litchfield\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Litchfield\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Tolland\n" + 
				"Litchfield\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Litchfield\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Tolland\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Litchfield\n" + 
				"Litchfield\n" + 
				"Litchfield\n" + 
				"Hartford\n" + 
				"Litchfield\n" + 
				"Hartford\n" + 
				"Litchfield\n" + 
				"Hartford\n" + 
				"Tolland\n" + 
				"Hartford\n" + 
				"Litchfield\n" + 
				"Litchfield\n" + 
				"Hartford\n" + 
				"Tolland\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Tolland\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Tolland\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Litchfield\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"Windham\n" + 
				"Tolland\n" + 
				"Tolland\n" + 
				"Windham\n" + 
				"Windham\n" + 
				"Tolland\n" + 
				"Tolland\n" + 
				"Windham\n" + 
				"Windham\n" + 
				"Windham\n" + 
				"Windham\n" + 
				"Windham\n" + 
				"Tolland\n" + 
				"New London\n" + 
				"Tolland\n" + 
				"New London\n" + 
				"Windham\n" + 
				"Windham\n" + 
				"Windham\n" + 
				"Windham\n" + 
				"Windham\n" + 
				"Windham\n" + 
				"Windham\n" + 
				"Windham\n" + 
				"Tolland\n" + 
				"Tolland\n" + 
				"Windham\n" + 
				"Windham\n" + 
				"Tolland\n" + 
				"Windham\n" + 
				"Windham\n" + 
				"Windham\n" + 
				"New London\n" + 
				"New London\n" + 
				"Windham\n" + 
				"Windham\n" + 
				"New London\n" + 
				"New London\n" + 
				"New London\n" + 
				"New London\n" + 
				"New London\n" + 
				"New London\n" + 
				"New London\n" + 
				"New London\n" + 
				"New London\n" + 
				"Windham\n" + 
				"New London\n" + 
				"New London\n" + 
				"New London\n" + 
				"New London\n" + 
				"New London\n" + 
				"New London\n" + 
				"New London\n" + 
				"Windham\n" + 
				"Windham\n" + 
				"New London\n" + 
				"New London\n" + 
				"Windham\n" + 
				"New London\n" + 
				"New London\n" + 
				"New London\n" + 
				"New London\n" + 
				"New London\n" + 
				"New London\n" + 
				"Windham\n" + 
				"New London\n" + 
				"New Haven\n" + 
				"New Haven\n" + 
				"New Haven\n" + 
				"Middlesex\n" + 
				"New Haven\n" + 
				"Middlesex\n" + 
				"Middlesex\n" + 
				"Middlesex\n" + 
				"New London\n" + 
				"Middlesex\n" + 
				"Middlesex\n" + 
				"New Haven\n" + 
				"Middlesex\n" + 
				"New London\n" + 
				"Middlesex\n" + 
				"Middlesex\n" + 
				"Middlesex\n" + 
				"Middlesex\n" + 
				"New Haven\n" + 
				"Middlesex\n" + 
				"Middlesex\n" + 
				"Middlesex\n" + 
				"New Haven\n" + 
				"Hartford\n" + 
				"Hartford\n" + 
				"New Haven\n" + 
				"New Haven\n" + 
				"Middlesex\n" + 
				"Middlesex\n" + 
				"Middlesex\n" + 
				"New Haven\n" + 
				"New Haven\n" + 
				"Hartford\n" + 
				"Fairfield\n" + 
				"Middlesex\n" + 
				"Fairfield\n" + 
				"New Haven\n" + 
				"New Haven\n" + 
				"New Haven\n" + 
				"Middlesex\n" + 
				"New Haven\n" + 
				"New Haven\n" + 
				"Hartford\n" + 
				"Middlesex\n" + 
				"Middlesex\n" + 
				"Fairfield\n" + 
				"New Haven\n" + 
				"Fairfield\n" + 
				"New Haven\n" + 
				"Hartford\n" + 
				"New Haven\n" + 
				"Middlesex\n" + 
				"New Haven\n" + 
				"New Haven\n" + 
				"New Haven\n" + 
				"New Haven\n" + 
				"New Haven\n" + 
				"New Haven\n" + 
				"New Haven\n" + 
				"New Haven\n" + 
				"New Haven\n" + 
				"New Haven\n" + 
				"New Haven\n" + 
				"New Haven\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"New Haven\n" + 
				"New Haven\n" + 
				"New Haven\n" + 
				"New Haven\n" + 
				"New Haven\n" + 
				"New Haven\n" + 
				"New Haven\n" + 
				"New Haven\n" + 
				"Litchfield\n" + 
				"Litchfield\n" + 
				"Litchfield\n" + 
				"Litchfield\n" + 
				"Litchfield\n" + 
				"Litchfield\n" + 
				"Litchfield\n" + 
				"Litchfield\n" + 
				"Litchfield\n" + 
				"New Haven\n" + 
				"Litchfield\n" + 
				"New Haven\n" + 
				"Litchfield\n" + 
				"Litchfield\n" + 
				"Litchfield\n" + 
				"Litchfield\n" + 
				"Litchfield\n" + 
				"Litchfield\n" + 
				"Fairfield\n" + 
				"Litchfield\n" + 
				"Litchfield\n" + 
				"Litchfield\n" + 
				"Litchfield\n" + 
				"Litchfield\n" + 
				"Litchfield\n" + 
				"Litchfield\n" + 
				"Litchfield\n" + 
				"Litchfield\n" + 
				"Litchfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield\n" + 
				"Fairfield";
		String[] counties = countiesString.split("\n");
		return counties;
	}
	
	public static String[] getTimezone() {
		String timezoneString = "America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York\n" + 
				"America/New_York";
		String[] timezone = timezoneString.split("\n");
		return timezone;
	}
	
	
	
	
	
	
}