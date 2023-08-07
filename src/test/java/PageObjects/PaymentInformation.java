package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PaymentInformation {



    public PaymentInformation (WebDriver driver) {
        PageFactory.initElements (driver, this);
    }
}
