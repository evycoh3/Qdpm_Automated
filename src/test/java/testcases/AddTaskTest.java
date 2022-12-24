package testcases;

import helper.enums.ConfigProperties;
import helper.logger.MyLogger;
import helper.pages.AddTaskPage;
import helper.pages.DashBoardPage;
import helper.pages.LoginPage;
import helper.reports.ListenerClass;
import helper.utils.PropertyUtils;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerClass.class)

public class AddTaskTest extends BaseTest {

    @Test
    public void tc_addTask()  {
        MyLogger.startTestCase(new Throwable().getStackTrace()[0].getMethodName());
        DashBoardPage dashBoardPage = new LoginPage()
                .setEmail(PropertyUtils.get(ConfigProperties.EMAIL))
                .setPassword(PropertyUtils.get(ConfigProperties.PASSWORD))
                .clickLogin();
        dashBoardPage.selectNavBar("Tasks").selectSubNavBar("Add Task");
        new AddTaskPage()
                .setProjectName("Test Project 1")
                .setTaskType("Changes (Hourly rate $15.00)")
                .setTaskName("evy Task cycle 1")
                .setTaskStatus("Re-opened")
                .setTaskPriority("Low")
                .setTaskLabel("Bug")
                .setTaskAssignedTo("admin","developer")
                .setTaskDescription("my description")
                .setCreatedBy("developer")
                .clickSaveBtn();
        MyLogger.endTestCase(new Throwable().getStackTrace()[0].getMethodName());

    }
}
