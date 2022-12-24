package helper.pages.locators;

import helper.pages.DashBoardPage;
import org.openqa.selenium.By;

public final class DashBoardLocators {
    private DashBoardLocators(){

    }
    private static final By USER_DROPDOWN_LOCATOR= By.cssSelector("li.dropdown.user");
    private static final By LOGOFF_BTN_LOCATOR=By.cssSelector("ul.dropdown-menu>li:last-of-type a");
    private static final String NAV_BAR="//ul[@class='page-sidebar-menu']/li/a/span[@class='title'][text()='%value%']";
    private static final String SUB_NAV_BAR="//ul[@class='page-sidebar-menu']/li/ul//span[text()='%value%']";

    public static By getLogoffBtnLocator() {
        return LOGOFF_BTN_LOCATOR;
    }

    public static By getUserDropdownLocator() {
        return USER_DROPDOWN_LOCATOR;
    }

    public static String getNavBar() {
        return NAV_BAR;
    }

    public static String getSubNavBar() {
        return SUB_NAV_BAR;
    }
}
