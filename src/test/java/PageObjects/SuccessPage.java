package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.plaf.PanelUI;

public class SuccessPage {

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[5]/a")
    private WebElement clickOnReturnToHomepageButtonOnSuccessPage;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[5]/h3")
    private WebElement successPageHeader;

    public SuccessPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickReturnToHomepageButton() {
        clickOnReturnToHomepageButtonOnSuccessPage.click();
    }

    public void fillInSuccessPage() {
        clickReturnToHomepageButton();
    }

    public String getSuccessPageHeaderText() {
        return successPageHeader.getText();
    }
}
