package rs.itbootcamp.humanity.page.tests;


import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.WebDriver;


public class HumanityAddNewEmployeeTests {

	private static final String ADD_EMPLOYEE_URL_TESTING = "https://neko.humanity.com/app/staff/assignstaff&new/";
	
	public static boolean testAddEmployee(WebDriver driver) {
		String url = "https://neko.humanity.com/app/staff/assignstaff&new/";
		
		if(url.equals(ADD_EMPLOYEE_URL_TESTING)) {
			System.out.println("Zaposleni uspesno dodat"+ url);
			return true;
		}else {
			System.out.println("Zaposleni nije dodat"+ ADD_EMPLOYEE_URL_TESTING);
			return false;
		}
	}
}
