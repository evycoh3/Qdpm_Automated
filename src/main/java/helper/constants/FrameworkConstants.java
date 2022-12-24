package helper.constants;

import helper.enums.ConfigProperties;
import helper.utils.PropertyUtils;

public final  class FrameworkConstants {

    private static final String PROPERTY_FILE_PATH=System.getProperty("user.dir")+"/src/main/resources/config.properties";
    private static final int PAGE_LOAD_TIME=15;
    private static final int IMPLICIT_WAIT=10;
    private static final int EXPLICIT_WAIT=10;
    private static final int EXPLICIT_MILLI_SEC_WAIT=150;
    private static final String EXTENT_REPORT_FILE="outputs/report.html";
    private static final String EXCEL_FILE= System.getProperty("user.dir")+"/src/main/resources/data.xlsx";


    public static String getPropertyFilePath() {
        return PROPERTY_FILE_PATH;
    }

    public static int getImplicitWait() {
        return IMPLICIT_WAIT;
    }

    public static int getPageLoadTime() {
        return PAGE_LOAD_TIME;
    }

    public static int getExplicitWait() {
        return EXPLICIT_WAIT;
    }

    public static int getExplicitMilliSecWait() {
        return EXPLICIT_MILLI_SEC_WAIT;
    }

    public static String getExtentReportFile() {
        if(PropertyUtils.get(ConfigProperties.OVER_RIDE_REPORTS).equalsIgnoreCase("no")){
            return EXTENT_REPORT_FILE;
        }
        else{
            return null;
        }
    }

    public static String getExcelFile() {
        return EXCEL_FILE;
    }
}
