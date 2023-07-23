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

}
