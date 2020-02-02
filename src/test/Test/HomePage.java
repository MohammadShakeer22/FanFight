import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage extends BaseClass {

    @FindBy(xpath = "//a[contains(@id,'registerButton')]") public static WebElement lnkJoin;
    @FindBy(xpath = "//input[@type='email']") public static WebElement txtEmail;
    @FindBy(xpath = "//input[@type='tel']") public static WebElement txtMob;
    @FindBy(xpath = "//input[@type='password']") public static WebElement txtPassword;
    @FindBy(xpath = "//button[text()='JOIN']") public static WebElement btnJoin;

    public static void joinFanFight(String email, String mob, String password) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(lnkJoin));

        lnkJoin.click();

        txtEmail.sendKeys(email);

        txtMob.sendKeys(mob);

        txtPassword.sendKeys(password);

        btnJoin.click();
    }

    @FindBy(xpath = "//a[@id='loginButton']") public static WebElement lnkLogin;
    @FindBy(xpath = "//button[text()='LOGIN']") public static WebElement btnLogin;
    @FindBy(xpath = "//h5[contains(text(),'GAME CENTER')]") public static WebElement headerGameCentre;

    public static void login(String email,String pwd)
    {
        lnkLogin.click();

        txtEmail.sendKeys(email);

        txtPassword.sendKeys(pwd);

        btnLogin.click();

        Assert.assertTrue(headerGameCentre.isDisplayed());
    }


}
