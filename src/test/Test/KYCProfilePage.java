import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class KYCProfilePage extends BaseClass {

    @FindBy(xpath = "//h5[contains(text(),'PROFILE')]") public static WebElement headerProfile;
    @FindBy(xpath = "//button[contains(text(),'VERIFY NOW')]") public static WebElement btnVerifyNow;

    public static void clickVerifyNow()
    {
        Assert.assertTrue(headerProfile.isDisplayed());

        btnVerifyNow.click();
    }
}
