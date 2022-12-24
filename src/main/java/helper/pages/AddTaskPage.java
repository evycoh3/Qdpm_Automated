package helper.pages;

import helper.pages.locators.AddTaskLocators;
import helper.pages.locators.DashBoardLocators;
import org.openqa.selenium.By;

public class AddTaskPage extends BasePage {

    public AddTaskPage setProjectName(String projectName){
        selectByVisibleText(AddTaskLocators.getProjectName(),projectName,"project name");
        return this;
    }
    public AddTaskPage setTaskType(String taskType){
        selectByVisibleText(AddTaskLocators.getTYPE(),taskType,"task type");
        return this;
    }
    public AddTaskPage setTaskName(String taskName){
        sendKeys(AddTaskLocators.getNAME(),taskName,"task name");
        return this;
    }
    public AddTaskPage setTaskStatus(String taskStatus){
        selectByVisibleText(AddTaskLocators.getSTATUS(),taskStatus,"task status");
        return this;
    }
    public AddTaskPage setTaskPriority(String taskPriority){
        selectByVisibleText(AddTaskLocators.getPRIORITY(),taskPriority,"task priority");
        return this;
    }
    public AddTaskPage setTaskLabel(String taskLabel){
        selectByVisibleText(AddTaskLocators.getLABEL(),taskLabel,"task label");
        return this;
    }
    public AddTaskPage setTaskAssignedTo(String ...value){
        selectMultipleCheckBox(AddTaskLocators.getAssignedTo(),"task Assigned to ",value);
        return this;
    }
    public AddTaskPage setTaskDescription(String taskDescription){
        switchToFrame(AddTaskLocators.getDescriptionFrame());
        sendKeys(By.tagName("p"),taskDescription,"task description");
        switchToDefaultContent();
        return this;
    }
    public AddTaskPage setCreatedBy(String createdBy){
        selectByVisibleText(AddTaskLocators.getCreatedBy(),createdBy,"task created by");
        return this;
    }
    public AddTaskPage clickSaveBtn(){
        click(AddTaskLocators.getSaveBtn(),"save button");
        return this;
    }



}
