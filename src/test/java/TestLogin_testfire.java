import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.HomePage_testfire;
import pages.LoginPage_testfire;


public class TestLogin_testfire {

    private static WebDriver driver;
    private LoginPage_testfire objLogin;
    private HomePage_testfire objHomePage;

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "D:Tools/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.testfire.net/login.jsp");
    }

    /**
     * This test case will login in http://www.testfire.net/login.jsp
     * Login to application
     * Verify the home page using Dashboard message
     */
    @Test
    public void test_Home_Page_Appear_Correct(){
        //Create Login Page object
        objLogin = new LoginPage_testfire(driver);
        //login to application
        objLogin.loginToGuru99("admin", "admin");
        // go the next page
        objHomePage = new HomePage_testfire(driver);
        //Verify home page
        Assert.assertEquals(objHomePage.getHomePageDashboardUserName(), "Congratulations!");
    }

}
