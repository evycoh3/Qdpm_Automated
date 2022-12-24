package helper.pages.locators;

import org.openqa.selenium.By;

public final class AddTaskLocators {
    private static final By PROJECT_NAME= By.id("form_projects_id");
    private static final By TYPE=By.id("tasks_tasks_type_id");
    private static final By NAME=By.name("tasks[name]");
    private static final By STATUS=By.id("tasks_tasks_status_id");
    private static final By PRIORITY=By.id("tasks_tasks_priority_id");
    private static final By LABEL=By.id("tasks_tasks_label_id");
    private static final By ASSIGNED_TO=By.cssSelector("ul.checkbox_list label");
    private static final By DESCRIPTION_FRAME=By.cssSelector(".cke_wysiwyg_frame.cke_reset");
    private static final By CREATED_BY=By.id("tasks_created_by");
    private static final By SAVE_BTN=By.cssSelector("button[type='submit']");


    public static By getProjectName() {
        return PROJECT_NAME;
    }

    public static By getTYPE() {
        return TYPE;
    }

    public static By getNAME() {
        return NAME;
    }

    public static By getSTATUS() {
        return STATUS;
    }

    public static By getPRIORITY() {
        return PRIORITY;
    }

    public static By getLABEL() {
        return LABEL;
    }

    public static By getAssignedTo() {
        return ASSIGNED_TO;
    }

    public static By getDescriptionFrame() {
        return DESCRIPTION_FRAME;
    }

    public static By getCreatedBy() {
        return CREATED_BY;
    }

    public static By getSaveBtn() {
        return SAVE_BTN;
    }
}
