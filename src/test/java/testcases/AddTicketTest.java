package testcases;

import helper.enums.ConfigProperties;
import helper.logger.MyLogger;
import helper.pages.AddTicketPage;
import helper.pages.DashBoardPage;
import helper.pages.LoginPage;
import helper.reports.ListenerClass;
import helper.utils.PropertyUtils;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerClass.class)
public class AddTicketTest extends BaseTest {

    @Test
    public void tc_addTicket() {
        MyLogger.startTestCase(new Throwable().getStackTrace()[0].getMethodName());
        DashBoardPage dashBoardPage = new LoginPage()
                .setEmail(PropertyUtils.get(ConfigProperties.EMAIL))
                .setPassword(PropertyUtils.get(ConfigProperties.PASSWORD)).clickLogin();
        dashBoardPage.selectNavBar("Tickets").selectSubNavBar("Add Ticket");
        new AddTicketPage()
                .setProjectName("Test Project 1")
                .setTicketDepartment("Hosting Support")
                .setTicketType("Report a Bug")
                .setTicketStatus("Open")
                .setTicketSubject("Hello ticket")
                .setTicketDescription("yes")
                .setTicketCreatedBy("admin")
                .setNotifyTo("admin", "manager")
                .clickSaveBtn();
        MyLogger.endTestCase(new Throwable().getStackTrace()[0].getMethodName());
    }


}
