package helper.pages;

import helper.pages.locators.LoginLocators;

public class LoginPage extends BasePage{
    public String getLoginPageTitle(){
        return getTitle();
    }

    public LoginPage setEmail(String email){
        sendKeys(LoginLocators.getEmailLocator(),email,"email");
        return this;
    }
    public LoginPage setPassword(String password){
        sendKeys(LoginLocators.getPasswordLocator(),password,"password");
        return this;
    }
    public DashBoardPage clickLogin(){
        click(LoginLocators.getLoginBtnLocator(),"login");
        return new DashBoardPage();
    }
}
