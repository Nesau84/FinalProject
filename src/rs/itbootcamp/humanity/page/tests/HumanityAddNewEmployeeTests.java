package rs.itbootcamp.humanity.page.tests;


import org.openqa.selenium.WebDriver;

//ne valja!

public class HumanityAddNewEmployeeTests {


	
	public static boolean testAddEmployee(WebDriver driver) {
		String url = "https://neko.humanity.com/app/staff/add/";
	
		
		if(driver.getCurrentUrl().contains(url)){
			System.out.println("Zaposleni nije uspesno dodat");
			return false;
		}else {
			System.out.println("Zaposleni uspesno  dodat");
			return true;
		}
	}
}
