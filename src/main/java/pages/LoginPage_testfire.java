package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_testfire {

    private WebDriver driver;
    private By userName = By.name("uid");
    private By password = By.name("passw");
    private By login = By.name("btnSubmit");

    public LoginPage_testfire(WebDriver driver){
        this.driver = driver;
    }
    //Set user name in textbox
    private void setUserName(String strUserName){
        driver.findElement(userName).sendKeys(strUserName);;
    }

    //Set password in password textbox
    private void setPassword(String strPassword){
        driver.findElement(password).sendKeys(strPassword);
    }

    //Click on login button
    private void clickLogin(){
        driver.findElement(login).click();
    }

    /**
     * This POM method will be exposed in test case to login in the application
     * @param strUserName
     * @param strPasword
     * @return
     */
    public void loginToGuru99(String strUserName,String strPasword){
        //Fill user name
        this.setUserName(strUserName);
        //Fill password
        this.setPassword(strPasword);
        //Click Login button
        this.clickLogin();

    }
}
