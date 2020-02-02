import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverClass {

        public static WebDriver driver;

        public static WebDriver launchDriver()
        {
            WebDriverManager.chromedriver().setup();

            driver = new ChromeDriver();
            return driver;
        }
}
