package rs.itbootcamp.humanity.page.tests;

import org.openqa.selenium.WebDriver;

public class HumanityAddNewEmployeeTests {

	private static final String ADD_EMPLOYEE_URL_TESTING = "https://neko.humanity.com/app/staff/assignstaff&new=1&first=5093764/";
	
	public static boolean testAddEmployee(WebDriver driver) {
		String url = driver.getCurrentUrl();
		if(url.equals(ADD_EMPLOYEE_URL_TESTING)) {
			System.out.println("Zaposleni uspesno dodat");
			return true;
		}else {
			System.out.println("Zaposleni nije dodat");
			return false;
		}
	}
}
