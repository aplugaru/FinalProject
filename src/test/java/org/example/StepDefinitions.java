package org.example;

import PageObjects.ContactInformation;
import PageObjects.MainPage;
import PageObjects.SignUpForTheSoftwareTestingCoursePage;
import io.cucumber.java.en.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StepDefinitions {

    private WebDriver driver;
    ChromeOptions options = new ChromeOptions ();
    MainPage mainPage;
    SignUpForTheSoftwareTestingCoursePage signUpPageForTheSoftwareTestingCoursePage;
    ContactInformation contactInformation;


    public StepDefinitions() {
        options.addArguments ( "--remote-allow-origins=*" );
        driver = new ChromeDriver ( options );
        driver.manage ().window ().maximize ();
        mainPage = new MainPage ( driver );
        signUpPageForTheSoftwareTestingCoursePage = new SignUpForTheSoftwareTestingCoursePage ( driver );
        contactInformation = new ContactInformation ( driver );
    }

    @Given("I am on the main page")
    public void i_am_on_the_main_page() {
        driver.get ( "file:///C:/Users/andre/Desktop/AZIMUT/Testing-Env-master/index.html" );
    }

    @Given("I am on the Sign Up page")
    public void i_am_on_the_sign_up_page() {
        driver.get ( "file:///C:/Users/andre/Desktop/AZIMUT/Testing-Env-master/routes/enrollment.html" );
    }

    @Given ("I am on the contact information page")
    public void i_am_on_the_contact_information_page() {
        driver.get ( "file:///C:/Users/andre/AppData/Local/Temp/Rar$EXa9528.19942/Testing-Env-master/routes/enrollment.html" );
        signUpPageForTheSoftwareTestingCoursePage.fillInPersonalInformation ();
    }


    @When("the email value of {string} is inputted")
    public void input_email_to_field(String string) {
        mainPage.inputValueInEmailField ( string );
    }

    @When("the submit button is clicked")
    public void click_submit_button() {
        mainPage.clickOnSubmitButton ();
    }

    @When("the learn the fundamentals read more button is clicked")
    public void click_learn_the_fundamentals_read_more_button() {
        Utils.scrollToElement ( driver, mainPage.getElementVirtualHeader () );
        mainPage.clickOnFundamentalsReadMoreButton ();
    }

    @When("the what you'll learn button is clicked")
    public void click_what_youll_learn_button() {
        mainPage.clickOnWhatYoullLearnButton ();
    }

    @When("the Start Enrollment Button is clicked")
    public void click_start_enrollment_button() {
        mainPage.clickOnStartEnrollmentButton ();
    }

    @When("the first name value of {string} is inputted")
    public void input_first_name_to_field(String string) {
        signUpPageForTheSoftwareTestingCoursePage.inputValueInFirstNameField ( string );
    }

    @When("the email value on contact information page of {string} is inputted")
    public void input_email_on_contact_information_page_to_field(String string) {
        contactInformation.inputValueInEmailFieldOnContactInformationPage ( string );
    }

    @And("the last name value of {string} is inputted")
    public void input_last_name_to_field(String string) {
        signUpPageForTheSoftwareTestingCoursePage.inputValueInLastNameField ( string );
    }

    @And("the next button on Sign Up page is clicked")
    public void click_on_next_button_on_sign_up_page() {
        Utils.scrollToElement ( driver, signUpPageForTheSoftwareTestingCoursePage.getElementConfirmPassword () );
        signUpPageForTheSoftwareTestingCoursePage.clickNextOnSignUpPage ();
    }

    @And("the username value of {string} is inputted")
    public void input_username_to_field(String string) {
        signUpPageForTheSoftwareTestingCoursePage.inputValueInUsernameField ( string );
    }

    @And("the password value of {string} is inputted")
    public void input_password_to_field(String string) {
        signUpPageForTheSoftwareTestingCoursePage.inputValueInPasswordField ( string );
    }

    @And("the confirm password of {string} is inputted")
    public void input_confirm_password_to_field(String string) {
        signUpPageForTheSoftwareTestingCoursePage.inputValueInConfirmPasswordField ( string );
    }

    @And ("the phone number of {string} is inputted")
    public void input_phone_number_to_field(String string) {
        contactInformation.inputValueInPhoneNumberFieldOnContactInformationPage(string);
    }

    @And ("the country value of {string} is inputted")
    public void input_country_to_field(String string) {
        contactInformation.inputValueInCountryFieldInContactInformationPage(string);
    }
}




