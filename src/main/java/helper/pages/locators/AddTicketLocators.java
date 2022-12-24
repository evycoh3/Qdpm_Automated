package helper.pages.locators;

import org.openqa.selenium.By;

public final class AddTicketLocators {

    private static final By PROJECT_NAME= By.id("form_projects_id");
    private static final By TICKET_DEPARTMENT=By.id("tickets_departments_id");
    private static final By TICKET_TYPE=By.id("tickets_tickets_types_id");
    private static final By TICKET_STATUS=By.id("tickets_tickets_status_id");
    private static final By TICKET_SUBJECT=By.name("tickets[name]");
    private static final By DESCRIPTION_FRAME=By.cssSelector(".cke_wysiwyg_frame.cke_reset");
    private static final By DESCRIPTION_INPUT=By.tagName("p");
    private static final By CREATED_BY=By.id("tickets_users_id");
    private static final By NOTIFY_TO=By.cssSelector(".checkbox_list  label");
    private static final By SAVE_BTN=By.cssSelector("button[type='submit']");
    public static By getProjectName() {
        return PROJECT_NAME;
    }

    public static By getTicketDepartment() {
        return TICKET_DEPARTMENT;
    }

    public static By getTicketStatus() {
        return TICKET_STATUS;
    }

    public static By getTicketType() {
        return TICKET_TYPE;
    }

    public static By getTicketSubject() {
        return TICKET_SUBJECT;
    }

    public static By getDescriptionFrame() {
        return DESCRIPTION_FRAME;
    }

    public static By getDescriptionInput() {
        return DESCRIPTION_INPUT;
    }

    public static By getCreatedBy() {
        return CREATED_BY;
    }

    public static By getNotifyTo() {
        return NOTIFY_TO;
    }

    public static By getSaveBtn() {
        return SAVE_BTN;
    }
}
