package rs.itbootcamp.humanity.start;

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
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		String URL = "https://www.humanity.com/";
		driver.get(URL);

		HumanityHome.clickLogin(driver);
		String DATA_SOURCE = "Data.xls";
		ExcelUtils.setExcell(DATA_SOURCE);
		ExcelUtils.setWorkSheet("Login");
		

		String email, passwordd;
		email = ExcelUtils.getDataAt(1, 0);
		passwordd = ExcelUtils.getDataAt(1, 1);
		
		HumanityHome.clickUsername(driver);
		HumanityHome.inputUsername(driver, email);
		HumanityHome.clickPassword(driver);
		HumanityHome.inputPassword(driver, passwordd);
		HumanityHome.clickLogedIn(driver);
	
		
		
		
		String DATA = "Data.xls";
		ExcelUtils.setExcell(DATA);
		ExcelUtils.setWorkSheet("Zaposleni");
		String ime, prezime, emaill;
		ime = ExcelUtils.getDataAt(1,0);
		prezime = ExcelUtils.getDataAt(1, 1);
		emaill = ExcelUtils.getDataAt(1, 2);
		for(int i = 0;i<ExcelUtils.getRowNumber();i++) {
			
			//ulaaz na dodavanje
			
			ExcelUtils.getDataAt(i,0);
			ExcelUtils.setDataAt(i, 0, ime);
			ExcelUtils.getDataAt(i, 1);
			ExcelUtils.setDataAt(i, 1, prezime);
			ExcelUtils.getDataAt(i, 2);
			ExcelUtils.setDataAt(i, 2, emaill);
			
			
		//klik save
		}
		
		

		
		  HumanityHome.clickUsername(driver); 
		  HumanityHome.inputUsername(driver,"sehovepak@web-inc.net");
		   HumanityHome.clickPassword(driver);
		  HumanityHome.inputPassword(driver, "asdzxc");
		  HumanityHome.clickLogedIn(driver); Thread.sleep(5000);
		  HumanityLoginTests.testLogin(driver);
		  
		  HumanitySettings.clickSettings(driver);
		  HumanitySettings.selectCountry(driver, "Portugal");
		  HumanitySettings.selectLanguage(driver, "Arabic (machine)");
		  HumanitySettings.selectTime(driver, "24 hour");
		  
		   HumanityStaff.clickStaff(driver); 
		   HumanityStaff.clickAddEmployees(driver);
		  HumanityAddNewEmployeeTests.testAddEmployee(driver);
		  HumanityStaff.clickFirstName(driver);
		  HumanityStaff.inputFirstName(driver, "Dusann"); 
		 HumanityStaff.clickLastName(driver);
		  HumanityStaff.inputLastName(driver, "Bobicicx");
		  HumanityStaff.clickEmail(driver);
		  HumanityStaff.inputEmail(driver,"Bobinatorr@gmail.com");
		   
		  HumanityStaff.clickSaveEmployee(driver);
		  
		  HumanityProfile.clickProfilePicture(driver);
		  HumanityProfile.printVerzija(driver);
		 

		/*
		 * HumanityEditDetails.clickAllStaff(driver);
		 * HumanityEditDetails.clickStaffMember(driver);
		 * HumanityEditDetails.clickDetails(driver);
		 * HumanityEditDetails.clickNickname(driver);
		 * HumanityEditDetails.inputNickname(driver, "Bobko");
		 * HumanityEditDetails.clickSaveEmployee(driver);
		 * 
		 * 
		 * 
		 * 
		 * String xpTHSLIKA="//input[@id='fileupload']"; String
		 * putanja="C:\\Users\\User\\Desktop\\APACHE POI LIB\\download.jpg"; String url
		 * = "https://neko.humanity.com/app/staff/edit/5093475/"; driver.get(url);
		 * WebElement choosefile = driver.findElement(By.xpath(xpTHSLIKA));
		 * choosefile.sendKeys(putanja);
		 * 
		 */

		Thread.sleep(5000);
		driver.quit();
	}

}
