package com.pncbank.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginnPage {

	// public WebDriver driver;

	private By personal = By.xpath("//span[text()= 'Personal']");
	private By singOnBtn = By.xpath(
			"//div[@id='experiencefragment-1274a8fe20']/div/div/div[@class='button cmp-button--login aem-GridColumn aem-GridColumn--default--12']/button[@id='button-65ead6b2c8']");

	private By userID = By.xpath(
			"//div[@class='cmp-login cmp-container__flyout show']/div//div[@class='cmp-login__section cmp-login__section-main show']/form/div//div[@class='aem-GridColumn aem-GridColumn--default--8']/div//div[@name='userIdInput']//input[@name='userId']");
	private By passwordEle = By.xpath(
			"//div[@class='cmp-login cmp-container__flyout show']/div//div[@class='cmp-login__section cmp-login__section-main show']/form/div//div[@class='aem-GridColumn aem-GridColumn--default--8']/div//div[@name='password']//input[@name='password']");
	private By logInBtn = By.xpath(
			"//div[@data-cid='dc-psa3z8hwyagpf7gau6slyf5f7']/div/div[@class='cmp-login__section cmp-login__section-main show']/form/div//div[@class='aem-GridColumn aem-GridColumn--default--4']/div//input[@value='Login']");

	private By warningMsg = By.xpath("//h3[text()='Incorrect user ID or password']");
	private By warningMsg2 = By.xpath("//div[@id='error']");

	private By enrollInOnlineBanking = By.linkText("Enroll In Online Banking");

	private WebDriver driver;
	public WebDriverWait waits;

	public LoginnPage(WebDriver driver) {
		this.driver = driver;

	}

	/*
	 * public WebDriver initializeDriver () { driver = new ChromeDriver();
	 * System.getProperty("webdriver.chrome.driver",
	 * "src/test/java/alv/resources/chromedriver.exe");
	 * 
	 * return this.driver = driver; }
	 */

	// Click on Personal link
	public void clickOnPersonalTab() {

		driver.findElement(personal).click();

	}

	// Click on Sign On button link
	public void clickOnSignOnBtn() {

		driver.findElement(singOnBtn).click();

	}

	// Enter User ID
	public void enterUserID(String username) {

		driver.findElement(userID).sendKeys(username);
	}

	// Enters password
	public void enterPassword(String password) {

		driver.findElement(passwordEle).sendKeys(password);
	}

	// CLick on Log In button
	public void clickOnLogInBtn() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(logInBtn).click();
	}

	public String getWarningMsg() {
		return driver.findElement(warningMsg2).getText();
		// return driver.findElement(warningMsg).getText();
	}

	public void clickOnenrollInOnlineBanking() {
		try {
			Thread.sleep(5000);
			driver.findElement(enrollInOnlineBanking).click();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// waits = new WebDriverWait(driver,Duration.ofSeconds(5));
		// waits.until(ExpectedConditions.visibilityOfElementLocated(enrollInOnlineBanking)).click();

	}

}
