package helper.pages;

import helper.driver.Driver;
import helper.driver.DriverManager;
import helper.enums.WaitStrategy;
import helper.factories.ExplicitWaitFactory;
import helper.logger.MyLogger;
import helper.reports.ExtentLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class BasePage {

    protected String getTitle(){
        String msg;
        try{
            String title= DriverManager.getDriver().getTitle();
            msg="Page Title: "+title;
            MyLogger.info(msg);
            ExtentLogger.pass(msg);
            return title;

        }catch (Exception e){
            e.printStackTrace();
            msg="Failed to return page title";
            MyLogger.error(msg);
            ExtentLogger.fail(msg);
            return null;
        }
    }

    protected  void sendKeys(By by, String value, String fieldName){
        String msg;
        try{
            ExplicitWaitFactory.performExplicitWait(by, WaitStrategy.PRESENCE).sendKeys(value);
            msg="Send keys to  "+fieldName+":"+value;
            MyLogger.info(msg);
            ExtentLogger.pass(msg);
        }catch (Exception e){
            e.printStackTrace();
            msg="Failed to send keys to "+fieldName;
            MyLogger.error(msg);
            ExtentLogger.fail(msg);
        }
    }
    protected void click(By by,String fieldName){
        String msg;
        try{
            ExplicitWaitFactory.performExplicitWait(by,WaitStrategy.CLICKABLE).click();
            msg="Clicked on "+fieldName;
            MyLogger.info(msg);
            ExtentLogger.pass(msg);

        }catch (Exception e){
            e.printStackTrace();
            msg="Failed to click on "+fieldName;
            MyLogger.error(msg);
            ExtentLogger.fail(msg);
        }
    }
    protected void selectByVisibleText(By by,String visibleText,String fieldName){
        String msg;
        try{
            Select select=new Select(ExplicitWaitFactory.performExplicitWait(by,WaitStrategy.VISIBLE
            ));
            select.selectByVisibleText(visibleText);
            msg="select "+visibleText+" from "+fieldName+" dropdown";
            MyLogger.info(msg);
            ExtentLogger.pass(msg);

        }catch (Exception e){
            e.printStackTrace();
            msg="failed to select "+visibleText+"from "+fieldName+"dropdown";
            MyLogger.info(msg);
            ExtentLogger.fail(msg);
        }
    }
    protected void selectMultipleCheckBox(By by,String fieldName,String ...value){
        String msg;
        List<WebElement> list=DriverManager.getDriver().findElements(by);
        ArrayList<String>arrayList=new ArrayList<>();
        try{
            if(!value[0].equalsIgnoreCase("All")){
              for(WebElement element:list){
                  String str=element.getText();
                  for(String s:value){
                      if(s.equalsIgnoreCase(str)){
                          arrayList.add(str);
                          element.click();
                          break;
                      }
                  }
              }
              MyLogger.info("Select from "+fieldName+" dropdown "+arrayList.toString());
              ExtentLogger.pass("Select from "+fieldName+" dropdown "+arrayList.toString());
            }else{
                for(WebElement element:list){
                    element.click();
                }
            }

        }catch (Exception e){
            e.printStackTrace();
            msg="Failed to select from "+fieldName+" dropdown";
            MyLogger.error(msg);
            ExtentLogger.fail(msg);
        }

    }
    protected void switchToFrame(By by){
        try{
            DriverManager.getDriver().switchTo().frame(ExplicitWaitFactory.performExplicitWait(by,WaitStrategy.NONE));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    protected void switchToDefaultContent(){
        DriverManager.getDriver().switchTo().defaultContent();
    }
}
