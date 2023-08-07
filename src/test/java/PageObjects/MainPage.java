package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    @FindBy (xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement inputEmailField;

    @FindBy (xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement elementSubmitButton;

    @FindBy (xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/a")
    private WebElement elementLearnTheFundamentalsReadMoreButton;

    @FindBy (xpath = "//*[@id=\"navmenu\"]/ul/li[1]/a")
    private WebElement elementWhatYoullLearnButton;

    @FindBy (xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement elementStartTheEnrollmentButton;

    @FindBy (xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement elementVirtualHeader;

    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/h2")
    private WebElement fundamentalsText;



    public MainPage(WebDriver driver) {
        PageFactory.initElements ( driver, this );
    }

    public void inputValueInEmailField(String string) {
        inputEmailField.sendKeys ( string );
    }

    public void clickOnSubmitButton () {
        elementSubmitButton.click();
    }

    public void clickOnFundamentalsReadMoreButton () {
        elementLearnTheFundamentalsReadMoreButton.click();
    }

    public void clickOnWhatYoullLearnButton() {
        elementWhatYoullLearnButton.click ();
    }

    public void clickOnStartEnrollmentButton() {
        elementStartTheEnrollmentButton.click ();
    }

    public WebElement getElementVirtualHeader() {
        return elementVirtualHeader;
    }

    public String getFundamentalsText() {
         return fundamentalsText.getText ();
    }

}
