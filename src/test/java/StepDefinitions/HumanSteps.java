package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class HumanSteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    @And("Click on the element in the left Nav")
    public void clickOnTheElementInTheLeftNav(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for(int i=0;i<listElement.size();i++) {
            ln.findAndClick(listElement.get(i));
        }
    }
    @And("Click on the element in the Dialog")
    public void clickOnTheElementInTheDialog(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for(int i=0;i<listElement.size();i++) {
            dc.findAndClick(listElement.get(i));
        }
    }
    @And("User sending the keys in Dialog content")
    public void userSendingTheKeysInDialogContent(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for(int i=0;i<listElement.size();i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }
    @And("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContainsText("successMessage","success");
    }
    @And("User delete item from Dialog")
    public void userDeleteItemFromDialog(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for(int i=0;i<listElement.size();i++) {
            dc.SearchAndDelete(listElement.get(i));
        }
    }
    @And("Success message should displayed")
    public void successMessageShouldDisplayed() {
        dc.findAndContainsText("successDeleted","Grade Level successfully deleted");
    }
    @And("User choose the stage option")
    public void userChooseTheStageOption(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for(int i=0;i<listElement.size();i++) {
            dc.findAndClick(listElement.get(i));
        }
    }
    @And("Robot press esc")
    public void robotPressEsc() throws AWTException {
        Robot rbt= new Robot();
        rbt.keyPress(KeyEvent.VK_ESCAPE);
        rbt.keyRelease(KeyEvent.VK_ESCAPE);
    }
}
