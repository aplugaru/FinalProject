package org.example;

import PageObjects.*;
import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StepDefinitions {

    private WebDriver driver;
    ChromeOptions options = new ChromeOptions ();
    MainPage mainPage;
    SignUpForTheSoftwareTestingCoursePage signUpPageForTheSoftwareTestingCoursePage;
    ContactInformation contactInformation;
    CourseOptions courseOptions;
    PaymentInformation paymentInformation;
    SuccessPage successPage;


    public StepDefinitions() {
        options.addArguments ( "--remote-allow-origins=*" );
        driver = new ChromeDriver ( options );
        driver.manage ().window ().maximize ();
        mainPage = new MainPage ( driver );
        signUpPageForTheSoftwareTestingCoursePage = new SignUpForTheSoftwareTestingCoursePage ( driver );
        contactInformation = new ContactInformation ( driver );
        courseOptions = new CourseOptions (driver);
        paymentInformation = new PaymentInformation(driver);
        successPage = new SuccessPage(driver);
    }

    @Given("I am on the main page")
    public void i_am_on_the_main_page() {
        driver.get ( "file:///C:/Users/andre/AppData/Local/Temp/Rar$EXa15012.33173/Testing-Env-master/index.html" );
    }

    @Given("I am on the Sign Up page")
    public void i_am_on_the_sign_up_page() {
        driver.get ( "file:///C:/Users/andre/Desktop/AZIMUT/Testing-Env-master/routes/enrollment.html");
    }

    @Given("I am on the contact information page")
    public void i_am_on_the_contact_information_page() {
        driver.get ( "file:///C:/Users/andre/AppData/Local/Temp/Rar$EXa20640.18222/Testing-Env-master/routes/enrollment.html");
        signUpPageForTheSoftwareTestingCoursePage.fillInPersonalInformation();
    }
    @Given("I am on the course options page")
    public void i_am_on_the_course_options_page() {
        driver.get ("file:///C:/Users/andre/AppData/Local/Temp/Rar$EXa20640.18222/Testing-Env-master/routes/enrollment.html");
        signUpPageForTheSoftwareTestingCoursePage.fillInPersonalInformation ();
        contactInformation.fillInContactInformation();
    }

    @Given ("I am on the payment information page")
    public void i_am_on_the_payment_information_page() {
        driver.get ("file:///C:/Users/andre/AppData/Local/Temp/Rar$EXa15012.33173/Testing-Env-master/routes/enrollment.html");
        signUpPageForTheSoftwareTestingCoursePage.fillInPersonalInformation();
        contactInformation.fillInContactInformation();
        courseOptions.selectCourseOptions();
    }

    @Given ("I am on the success page")
    public void i_am_on_the_success_page() {
        driver.get ("file:///C:/Users/andre/AppData/Local/Temp/Rar$EXa15012.33173/Testing-Env-master/routes/enrollment.html");
        signUpPageForTheSoftwareTestingCoursePage.fillInPersonalInformation();
        contactInformation.fillInContactInformation();
        courseOptions.selectCourseOptions();
        paymentInformation.inputPaymentInformationDetails();
       }


    @When("the email value of {string} is inputted")
    public void input_email_to_field(String string) {
        mainPage.inputValueInEmailField (string);
    }

    @When("the submit button is clicked")
    public void click_submit_button() {
        mainPage.clickOnSubmitButton ();
    }

    @When("the what you'll learn button is clicked")
    public void click_what_youll_learn_button() {
        mainPage.clickOnWhatYoullLearnButton();
    }

    @When("the Start Enrollment Button is clicked")
    public void click_start_enrollment_button() {
        mainPage.clickOnStartEnrollmentButton();
    }

    @When("the first name value of {string} is inputted")
    public void input_first_name_to_field(String string) {
        signUpPageForTheSoftwareTestingCoursePage.inputValueInFirstNameField( string );
    }

    @When("the email value on contact information page of {string} is inputted")
    public void input_email_on_contact_information_page_to_field(String string) {
        contactInformation.inputValueInEmailFieldOnContactInformationPage( string );
    }

    @When ("the button for Software Testing-Manual tester certificate is clicked")
    public void click_on_button_software_testing_manual_tester_certificate() {
        courseOptions.clickButtonSoftwareTestingManualTesterCertificate();
    }

    @When ("the card holder name of {string} is inputted")
    public void input_card_holder_name_to_field(String string) {
        paymentInformation.inputValueInCardHolderName (string);
    }



    @When("the questions button is clicked")
    public void click_on_questions_button() {mainPage.clickOnQuestionsButton();}

    @And ("the button scrolls down to {string} section")
    public void clickOnWhatYoullLearnButton(String string) {
        Assertions.assertEquals(string, mainPage.getFundamentalsText ());
    }
    @And ("the learn the fundamentals read more button is clicked")
    public void click_learn_the_fundamentals_read_more_button() {
        Utils.scrollToElement ( driver, mainPage.getElementVirtualHeader());
        mainPage.clickOnFundamentalsReadMoreButton();
    }
    @And("the last name value of {string} is inputted")
    public void input_last_name_to_field(String string) {
        signUpPageForTheSoftwareTestingCoursePage.inputValueInLastNameField(string);
    }

    @And("the next button on Sign Up page is clicked")
    public void click_on_next_button_on_sign_up_page() {
        Utils.scrollToElement (driver, signUpPageForTheSoftwareTestingCoursePage.getElementConfirmPassword () );
        signUpPageForTheSoftwareTestingCoursePage.clickNextOnSignUpPage();
    }

    @And("the username value of {string} is inputted")
    public void input_username_to_field(String string) {
        signUpPageForTheSoftwareTestingCoursePage.inputValueInUsernameField(string);
    }

    @And("the password value of {string} is inputted")
    public void input_password_to_field(String string) {
        signUpPageForTheSoftwareTestingCoursePage.inputValueInPasswordField(string);
    }

    @And("the confirm password of {string} is inputted")
    public void input_confirm_password_to_field(String string) {
        signUpPageForTheSoftwareTestingCoursePage.inputValueInConfirmPasswordField(string);
    }

    @And("the phone number of {string} is inputted")
    public void input_phone_number_to_field(String string) {
        contactInformation.inputValueInPhoneNumberFieldOnContactInformationPage(string);
    }

    @And("the country value of {string} is inputted")
    public void input_country_to_field(String string) {
        contactInformation.inputValueInCountryFieldInContactInformationPage(string);
    }

    @And("the city value of {string} is inputted")
    public void input_city_to_field(String string) {
        contactInformation.inputValueInCityFieldInContactInformationPage(string);
    }

    @And("the postal code value of {string} is inputted")
    public void input_postal_code_to_field(String string) {
        contactInformation.inputValueInPostCodeFieldInInformationPage(string);
    }

    @And("the next button on contact information page is clicked")
    public void click_on_next_button_on_contact_information_page() {
        contactInformation.clickOnNextButtonOnContactInformationPage();
    }

    @And ("the next button on Course Option page is clicked")
    public void click_on_next_button_on_course_options_page() {
        courseOptions.clickNextOnCourseOptionsButton();
    }

    @And ("the card number of {string} is inputted")
    public void input_value_in_card_number_field(String string) {
        paymentInformation.inputValueInCardNumberField(string);
    }

    @And ("the cvc value of {string} is inputted")
    public void input_value_in_cvc_field(String string) {
        paymentInformation.inputValueInCvcField (string);
    }

    @And ("the month on expiry date section is clicked")
    public void click_on_month_on_expiry_date_section(){
        paymentInformation.clickMonthOnExpiryDate();
    }

    @And ("the year on expiry date section is clicked")
    public void click_on_year_on_expiry_date_section() {
        paymentInformation.clickYearExpiryDate();
    }

    @And ("the next button on payment information page is clicked")
    public void click_on_button_on_next_information_page() {
        paymentInformation.clickNextButtonOnPaymentInformationPage();
    }

    @And ("the return to homepage button is clicked")
    public void click_on_return_to_homepage_button(){
        successPage.clickReturnToHomepageButton();
    }

    @And ("the where is your institution located button is click")
    public void click_on_where_is_your_institution_located(){
        mainPage.clickOnWhereIsInstitutionLocated();
    }

    @And ("the what do I need to know beforehand button is clicked")
    public void click_on_what_do_I_need_to_beforehand() {
        mainPage.clickOnWhatDoINeedToKnowBeforeHand();
    }



    @Then ("the newsletter confirmation pop-up appears")
    public void theNewsletterConfirmationPopUpAppears() {
    driver.switchTo().alert().accept();
    }

    @Then ("the page {string} opens")
    public void theFundamentalsPageOpens(String string) {
        Assertions.assertEquals(string, driver.getTitle());
    }

    @Then ("the 2nd page {string} opens")
    public void theContactInformationPageOpens(String string) {
        Assertions.assertEquals ("Contact Information", contactInformation.getContactInformationHeaderText());
    }

    @Then ("the 3d page of {string} opens")
    public void theCourseOptionsPageOpens(String string) {
        Assertions.assertEquals ("Course options", courseOptions.getCourseOptionsHeaderText());
    }



    @Then ("the 4th page {string} opens")
    public void thePaymentInformationPageOpens(String string) {
        Assertions.assertEquals ("Payment information", paymentInformation.getPaymentInformationHeader());
    }

    @Then("the 5th page {string} opens")
    public void theSuccessPageOpens(String string) {
        Assertions.assertEquals("Success!", successPage.getSuccessPageHeaderText());
    }

    @Then ("the questions information slides down")
    public void questionsInformation() {
        Assertions.assertTrue (driver.getPageSource ().contains ( "show" ));
    }

}







