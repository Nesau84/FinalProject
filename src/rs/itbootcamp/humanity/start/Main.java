package rs.itbootcamp.humanity.start;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityEditDetails;
import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;
import rs.itbootcamp.humanity.page.tests.HumanityAddNewEmployeeTests;
import rs.itbootcamp.humanity.page.tests.HumanityLoginTests;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		String URL ="https://www.humanity.com/";
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
		HumanityAddNewEmployeeTests.testAddEmployee(driver);
		HumanityStaff.clickFirstName(driver);
		HumanityStaff.inputFirstName(driver, "Dusann");
		HumanityStaff.clickLastName(driver);
		HumanityStaff.inputLastName(driver, "Bobicicx");
		HumanityStaff.clickEmail(driver);
		HumanityStaff.inputEmail(driver, "Bobinatorr@gmail.com");
		HumanityStaff.clickSaveEmployee(driver);
		
		HumanityEditDetails.clickAllStaff(driver);
		HumanityEditDetails.clickStaffMember(driver);
		HumanityEditDetails.clickDetails(driver);
		
		
	
		
		String xpTHSLIKA="//input[@id='fileupload']";
		String putanja="C:\\Users\\User\\Desktop\\APACHE POI LIB\\download.jpg";
		String url = "https://neko.humanity.com/app/staff/edit/5093475/";
		driver.get(url);
		WebElement choosefile = driver.findElement(By.xpath(xpTHSLIKA));
		choosefile.sendKeys(putanja);
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
