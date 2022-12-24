package helper.factories;

import helper.enums.ConfigProperties;
import helper.utils.PropertyUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public final  class BrowserFactory {
    private BrowserFactory(){}
    private static WebDriver driver=null;

    public static WebDriver createBrowserInstance(){
        String browser= PropertyUtils.get(ConfigProperties.BROWSER);
        if(browser.equalsIgnoreCase("chrome")){
            ChromeOptions options=new ChromeOptions();
            options.addArguments("--incognito");
            options.addArguments("--start-maximized");
            driver= WebDriverManager.chromedriver().capabilities(options).create();
        }
        else if(browser.equalsIgnoreCase("firefox")){
            FirefoxOptions options=new FirefoxOptions();
            options.addArguments("--incognito");
            driver=WebDriverManager.firefoxdriver().capabilities(options).create();
        }
        else{
            throw new RuntimeException("Driver is not setup properly");
        }
        return driver;
    }




}
