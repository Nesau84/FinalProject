package rs.itbootcamp.humanity.page.tests;

import org.openqa.selenium.WebDriver;

public class HumanityLoginTests {

	private static final String URL_TESTING = "https://neko.humanity.com/app/dashboard/";
		
	
	public static boolean testLogin(WebDriver driver) {
		String url = driver.getCurrentUrl();
		if (url.equals(URL_TESTING)) {
			System.out.println("Korisnik je ulogovan");
			return true;
		} else {
			System.out.println("Korisnik nije ulogovan" );
		
			return false;
		}
	}
	}
	

