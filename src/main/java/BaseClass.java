import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class BaseClass extends DriverClass {

    public static WebDriver driver = launchDriver();

    @AfterTest()
    public static void afterTest()
    {
        driver.quit();

        System.gc();
    }
}
