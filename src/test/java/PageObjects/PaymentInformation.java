package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.security.auth.x500.X500Principal;

public class PaymentInformation {

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/input")
    private WebElement inputCardHolderNameOnPaymentInformationPage;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input")
    private WebElement inputCardNumberOnPaymentInformationPage;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input")
    private WebElement inputCvcOnPaymentInformationPage;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[4]/h3")
    private WebElement paymentInformationHeader;

    @FindBy (xpath = "//*[@id=\"month\"]/option[2]")
    private WebElement clickOnMonthExpiryDate;

    @FindBy (xpath = "//*[@id=\"year\"]/option[3]")
    private WebElement clickOnYearExpiryDate;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[2]")
    private WebElement clickOnNextButtonOnPaymentInformationPage;




    public PaymentInformation (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void inputValueInCardHolderName(String string) {
        inputCardHolderNameOnPaymentInformationPage.sendKeys(string);
    }

    public void inputValueInCardNumberField(String string) {
        inputCardNumberOnPaymentInformationPage.sendKeys(string);
    }

    public String getPaymentInformationHeader(){
        return paymentInformationHeader.getText();
    }

    public void inputValueInCvcField(String string) {
        inputCvcOnPaymentInformationPage.sendKeys(string);
    }

    public void clickMonthOnExpiryDate() {
        clickOnMonthExpiryDate.click();
    }

    public void clickYearExpiryDate() {
        clickOnYearExpiryDate.click();
    }

    public void clickNextButtonOnPaymentInformationPage() {
        clickOnNextButtonOnPaymentInformationPage.click();
    }
}
