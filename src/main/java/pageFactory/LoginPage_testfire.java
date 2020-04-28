package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_testfire {

    /**
     * All WebElements are identified by @FindBy annotation
     */
    private WebDriver driver;

    @FindBy(name="uid")
    private WebElement userName;

    @FindBy(name="passw")
    private WebElement password;

    @FindBy(name="btnSubmit")
    private WebElement login;

    public LoginPage_testfire(WebDriver driver){
        this.driver = driver;
        //This initElements method will create  all WebElements
        PageFactory.initElements(driver, this);
    }
    //Set user name in textbox
    private void setUserName(String strUserName){
        userName.sendKeys(strUserName);

    }

    //Set password in password textbox
    private void setPassword(String strPassword){
        password.sendKeys(strPassword);
    }

    //Click on login button
    private void clickLogin(){
        login.click();
    }

    /**
     * This POM method will be exposed in test case to login in the application
     * @param strUserName
     * @param strPassword
     * @return
     */
    public void loginToGuru99(String strUserName,String strPassword){
        //Fill user name
        this.setUserName(strUserName);
        //Fill password
        this.setPassword(strPassword);
        //Click Login button
        this.clickLogin();
    }

}
