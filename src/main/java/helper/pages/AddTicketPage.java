package helper.pages;

import helper.pages.locators.AddTicketLocators;

public class AddTicketPage extends BasePage {

    public AddTicketPage setProjectName(String projectName){
        selectByVisibleText(AddTicketLocators.getProjectName(),projectName,"project name");
        return this;
    }
    public AddTicketPage setTicketDepartment(String ticketDepartment){
        selectByVisibleText(AddTicketLocators.getTicketDepartment(),ticketDepartment,"ticket department");
        return this;
    }
    public AddTicketPage setTicketType(String ticketType){
        selectByVisibleText(AddTicketLocators.getTicketType(),ticketType,"ticket type");
        return this;
    }
    public AddTicketPage setTicketStatus(String ticketStatus){
        selectByVisibleText(AddTicketLocators.getTicketStatus(),ticketStatus,"ticket status");
        return this;
    }
    public AddTicketPage setTicketSubject(String ticketSubject){
        sendKeys(AddTicketLocators.getTicketSubject(),ticketSubject,"ticket subject");
        return this;
    }
    public AddTicketPage setTicketDescription(String ticketDescription){
        switchToFrame(AddTicketLocators.getDescriptionFrame());
        sendKeys(AddTicketLocators.getDescriptionInput(),ticketDescription,"ticket description");
        switchToDefaultContent();
        return this;
    }
    public AddTicketPage setTicketCreatedBy(String createdBy){
        selectByVisibleText(AddTicketLocators.getCreatedBy(),createdBy,"ticket created by");
        return this;
    }
    public AddTicketPage setNotifyTo(String ...value){
        selectMultipleCheckBox(AddTicketLocators.getNotifyTo(),"ticket notify to",value);
        return this;
    }
    public AddTicketPage clickSaveBtn(){
        click(AddTicketLocators.getSaveBtn(),"save button");
        return this;
    }
}
