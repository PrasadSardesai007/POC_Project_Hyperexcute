package com.pncbank.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnrollmentPage {

	private By selectSSNRadioBtn = By.xpath("//input[@id='test-wod-radio-button-0-input']");
	private By ssnInputField = By.cssSelector("#test-required-id");
	private By pncOnlineVoiceBankingUserIdRadioBtn = By.cssSelector("#test-wod-radio-button-3-input");
	private By acntInfoPanNumField = By.cssSelector("input[id='test-required-accountnumber-password-id']");
	private By pncDebPinRadioBtn = By.cssSelector("#test-multiple-label-radio-button2-0-input");
	private By onlineAccessPinRadioBtn = By.cssSelector("#test-multiple-label-radio-button2-1-input");

	private By pncAcctNumOrPanNum = By.cssSelector("input[id='test-required-accountnumber-password-id']");
	private By debitCardPinField = By.cssSelector("#test-required-debit-card-pin-password-id");
	private By onlineAccessPin = By.cssSelector("#test-required-online-access-pin-password-id");

	private By nextBtn = By.cssSelector("#next-button-id");
	private By warningMsg = By.cssSelector("div[class='wbb-notification-body-wrapper']");

	// #test-required-id

	private WebDriver driver;
	private WebDriverWait wait;

	public EnrollmentPage(WebDriver driver) {
		this.driver = driver;

	}

	public void checkSSNChkBox() {

		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement element = driver.findElement(selectSSNRadioBtn);
		// Scroll to the top of the page using JavaScript
		// Scroll to a specific element using JavaScript

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		// element.submit();

		// Use explicit wait to wait for the element to be clickable
		// wait.until(ExpectedConditions.(element)).
		// element.sendKeys(Keys.ENTER);

	}

	public void checkpncOnlineVoiceBankingUserIdRadioBtn() {

		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement element = driver.findElement(pncOnlineVoiceBankingUserIdRadioBtn);
		// Scroll to the top of the page using JavaScript
		// Scroll to a specific element using JavaScript

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);

	}

	public void checkpncDebPinRadioBtn() {

		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement element = driver.findElement(pncDebPinRadioBtn);
		// Scroll to the top of the page using JavaScript
		// Scroll to a specific element using JavaScript

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);

	}

	public void checkOnlineAccessPinRadioBtn() {

		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement element = driver.findElement(onlineAccessPinRadioBtn);
		// Scroll to the top of the page using JavaScript
		// Scroll to a specific element using JavaScript

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);

	}

	public void inputDataSSNField(String ssn) {

		driver.findElement(ssnInputField).sendKeys(ssn);

	}

	public void inputDataPanNum(String panNum) {

		driver.findElement(acntInfoPanNumField).sendKeys(panNum);

	}

	public void inputPncAccntNumOrPanNumber(String panNumOrPan) {

		driver.findElement(pncAcctNumOrPanNum).sendKeys(panNumOrPan);

	}

	public void inputOnlineAccessPin(String panNumOrPan) {

		driver.findElement(onlineAccessPin).sendKeys(panNumOrPan);

	}

	public String getTitleForEnrollement() {
		return driver.getTitle();
	}

	public void clicknextBtn() {
		driver.findElement(nextBtn).click();
	}

	public String getWarningMsg() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(warningMsg));
		WebElement element = driver.findElement(warningMsg);
		return element.getText();

	}

}
