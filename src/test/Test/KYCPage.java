import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class KYCPage extends BaseClass {

    @FindBy(xpath = "//button[contains(text(),'SEND CONFIRMATION EMAIL')]") public static WebElement lnkSendConfirmationMail;
    @FindBy(xpath = "//div[contains(text(),'Please check your email and verify ')]") public static WebElement msgMailSent;

    public static void clickSendConfirmationMail()
    {
        lnkSendConfirmationMail.click();

        Assert.assertTrue(msgMailSent.isDisplayed());
    }
}
