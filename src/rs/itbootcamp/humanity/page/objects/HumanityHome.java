package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityHome {

	private static final String LOGIN_XPATH = "//p[contains(text(),'LOGIN')]";
	private static final String USERNAME_XPATH = "//input[@id='email']";
	private static final String PASSWORD_XPATH = "//input[@id='password']";
	private static final String GET_LOGIN_XPATH = "//button[contains(text(),'Log in')]";
	private static final String ABOUT_US_XPATH = "//a[@class='nav-link no-before'][contains(text(),'About us')]";
	private static final String FULL_NAME_XPATH = "//div[@class='input-wrapper']//input[@placeholder='Full Name']";
	private static final String FULL_EMAIL_XPATH = "//div[@class='input-wrapper']//input[@placeholder='Work Email']";
	private static final String START_FREE_TRIAL_XPATH = "//input[@id='free-trial-link-01']";
	

	public static WebElement getLogin(WebDriver driver) {
		return driver.findElement(By.xpath(LOGIN_XPATH));
	}

	public static void clickLogin(WebDriver driver) {
		getLogin(driver).click();
	}

	public static WebElement getUsername(WebDriver driver) {
		return driver.findElement(By.xpath(USERNAME_XPATH));
	}

	public static void clickUsername(WebDriver driver) {
		getUsername(driver).click();
	}

	public static void inputUsername(WebDriver driver, String name) {
		getUsername(driver).sendKeys(name);
	}

	public static WebElement getPassword(WebDriver driver) {
		return driver.findElement(By.xpath(PASSWORD_XPATH));
	}

	public static void clickPassword(WebDriver driver) {
		getPassword(driver).click();
	}

	public static void inputPassword(WebDriver driver, String password) {
		getPassword(driver).sendKeys(password);
	}

	public static WebElement getLogedIn(WebDriver driver) {
		return driver.findElement(By.xpath(GET_LOGIN_XPATH));
	}

	public static void clickLogedIn(WebDriver driver) {
		getLogedIn(driver).click();
	}

	public static WebElement getAboutUs(WebDriver driver) {
		return driver.findElement(By.xpath(ABOUT_US_XPATH));
	}

	public static void clickAboutUs(WebDriver driver) {
		getAboutUs(driver).click();
	}

	public static WebElement getFullName(WebDriver driver) {
		return driver.findElement(By.xpath(FULL_NAME_XPATH));
	}

	public static void clickFullName(WebDriver driver) {
		getFullName(driver).click();
	}

	public static void inputFullName(WebDriver driver, String fullname) {
		getFullName(driver).sendKeys(fullname);
	}

	public static WebElement getFullEmail(WebDriver driver) {
		return driver.findElement(By.xpath(FULL_EMAIL_XPATH));
	}

	public static void clickFullMail(WebDriver driver) {
		getFullEmail(driver).click();
	}

	public static void inputFullMail(WebDriver driver, String fullmail) {
		getFullEmail(driver).sendKeys(fullmail);
	}

	public static WebElement getFreeTrial(WebDriver driver) {
		return driver.findElement(By.xpath(START_FREE_TRIAL_XPATH));
	}

	public static void clickFreeTrial(WebDriver driver) {
		getFreeTrial(driver).click();
	}

	
}
