package  com.pncbank.qa.stepdefinations;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.pncbank.qa.factory.DriverFactory;
import com.pncbank.qa.pages.EnrollmentPage;


public class EnrollmentPageDefination {

	private EnrollmentPage enrollmentPage = new EnrollmentPage(DriverFactory.getDriver());
	private WebDriver driver;



	@Then("Verify that the user is on the enrollment page")
	public void verify_that_the_user_is_on_the_enrollment_page() {
		

		assertEquals("VERIFY-YOUR IDENTITY | FIRST-TIME-USER | PNC", enrollmentPage.getTitleForEnrollement());

	}

	@When("User selects the SSN radio button and enters the PAN Account Number {string}")
	public void user_selects_the_ssn_radio_button_and_enters_the_pan_account_number_details(String ssn) throws InterruptedException {
		enrollmentPage.checkSSNChkBox();
		enrollmentPage.inputDataSSNField(ssn);

	}

	@When("User selects the Online Access PIN radio button and enters the online access pin {string}")
	public void user_selects_the_OnlineAccesspin_radio_button_and_enters_the_OnlineAccess_pin(
			String onlineAccessPin) {
		enrollmentPage.checkOnlineAccessPinRadioBtn();
		enrollmentPage.inputOnlineAccessPin(onlineAccessPin);
	}
	
	@When("User selects the PNC Debit Card PIN radio button and enters the PNC debit card pin {string}")
	public void user_selects_the_pnc_debit_card_pin_radio_button_and_enters_the_pnc_debit_card_pin(
			String debitCardPin) {
		enrollmentPage.checkpncDebPinRadioBtn();
		enrollmentPage.inputDataPanNum(debitCardPin);
	}

	@When("User clicks on the next button")
	public void user_clicks_on_the_next_button() {
		enrollmentPage.clicknextBtn();
	}

	@Then("Verify that the application shows an appropriate warning message on the UI")
	public void verify_that_the_application_shows_an_appropriate_warning_message_on_the_ui() {
		List<String> lst = new ArrayList<String>();

		String warning = "We don't recognize your information.";
		System.out.println(enrollmentPage.getWarningMsg());
		lst.add(enrollmentPage.getWarningMsg());
		boolean checkWarning= lst.get(0).contains(warning);

		assertTrue("Unable to validate warning Message", checkWarning);

	}
	
	@When("User enters the PAN Account Number {string}")
	public void user_enters_the_pan_account_number(String panNum) {
		enrollmentPage.inputPncAccntNumOrPanNumber(panNum);
	}

	@When("User selects the PNC Online and Voice Banking User ID radio button and enters the PNC Online and voice Banking userid {string}")
	public void user_selects_the_pnc_onlineVoiceBanking_UserID_radio_button_and_enters_the_pnc_debit_card_pin(
			String PNCVoiceBankId) {
		enrollmentPage.checkpncOnlineVoiceBankingUserIdRadioBtn();
		enrollmentPage.inputDataSSNField(PNCVoiceBankId);
	}

}
