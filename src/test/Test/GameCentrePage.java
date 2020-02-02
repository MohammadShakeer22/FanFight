import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GameCentrePage extends BaseClass {

    @FindBy(xpath = "(//div[contains(@id,'match-card')])[4]") public static WebElement lnkJoin;

    public static void clickMatchCard()
    {
        lnkJoin.click();
    }

    @FindBy(xpath = "//span[contains(text(),'PROFILE')]") public static WebElement lnkProfile;

    public static void clickProfile()
    {
        lnkProfile.click();
    }
}
