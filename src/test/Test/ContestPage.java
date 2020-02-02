import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class ContestPage extends BaseClass {

    @FindBy(xpath = "(//*[contains(text(),'Practice Contest')])[2]/following::button") public static WebElement btnJoinPracticeContest;

    public static void joinPracticeContest()
    {
        Actions actions = new Actions(driver);

        actions.moveToElement(btnJoinPracticeContest).build().perform();

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        btnJoinPracticeContest.click();
    }
}
