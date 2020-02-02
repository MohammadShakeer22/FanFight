import Utils.ExcelUtils;
import com.codoid.products.exception.FilloException;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Test extends BaseClass {

    @org.testng.annotations.Test
    public static void joinFanFightContest() throws FilloException, InterruptedException
    {
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        GameCentrePage gameCentrePage = PageFactory.initElements(driver,GameCentrePage.class);
        ContestPage contestPage = PageFactory.initElements(driver,ContestPage.class);
        ContestInfoPage contestInfoPage = PageFactory.initElements(driver,ContestInfoPage.class);
        CreateTeamPage createTeamPage = PageFactory.initElements(driver,CreateTeamPage.class);


        driver.get("https://fanfight.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String email = ExcelUtils.fetchData("DataSheet.xlsx","UserDetails","Email");
        String pwd = ExcelUtils.fetchData("DataSheet.xlsx","UserDetails","Password");

        homePage.login(email,pwd);
        gameCentrePage.clickMatchCard();
        contestPage.joinPracticeContest();
        contestInfoPage.joinWithNewTeam();

        String wicketKeeper = ExcelUtils.fetchData("DataSheet.xlsx","TeamDetails","WicketKeeper");
        createTeamPage.addWicketKeeper(wicketKeeper);

        String batsman1 = ExcelUtils.fetchData("DataSheet.xlsx","TeamDetails","Batsman1");
        String batsman2 = ExcelUtils.fetchData("DataSheet.xlsx","TeamDetails","Batsman2");
        String batsman3 = ExcelUtils.fetchData("DataSheet.xlsx","TeamDetails","Batsman3");
        String batsman4 = ExcelUtils.fetchData("DataSheet.xlsx","TeamDetails","Batsman4");

        createTeamPage.addBatsmen(batsman1);
        createTeamPage.addBatsmen(batsman2);
        createTeamPage.addBatsmen(batsman3);
        createTeamPage.addBatsmen(batsman4);

    }

    @org.testng.annotations.Test
    public static void verifyKYC() throws FilloException, InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        GameCentrePage gameCentrePage = PageFactory.initElements(driver, GameCentrePage.class);
        KYCProfilePage kycProfilePage = PageFactory.initElements(driver,KYCProfilePage.class);
        KYCPage kycPage = PageFactory.initElements(driver,KYCPage.class);

        driver.get("https://fanfight.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String email = ExcelUtils.fetchData("DataSheet.xlsx", "UserDetails", "Email");
        String pwd = ExcelUtils.fetchData("DataSheet.xlsx", "UserDetails", "Password");

        homePage.login(email, pwd);
        gameCentrePage.clickProfile();
        kycProfilePage.clickVerifyNow();
        kycPage.clickSendConfirmationMail();

    }


}
