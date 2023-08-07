package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformation {

    @FindBy (xpath = "//*[@id=\"email\"]")
    private WebElement inputEmailFieldOnContactInformationPage;

    @FindBy (xpath = "//*[@id=\"phone\"]")
    private WebElement inputPhoneNumberInFieldInContactInformationPage;

    @FindBy (xpath = "//*[@id=\"country\"]")
    private WebElement inputCountryFieldOnContactInformationPage;

    @FindBy (xpath = "//*[@id=\"city\"]")
    private WebElement inputCityFieldOnContactInformationPage;

    @FindBy (xpath = "//*[@id=\"postCode\"]")
    private WebElement inputPostCodeFieldOnContactInformationPage;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement clickOnNextButtonOnContactInformationPage;


    public ContactInformation(WebDriver driver) {
        PageFactory.initElements (driver, this);
    }



    public void inputValueInEmailFieldOnContactInformationPage(String string) {
        inputEmailFieldOnContactInformationPage.sendKeys(string);
    }

    public void inputValueInPhoneNumberFieldOnContactInformationPage(String string) {
        inputPhoneNumberInFieldInContactInformationPage.sendKeys(string);
    }

    public void inputValueInCountryFieldInContactInformationPage(String string) {
        inputCountryFieldOnContactInformationPage.sendKeys(string);
    }

    public void inputValueInCityFieldInContactInformationPage(String string) {
        inputCityFieldOnContactInformationPage.sendKeys (string);
    }

    public void inputValueInPostCodeFieldInInformationPage(String string) {
        inputPostCodeFieldOnContactInformationPage.sendKeys(string);
    }

    public void clickOnNextButtonOnContactInformationPage() {
        clickOnNextButtonOnContactInformationPage.click ();
    }

    public void fillInContactInformation() {
        inputValueInEmailFieldOnContactInformationPage("afag@hfta.com");
        inputValueInPhoneNumberFieldOnContactInformationPage("0765746387");
        inputValueInCountryFieldInContactInformationPage ("China");
        inputValueInPostCodeFieldInInformationPage ("50098473");
        inputValueInCityFieldInContactInformationPage ("Shang");
        clickOnNextButtonOnContactInformationPage();
    }

}
