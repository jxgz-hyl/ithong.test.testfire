package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage_testfire {

    private WebDriver driver;
    private By homePageUserName = By.xpath("//*[@id=\"_ctl0__ctl0_Content_Main_promo\"]/table/tbody/tr[1]/td/h2");

    public HomePage_testfire(WebDriver driver){
        this.driver = driver;
    }

    //Get the User name from Home Page
    public String getHomePageDashboardUserName(){
        return	driver.findElement(homePageUserName).getText();
    }

}
