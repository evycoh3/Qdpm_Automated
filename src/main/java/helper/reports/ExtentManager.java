package helper.reports;

import com.aventstack.extentreports.ExtentTest;

public final class ExtentManager {
    private ExtentManager(){}
    private static ThreadLocal<ExtentTest>extentTestThreadLocal=new ThreadLocal<>();

    public static ExtentTest getTest() {
        return extentTestThreadLocal.get();
    }

    public static void setTest(ExtentTest test){
        extentTestThreadLocal.set(test);
    }
    public void unloadTest(){
        extentTestThreadLocal.remove();
    }
}
