package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityProfile {

	private static final String CLICK_PROFILE_PICTURE_XPATH ="//img[@id='tr_avatar']";
	private static final String PROFILE_XPATH = "//a[contains(text(),'Profile')]";
	private static final String SETTINGS_XPATH ="//div[@class='userm userm-mainPage']//a[contains(text(),'Settings')]";
	private static final String AVAILABILITY_XPATH ="//div[@class='userm userm-mainPage']//a[contains(text(),'Availability')]";
	private static final String SIGN_OUT_XPATH ="//a[contains(text(),'Sign Out')]";
	private static final String VERSION_XPATH ="//div[@id='humanityAppVersion']";
	
	public static WebElement getProfilePicture(WebDriver driver) {
		return driver.findElement(By.xpath(CLICK_PROFILE_PICTURE_XPATH));
	}
	public static void clickProfilePicture(WebDriver driver) {
		getProfilePicture(driver).click();
	}
	public static WebElement getProfile(WebDriver driver) {
		return driver.findElement(By.xpath(PROFILE_XPATH));
	}
	public static void clickProfile(WebDriver driver) {
		getProfile(driver).click();
	}
	public static WebElement getSettings(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS_XPATH));
	}
	public static void clickSettings(WebDriver driver) {
		getSettings(driver).click();
	}
	public static WebElement getAvailability(WebDriver driver) {
		return driver.findElement(By.xpath(AVAILABILITY_XPATH));
	}
	public static void clickAvailability(WebDriver driver) {
		getAvailability(driver).click();
	}
	public static WebElement getSignOut(WebDriver driver) {
		return driver.findElement(By.xpath(SIGN_OUT_XPATH));
	}
	public static void clickSignOut(WebDriver driver) {
		getSignOut(driver).click();

	}
	public static WebElement getVerzija(WebDriver driver) {
		return driver.findElement(By.xpath(VERSION_XPATH));
	}
	public static void printVerzija(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(VERSION_XPATH));
		String s = we.getText();
		System.out.println(s);
	}
	}
	
	
	
	

