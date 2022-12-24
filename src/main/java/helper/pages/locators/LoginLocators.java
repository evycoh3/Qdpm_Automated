package helper.pages.locators;

import org.openqa.selenium.By;

public final class LoginLocators {
    private LoginLocators(){}
    private static final By EMAIL_LOCATOR= By.name("login[email]");
    private static final By PASSWORD_LOCATOR=By.name("login[password]");
    private static final By LOGIN_BTN_LOCATOR=By.cssSelector("button[type='submit']");

    public static By getEmailLocator() {
        return EMAIL_LOCATOR;
    }

    public static By getPasswordLocator() {
        return PASSWORD_LOCATOR;
    }

    public static By getLoginBtnLocator() {
        return LOGIN_BTN_LOCATOR;
    }
}
