package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;
import javax.xml.xpath.XPath;

public class SignUpForTheSoftwareTestingCoursePage {

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement inputFirstNameField;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement inputLastNameField;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement clickOnNextButtonOnSignUpPage;



    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement inputUsernameField;

    @FindBy (xpath = "//*[@id=\"password\"]")
    private WebElement inputPasswordField;

    @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement inputConfirmPasswordField;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[3]/a")
    private WebElement clickOnInstructorsButton;


    public SignUpForTheSoftwareTestingCoursePage(WebDriver driver) {PageFactory.initElements (driver, this);}

    public void inputValueInFirstNameField(String string) {inputFirstNameField.sendKeys (string);}

    public void inputValueInLastNameField(String string) {inputLastNameField.sendKeys (string);}

    public void clickNextOnSignUpPage() {
        clickOnNextButtonOnSignUpPage.click();
    }

    public WebElement getElementConfirmPassword() {return inputConfirmPasswordField;}

    public void inputValueInUsernameField(String string) {inputUsernameField.sendKeys(string);}

    public void inputValueInPasswordField(String string) {inputPasswordField.sendKeys(string);}

    public void clickInstructorsButton () {clickOnInstructorsButton.click();}

    public void inputValueInConfirmPasswordField (String string) {inputConfirmPasswordField.sendKeys (string);}

    public void fillInPersonalInformation () {
        inputValueInFirstNameField("dgddfg");
        inputValueInLastNameField("jhgshj");
        inputValueInUsernameField("jhghjg");
        inputValueInPasswordField("abc");
        inputValueInConfirmPasswordField("abc");
        clickNextOnSignUpPage();
    }
}
