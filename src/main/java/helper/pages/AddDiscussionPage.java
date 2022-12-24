package helper.pages;

import helper.pages.locators.AddDiscussionLocators;

public class AddDiscussionPage extends BasePage {

    public AddDiscussionPage setProjectName(String projectName){
        selectByVisibleText(AddDiscussionLocators.getProjectName(),projectName,"project name");
        return this;
    }
    public AddDiscussionPage setDiscussionStatus(String discussionStatus){
        selectByVisibleText(AddDiscussionLocators.getSTATUS(),discussionStatus,"discussion status");
        return this;
    }
    public AddDiscussionPage setDiscussionAssignedTo(String ...value){
        selectMultipleCheckBox(AddDiscussionLocators.getAssignedTo(),"assigned to",value);
        return this;
    }
    public AddDiscussionPage setDiscussionName(String discussionName){
        sendKeys(AddDiscussionLocators.getNAME(),discussionName,"discussion name");
        return this;
    }
    public AddDiscussionPage setDiscussionDescription(String discussionDescription){
        switchToFrame(AddDiscussionLocators.getDescriptionFrame());
        sendKeys(AddDiscussionLocators.getDescriptionInput(),discussionDescription,"discussion description");
        switchToDefaultContent();
        return this;
    }
    public AddDiscussionPage setDiscussionCreatedBy(String createdBy){
        selectByVisibleText(AddDiscussionLocators.getDiscussionCreatedBy(),createdBy,"discussion created by");
        return this;
    }
    public AddDiscussionPage clickSaveBtn(){
        click(AddDiscussionLocators.getSaveBtn(),"save button");
        return this;
    }
}
