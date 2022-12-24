package helper.driver;

import helper.constants.FrameworkConstants;
import helper.enums.ConfigProperties;
import helper.factories.BrowserFactory;
import helper.utils.PropertyUtils;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.Objects;

public final  class Driver {
    private Driver(){

    }


    public static void initDriver(){
        if(Objects.isNull(DriverManager.getDriver())){
            DriverManager.setDriver(BrowserFactory.createBrowserInstance());
            DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(FrameworkConstants.getImplicitWait()));
            DriverManager.getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(FrameworkConstants.getPageLoadTime()));
            DriverManager.getDriver().get(PropertyUtils.get(ConfigProperties.URL));
        }
    }
    public static void unloadDriver(){
        if(Objects.nonNull(DriverManager.getDriver())){
            DriverManager.getDriver().quit();
            DriverManager.unloadDriver();
        }
    }

    public static void main(String[] args) {
        Driver.initDriver();
    }

}
