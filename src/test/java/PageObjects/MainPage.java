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

    @FindBy (xpath = "/html/body/section[3]/div/div/div[1]/div/div/h3")
    private WebElement elementVirtualHeader;

    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/h2")
    private WebElement fundamentalsText;

    @FindBy (xpath = "//*[@id=\"navmenu\"]/ul/li[2]/a")
    private WebElement elementQuestionsButton;

    @FindBy(xpath = "//*[@id=\"questions\"]/div[1]/h3/button")
    private WebElement elementWhereIsYourInstitutionLocated;

    @FindBy(xpath = "//*[@id=\"question-one\"]/div")
    private WebElement dropDownQuestions;

    @FindBy(xpath = "//*[@id=\"questions\"]/div[3]/h3/button")
    private WebElement elementWhatDoINeedToKnowBeforehand;

    @FindBy (xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement elementVirtualSectionReadMoreButton;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[3]/a")
    private WebElement elementInstructorsButton;

    @FindBy(xpath = "//*[@id=\"instructors\"]/div/h2")
    private WebElement elementOurInstructorsHeader;

    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[1]/div/div/a[4]/i")
    private WebElement elementTwitterButton;

    @FindBy(xpath = "//*[@id=\"questions\"]/div/h2")
    private WebElement elementFrequentlyAskedQuestions;

    @FindBy(xpath = "/html/body/section[8]/div/div/div[1]/h2")
    private WebElement elementContactInfoHeader;


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

    public void clickOnQuestionsButton() {elementQuestionsButton.click();}

    public void clickOnWhereIsInstitutionLocated() {elementWhereIsYourInstitutionLocated.click();}

    public void clickOnWhatDoINeedToKnowBeforeHand() {
        elementWhatDoINeedToKnowBeforehand.click();}

    public WebElement getElementVirtualHeader() {
        return elementVirtualHeader;
    }

    public String getFundamentalsText() {
         return fundamentalsText.getText ();
    }
    public void clickOnVirtualButtonReadMoreButton() {elementVirtualSectionReadMoreButton.click();}
    public void clickOnInstructorsButton(){elementInstructorsButton.click();}

    public String getOurInstructorsHeader(){
        return elementOurInstructorsHeader.getText();
    }

    public void clickOnInstagramButton() {
        elementTwitterButton.click();
    }

    public WebElement getElementFrequentlyAskedQuestions() {
        return elementFrequentlyAskedQuestions;
    }

    public WebElement getContactInfoHeader(){
        return elementContactInfoHeader;
    }

}




