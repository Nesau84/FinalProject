package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityEditDetails {

	private static final String CLICK_ALLSTAFF_XPATH = "//a[@class='mi first mitem']";
	private static final String CLICK_STAFF_MEMBER_XPATH = "//a[contains(text(),'Duki duca')]";
	private static final String EDIT_DETAILS_XPATH = "//a[contains(text(),'Edit Details')]";

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
}
