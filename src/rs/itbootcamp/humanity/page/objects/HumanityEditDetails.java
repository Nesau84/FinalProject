package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityEditDetails {

	private static final String CLICK_ALLSTAFF_XPATH = "//a[contains(@class,'mi first mitem dent')]";
	private static final String CLICK_STAFF_MEMBER_XPATH = "//tr[2]//td[2]//a[1]";
	private static final String EDIT_DETAILS_XPATH = "//a[contains(text(),'Edit Details')]";
	private static final String NICKNAME_XPATH = "//input[@id='nick_name']";
	private static final String SAVE_EMPLOYEE_XPATH = "//button[@id='act_primary']";

	public static WebElement getAllStaff(WebDriver driver) {
		return driver.findElement(By.xpath(CLICK_ALLSTAFF_XPATH));
	}

	public static void clickAllStaff(WebDriver driver) {
		getAllStaff(driver).click();
	}

	public static WebElement getStaffMember(WebDriver driver) {
		return driver.findElement(By.xpath(CLICK_STAFF_MEMBER_XPATH));
	}

	public static void clickStaffMember(WebDriver driver) {
		getStaffMember(driver).click();
	}

	public static WebElement getDetails(WebDriver driver) {
		return driver.findElement(By.xpath(EDIT_DETAILS_XPATH));
	}

	public static void clickDetails(WebDriver driver) {
		getDetails(driver).click();
	}
	public static WebElement getNickname(WebDriver driver) {
		return driver.findElement(By.xpath(NICKNAME_XPATH));
	}
	public static void clickNickname(WebDriver driver) {
		getNickname(driver).click();
	}
	public static void inputNickname(WebDriver driver, String nickname) {
		getNickname(driver).sendKeys(nickname);
	}
	public static WebElement getSaveEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_EMPLOYEE_XPATH));
	}
	public static void clickSaveEmployee(WebDriver driver) {
		getSaveEmployee(driver).click();
	}
}
