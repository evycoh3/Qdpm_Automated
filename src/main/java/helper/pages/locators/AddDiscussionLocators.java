package helper.pages.locators;

import org.openqa.selenium.By;

public final class AddDiscussionLocators {
    private static final By PROJECT_NAME= By.id("form_projects_id");
    private static final By STATUS=By.id("discussions_discussions_status_id");
    private static final By ASSIGNED_TO=By.cssSelector(".checkbox_list label");
    private static final By NAME=By.id("discussions_name");
    private static final By DESCRIPTION_FRAME=By.cssSelector(".cke_wysiwyg_frame.cke_reset");
    private static final By DESCRIPTION_INPUT=By.tagName("p");
    private static final By DISCUSSION_CREATED_BY=By.id("discussions_users_id");
    private static final By SAVE_BTN=By.cssSelector("button[type='submit']");

    public static By getDescriptionInput() {
        return DESCRIPTION_INPUT;
    }

    public static By getDescriptionFrame() {
        return DESCRIPTION_FRAME;
    }

    public static By getProjectName() {
        return PROJECT_NAME;
    }

    public static By getAssignedTo() {
        return ASSIGNED_TO;
    }

    public static By getSaveBtn() {
        return SAVE_BTN;
    }

    public static By getSTATUS() {
        return STATUS;
    }

    public static By getNAME() {
        return NAME;
    }

    public static By getDiscussionCreatedBy() {
        return DISCUSSION_CREATED_BY;
    }
}
