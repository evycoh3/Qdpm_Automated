package testcases;

import helper.enums.ConfigProperties;
import helper.logger.MyLogger;
import helper.pages.AddDiscussionPage;
import helper.pages.DashBoardPage;
import helper.pages.LoginPage;
import helper.utils.PropertyUtils;
import org.testng.annotations.Test;

public class AddDiscussionTest extends BaseTest {

    @Test
    public void tc_addDiscussionTest() {
        MyLogger.startTestCase(new Throwable().getStackTrace()[0].getMethodName());
        DashBoardPage dashBoardPage = new LoginPage()
                .setEmail(PropertyUtils.get(ConfigProperties.EMAIL))
                .setPassword(PropertyUtils.get(ConfigProperties.PASSWORD))
                .clickLogin();
        dashBoardPage.selectNavBar("Discussions").selectSubNavBar("Add Discussion");
        new AddDiscussionPage()
                .setProjectName("Test Project 1")
                .setDiscussionStatus("Open")
                .setDiscussionAssignedTo("admin", "client", "developer", "manager")
                .setDiscussionName("evy discussion")
                .setDiscussionCreatedBy("developer")
                .clickSaveBtn();
        MyLogger.endTestCase(new Throwable().getStackTrace()[0].getMethodName());
    }
}
