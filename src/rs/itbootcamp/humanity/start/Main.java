package rs.itbootcamp.humanity.start;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import rs.itbootcamp.utility.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityEditDetails;
import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityProfile;
import rs.itbootcamp.humanity.page.objects.HumanitySettings;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;
import rs.itbootcamp.humanity.page.tests.HumanityAddNewEmployeeTests;
import rs.itbootcamp.humanity.page.tests.HumanityLoginTests;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		int n;
		String URL = "https://www.humanity.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		do {
			System.out.println("Odaberite broj za zeljene radnje na sajtu Humanity.com");
			
			System.out.println("0 - ovaj izbor je za izlazak iz programa");
			System.out.println("1 - za log-in na sajt i dodavanje zaposlenog, takodje ce se tesitrati da li je uspesno dodat zaposleni i log-in");
			System.out.println("2 - za promenu podesavanja korisnickog naloga: drzave, vremenske zone i jezika na sajtu");
			System.out.println("3 - za ispis trenutne verzije humanity aplikacije koja se koristi");
			System.out.println("4 - za dodavanje slike zaposlenom");
			System.out.println("5 - za log-in, i dodavanje zaposlenih iz Excell tabele");
			n = sc.nextInt();
			switch (n) {
			case 0:
				System.out.println("Izabrali ste broj 0, program se zavrsava!");
				break;

			case 1:
				System.out.println("Izabrali ste broj 1, program ce se autoamtski logovati na sajt i dodati jednog zaposlenog");
				System.out.println("U zavisnosti da li je logovanje i dodavanje uspesno ili neuspesno ispisace se odgovarajuca poruka");
				driver.get(URL);
				HumanityHome.clickLogin(driver);
				HumanityHome.clickUsername(driver);
				HumanityHome.inputUsername(driver, "sehovepak@web-inc.net");
				HumanityHome.clickPassword(driver);
				HumanityHome.inputPassword(driver, "asdzxc");
				HumanityHome.clickLogedIn(driver);
				Thread.sleep(5000);
				HumanityLoginTests.testLogin(driver);

				HumanityStaff.clickStaff(driver);
				HumanityStaff.clickAddEmployees(driver);
				Thread.sleep(3000);
				
				HumanityStaff.clickFirstName(driver);
				HumanityStaff.inputFirstName(driver, "Dusann");
				HumanityStaff.clickLastName(driver);
				HumanityStaff.inputLastName(driver, "Bobicicx");
				HumanityStaff.clickEmail(driver);
				HumanityStaff.inputEmail(driver, "BbobwDuleence@gmail.com");

				HumanityStaff.clickSaveEmployee(driver);
				HumanityAddNewEmployeeTests.testAddEmployee(driver);

				Thread.sleep(3000);
				break;

			case 2:
				System.out.println("Izabrali ste broj 2, program ce izmeniti korisnicka podesavanja, drzavu, vremensku zonu, jezik");
				driver.get(URL);
				HumanityHome.clickLogin(driver);
				HumanityHome.clickUsername(driver);
				HumanityHome.inputUsername(driver, "sehovepak@web-inc.net");
				HumanityHome.clickPassword(driver);
				HumanityHome.inputPassword(driver, "asdzxc");
				HumanityHome.clickLogedIn(driver);
				Thread.sleep(5000);
				HumanitySettings.clickSettings(driver);
				HumanitySettings.selectCountry(driver, "Portugal");
				HumanitySettings.selectLanguage(driver, "Arabic (machine)");
				HumanitySettings.selectTime(driver, "24 hour");
				HumanitySettings.clickSaveSettings(driver);

				Thread.sleep(3000);
				break;

			case 3:
				System.out.println("Izabrali ste broj 3, program ispisuje trenutnu verziju aplikacije Humanity.app");
				driver.get(URL);
				HumanityHome.clickLogin(driver);
				HumanityHome.clickUsername(driver);
				HumanityHome.inputUsername(driver, "sehovepak@web-inc.net");
				HumanityHome.clickPassword(driver);
				HumanityHome.inputPassword(driver, "asdzxc");
				HumanityHome.clickLogedIn(driver);

				HumanityProfile.clickProfilePicture(driver);
				HumanityProfile.printVerzija(driver);

				Thread.sleep(2000);
				break;

			case 4:
				System.out.println("Izabrali ste broj 4, dodavanje slike zaposlenom!");
				driver.get(URL);
				HumanityHome.clickLogin(driver);
				HumanityHome.clickUsername(driver);
				HumanityHome.inputUsername(driver, "sehovepak@web-inc.net");
				HumanityHome.clickPassword(driver);
				HumanityHome.inputPassword(driver, "asdzxc");
				HumanityHome.clickLogedIn(driver);
				Thread.sleep(2000);
				HumanityStaff.clickStaff(driver);
				HumanityEditDetails.clickAllStaff(driver);
				HumanityEditDetails.clickStaffMember(driver);
				HumanityEditDetails.clickDetails(driver);
				String xpTHSLIKA = "//input[@id='fileupload']";
				String putanja = "C:\\Users\\User\\Desktop\\APACHE POI LIB\\download.jpg";
				String url = "https://neko.humanity.com/app/staff/edit/5093475/";
				driver.get(url);
				WebElement choosefile = driver.findElement(By.xpath(xpTHSLIKA));
				choosefile.sendKeys(putanja);
				HumanityEditDetails.clickSaveEmployee(driver);

				Thread.sleep(3000);
				break;

			case 5:
				System.out.println(
						"Izabrali ste broj 5, program ce se automatski log-in i dodati zaposlene koristeci Excell fajl");
				driver.get(URL);
				HumanityHome.clickLogin(driver);

				String DATA_SOURCE = "Data.xls";
				ExcelUtils.setExcell(DATA_SOURCE);
				ExcelUtils.setWorkSheet("Login");

				String email, passwordd;
				email = ExcelUtils.getDataAt(1, 0);
				passwordd = ExcelUtils.getDataAt(1, 1);

				HumanityHome.inputUsername(driver, email);
				HumanityHome.inputPassword(driver, passwordd);
				HumanityHome.clickLogedIn(driver);
				
				

				HumanityStaff.clickStaff(driver);
				String DATA = "Data.xls";
				ExcelUtils.setExcell(DATA);
				ExcelUtils.setWorkSheet("Zaposleni");

				for (int i = 1; i < ExcelUtils.getRowNumber(); i++) {
					String ime = ExcelUtils.getDataAt(i, 0);
					String prezime = ExcelUtils.getDataAt(i, 1);
					String emaill = ExcelUtils.getDataAt(i, 2);
					
					HumanityStaff.inputFirstName(driver, ime);
					HumanityStaff.inputLastName(driver, prezime);
					HumanityStaff.inputEmail(driver, emaill);
					HumanityStaff.clickSaveEmployee(driver);
					Thread.sleep(5000);
					HumanityStaff.clickAddEmployees(driver);
					break;
				
				}
			default: System.out.println("Pogresan unos, dozvoljeni unosi su brojevi od 0 do 5");

			}

		} while (n != 0);

		

		Thread.sleep(5000);
		driver.quit();
	}

}
