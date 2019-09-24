package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityMenu {

	private static final String DASHBOARD_XPATH = "//a[@id='sn_dashboard']//span[@class='primNavQtip__inner']";
	private static final String SHIFTPLANNING_XPATH = "//i[@class='primNavQtip__icon icon-shiftPlanning']";
	private static final String CLOCK_XPATH = "//a[@id='sn_timeclock']//span[@class='primNavQtip__inner']";
	private static final String LEAVE_XPATH = "//a[@id='sn_requests']//span[@class='primNavQtip__inner']";
	private static final String TRAINING_XPATH = "//a[@id='sn_training']//span[@class='primNavQtip__inner']";
	private static final String STAFF_XPATH = "//a[@id='sn_staff']//span[@class='primNavQtip__inner']";
	private static final String PAYROLL_XPATH = "//i[@class='primNavQtip__icon icon-payroll']";
	private static final String REPORTS_XPATH = "//a[@id='sn_reports']//span[@class='primNavQtip__inner']";
	
	
	public static WebElement getDashBoard(WebDriver driver) {
		return driver.findElement(By.xpath(DASHBOARD_XPATH));

	}

	public static void clickDashBoard(WebDriver driver) {
		getDashBoard(driver).click();
	}

	public static WebElement getShift(WebDriver driver) {
		return driver.findElement(By.xpath(SHIFTPLANNING_XPATH));
	}

	public static void clickShift(WebDriver driver) {
		getShift(driver).click();
	}

	public static WebElement getClock(WebDriver driver) {
		return driver.findElement(By.xpath(CLOCK_XPATH));
	}

	public static void clickClock(WebDriver driver) {
		getClock(driver).click();
	}

	public static WebElement getLeave(WebDriver driver) {
		return driver.findElement(By.xpath(LEAVE_XPATH));
	}

	public static void clickLeave(WebDriver driver) {
		getLeave(driver).click();
	}

	public static WebElement getTraining(WebDriver driver) {
		return driver.findElement(By.xpath(TRAINING_XPATH));
	}

	public static void clickTraining(WebDriver driver) {
		getTraining(driver).click();
	}

	public static WebElement getStaff(WebDriver driver) {
		return driver.findElement(By.xpath(STAFF_XPATH));
	}

	public static void clickStaff(WebDriver driver) {
		getStaff(driver).click();
	}

	public static WebElement getPayroll(WebDriver driver) {
		return driver.findElement(By.xpath(PAYROLL_XPATH));
	}

	public static void clickPayroll(WebDriver driver) {
		getPayroll(driver).click();
	}

	public static WebElement getReports(WebDriver driver) {
		return driver.findElement(By.xpath(REPORTS_XPATH));
	}

	public static void clickReports(WebDriver driver) {
		getReports(driver).click();
	}
	
}
