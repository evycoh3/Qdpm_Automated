package helper.assertions;

import helper.logger.MyLogger;
import helper.reports.ExtentLogger;
import org.testng.Assert;

public final class AssertionHelper {
    private AssertionHelper(){

    }
    public static void verifyTrue(String s,String t){
        Assert.assertEquals(s,t);
        MyLogger.info("Verify if "+s+" Equals  to: "+t);
        ExtentLogger.pass("Verify if "+ s+" Equals to :"+t);
    }
}
