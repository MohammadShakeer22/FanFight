import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ContestInfoPage extends BaseClass {

    @FindBy(xpath = "//h5[contains(text(),'CONTEST INFO')]") public static WebElement headerContestInfo;
    @FindBy(xpath = "//a[contains(text(),'JOIN WITH NEW TEAM')]") public static WebElement btnJoinWithNewTeam;

    public static void joinWithNewTeam()
    {
        Assert.assertTrue(headerContestInfo.isDisplayed());

        btnJoinWithNewTeam.click();
    }
}
