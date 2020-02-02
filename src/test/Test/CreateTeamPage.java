import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateTeamPage extends BaseClass {

    public static void addWicketKeeper(String WicketKeeper)
    {
        WebElement addWK = driver.findElement(By.xpath("(//p[contains(text(),'"+WicketKeeper+"')]/following::div[text()='+'])[1]"));
        addWK.click();
    }

    @FindBy(xpath = "//img[@src='data:image/png;base64,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']") public static WebElement imgBatsmen;

    public static void addBatsmen(String Batsmen) throws InterruptedException {
        imgBatsmen.click();

        WebElement addBat = driver.findElement(By.xpath("(//p[contains(text(),'"+Batsmen+"')]/following::div[text()='+'])[1]"));

        Thread.sleep(5000);

       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addBat);

        Actions actions = new Actions(driver);
        actions.moveToElement(addBat).build().perform();

        addBat.click();
    }
}
