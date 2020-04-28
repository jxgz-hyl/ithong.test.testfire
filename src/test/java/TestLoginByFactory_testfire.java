import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageFactory.HomePage_testfire;
import pageFactory.LoginPage_testfire;

public class TestLoginByFactory_testfire {

    private WebDriver driver;
    private LoginPage_testfire objLogin;
    private HomePage_testfire objHomePage;

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "D:Tools/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.testfire.net/login.jsp");
    }

    /**
     * This test go to http://www.testfire.net/login.jsp
     * Login to application
     * Verify the home page using Dashboard message
     */
    @Test(priority=0)
    public void test_Home_Page_Appear_Correct(){
        //Create Login Page object
        objLogin = new LoginPage_testfire(driver);
        //login to application
        objLogin.loginToGuru99("admin", "admin");
        // go the next page
        objHomePage = new HomePage_testfire(driver);
        //Verify home page
        Assert.assertTrue(objHomePage.getHomePageDashboardUserName().contains("Congratulations!"));
    }
}
