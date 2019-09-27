package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityStaff {
	private static final String STAFF_XPATH = "//a[@id='sn_staff']//span[@class='primNavQtip__inner']";
	private static final String ADD_EMPLOYEES_XPATH = "//button[@id='act_primary']";
	private static final String FIRST_NAME_XPATH = "//input[@id='_asf1']";
	private static final String LAST_NAME_XPATH = "//input[@id='_asl1']";
	private static final String EMAIL_XPATH = "//input[@id='_ase1']";
	private static final String SAVE_EMPLOYEE_XPATH = "//button[@id='_as_save_multiple']";

	public static WebElement getStaff(WebDriver driver) {
		return driver.findElement(By.xpath(STAFF_XPATH));
	}

	public static void clickStaff(WebDriver driver) {
		getStaff(driver).click();
	}

	public static WebElement getAddEmployees(WebDriver driver) {
		return driver.findElement(By.xpath(ADD_EMPLOYEES_XPATH));
	}

	public static void clickAddEmployees(WebDriver driver) {
		getAddEmployees(driver).click();
	}

	public static WebElement getFirstName(WebDriver driver) {
		return driver.findElement(By.xpath(FIRST_NAME_XPATH));
	}

	public static void clickFirstName(WebDriver driver) {
		getFirstName(driver).click();
	}

	public static void inputFirstName(WebDriver driver, String firstname) {
		getFirstName(driver).sendKeys(firstname);
	}

	public static WebElement getLastName(WebDriver driver) {
		return driver.findElement(By.xpath(LAST_NAME_XPATH));
	}

	public static void clickLastName(WebDriver driver) {
		getLastName(driver).click();
	}

	public static void inputLastName(WebDriver driver, String lastname) {
		getLastName(driver).sendKeys(lastname);
	}

	public static WebElement getEmail(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL_XPATH));
	}

	public static void clickEmail(WebDriver driver) {
		getEmail(driver).click();
	}

	public static void inputEmail(WebDriver driver, String email) {
		getEmail(driver).sendKeys(email);
	}

	public static WebElement getSaveEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_EMPLOYEE_XPATH));
	}

	public static void clickSaveEmployee(WebDriver driver) {
		getSaveEmployee(driver).click();

}
	
}
