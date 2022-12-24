package helper.pages;

import helper.pages.locators.DashBoardLocators;
import helper.utils.DynamicXpathUtils;
import org.openqa.selenium.By;

public class DashBoardPage extends BasePage{

    public LoginPage clickLogout(){
        click(DashBoardLocators.getUserDropdownLocator(),"User dropdown");
        click(DashBoardLocators.getLogoffBtnLocator(),"logoff button");
        return new LoginPage();
    }
    public DashBoardPage selectNavBar(String navBarItem){
        String value= DynamicXpathUtils.getXpath(DashBoardLocators.getNavBar(),navBarItem);
        click(By.xpath(value),navBarItem);
        return this;
    }
    public DashBoardPage selectSubNavBar(String subNavBarItem){
        String value=DynamicXpathUtils.getXpath(DashBoardLocators.getSubNavBar(),subNavBarItem);
        click(By.xpath(value),subNavBarItem);
        return this;
    }

}
