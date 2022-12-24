package helper.reports;

import com.aventstack.extentreports.MediaEntityBuilder;
import helper.enums.ConfigProperties;
import helper.utils.PropertyUtils;
import helper.utils.ScreenshotUtils;

public class ExtentLogger {

    public static void pass(String msg){
        ExtentManager.getTest().pass(msg);
    }
    public static void fail(String msg){
        ExtentManager.getTest().fail(msg);
    }
    public static void skip(String msg){
        ExtentManager.getTest().skip(msg);
    }
    public static void pass(String msg,boolean screenshotNeeded){
        if(PropertyUtils.get(ConfigProperties.PASS_TEST_SCREENSHOT).equalsIgnoreCase("yes") &&screenshotNeeded){
            ExtentManager.getTest().pass(msg,MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64img()).build());
        }
    }
    public static void fail(String msg,boolean screenShotNeeded){
        if(PropertyUtils.get(ConfigProperties.FAILED_TEST_SCREENSHOT).equalsIgnoreCase("yes") &&screenShotNeeded){
            ExtentManager.getTest().fail(msg,MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64img()).build());
        }
    }
    public static void skip(String msg,boolean screenShotNeeded){
        if(PropertyUtils.get(ConfigProperties.SKIP_TEST_SCREENSHOT).equalsIgnoreCase("yes") && screenShotNeeded){
            ExtentManager.getTest().fail(msg,MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64img()).build());
        }
    }
}
