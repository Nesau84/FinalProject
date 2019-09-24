package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HumanitySettings {
	private static final String SETTINGS_XPATH = "//i[@class='primNavQtip__icon icon-gear']";
	private static final String SELECT_COUNTRY_XPATH = "//select[@id='country']";
	private static final String DEFAULT_LANGUAGE_XPATH = "//td[@class='nowrap']//select[@name='language']";
	private static final String TIMEFORMAT_XPATH ="//select[@name='pref_24hr']";
	
	public static WebElement getSettings(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS_XPATH));
		
	}
	public static void clickSettings(WebDriver driver) {
		getSettings(driver).click();
	}
	public static Select getCountry(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(SELECT_COUNTRY_XPATH)));
	}
	public static void selectCountry(WebDriver driver, String country){
		getCountry(driver).selectByVisibleText(country);
	}
	
	public static Select getLanguage(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(DEFAULT_LANGUAGE_XPATH)));
	}
	public static void selectLanguage(WebDriver driver, String language) {
		getLanguage(driver).selectByVisibleText(language);
	}
	public static Select getTimeFormat(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(TIMEFORMAT_XPATH)));
	}
	public static void selectTime(WebDriver driver, String time) {
		getTimeFormat(driver).selectByVisibleText(time);
	}
}
