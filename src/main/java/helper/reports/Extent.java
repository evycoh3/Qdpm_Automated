package helper.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import helper.constants.FrameworkConstants;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public final class Extent {
    private Extent(){

    }
    private static ExtentReports extent=null;

    protected static void initReport(){
        if(Objects.isNull(extent)){
            extent=new ExtentReports();
            ExtentSparkReporter spark=new ExtentSparkReporter(FrameworkConstants.getExtentReportFile());
            spark.config().setTheme(Theme.DARK);
            spark.config().setReportName("MyReport");
            spark.config().setDocumentTitle("MyTitle");
            extent.attachReporter(spark);
        }
    }
    protected  static void flushReport(){
        if(Objects.nonNull(extent)){
            extent.flush();
            try {
                Desktop.getDesktop().browse(new File(FrameworkConstants.getExtentReportFile()).toURI());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    protected static void createTest(String testName){
        ExtentTest test=extent.createTest(testName);
        ExtentManager.setTest(test);
    }

}
