package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseOptions {

    @FindBy (xpath = "//*[@id=\"flexRadioButton1\"]")
    private WebElement clickOnSoftwareTestingManualTesterCertificate;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
    private WebElement clickOnNextButtonOnCourseOptions;


    public CourseOptions(WebDriver driver) { PageFactory.initElements(driver, this);
    }

    public void clickButtonSoftwareTestingManualTesterCertificate() {
        clickOnSoftwareTestingManualTesterCertificate.click ();
    }
    public void clickNextOnCourseOptionsButton() {
        clickOnNextButtonOnCourseOptions.click();
    }

    public void selectCourseOptions() {
        clickButtonSoftwareTestingManualTesterCertificate();
        clickNextOnCourseOptionsButton();
    }
}
