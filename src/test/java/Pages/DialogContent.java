package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(id="mat-input-0")
    private WebElement username;

    @FindBy(id="mat-input-1")
    private WebElement password;

    @FindBy(css="button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath="(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'BUTTON.ADD')]//button")
    private WebElement addButton2;

    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath="//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;

    @FindBy(xpath="//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExist;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeDialog;

    @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input)[1]")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-pen-to-square']")
    private WebElement editButton2;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogBtn;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    private WebElement integrationCode;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    private WebElement priorityCode;

    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    private WebElement acceptCookies;

    @FindBy(xpath = "//ms-edit-button//button")
    private WebElement editButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='order']//input")
    private WebElement orderInput;

    @FindBy(xpath = "//span[text()='Next Grade']")
    private WebElement nextGrade;

    @FindBy(xpath = "//mat-option[contains(@id,'mat-option')][3]/span")
    private WebElement nextGradeOptions;

    @FindBy(xpath = "//td[text()=' Cloudy ']/../td[7]/div/ms-edit-button/button")
    private WebElement editButtonOption;

    @FindBy(xpath = "//td[text()=' Cloudy ']/../td[7]/div//ms-delete-button//button")
    private WebElement deleteButtonOption;

    @FindBy(xpath = "//div[text()='Grade Level successfully deleted']")
    private WebElement successDeleted;

    @FindBy (xpath = "//ms-integer-field[@formcontrolname='capacity']/input")
    private WebElement capacity;

    @FindBy (xpath = "//mat-slide-toggle[@formcontrolname='active']//span[1]/span[1]/span")
    private WebElement activeButton;

    @FindBy (xpath = "//mat-select[@formcontrolname='type']//div/div/span[1]/span")
    private WebElement locType;

    @FindBy(xpath = "(//div[contains(@class,'mat-select-')])[3]")
    private WebElement stage;

    @FindBy(xpath = "//span[text()=' Certificate ']")
    private WebElement certificate;

    @FindBy(xpath = "(//span[text()=' New Auckland School '])")
    private WebElement newauch;



    WebElement myElement;
    public void findAndSend(String strElement, String value){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "username" : myElement =username; break;
            case "password" : myElement =password; break;
            case "nameInput" : myElement =nameInput; break;
            case "codeInput" : myElement =codeInput; break;
            case "shortName" : myElement =shortName; break;
            case "searchInput" : myElement =searchInput; break;
            case "integrationCode" : myElement =integrationCode; break;
            case "priorityCode" : myElement =priorityCode; break;
            case "orderInput" : myElement =orderInput; break;
            case "capacity" : myElement = capacity; break;
            case "locType" : myElement = locType; break;
        }
        sendKeysFunction(myElement, value);
    }
    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "loginButton" : myElement =loginButton; break;
            case "addButton" : myElement =addButton; break;
            case "addButton2" : myElement =addButton2; break;
            case "saveButton" : myElement =saveButton; break;
            case "closeDialog" : myElement =closeDialog; break;
            case "searchButton" : myElement =searchButton; break;
            case "editButton2":myElement=editButton2;break;
            case "deleteButton" : myElement =deleteButton; break;
            case "deleteDialogBtn" : myElement =deleteDialogBtn; break;
            case "acceptCookies" : myElement =acceptCookies; break;
            case "editButton" : myElement =editButton; break;
            case "nextGrade" : myElement =nextGrade; break;
            case "nextGradeOptions" : myElement =nextGradeOptions; break;
            case "editButtonOption" : myElement =editButtonOption; break;
            case "deleteButtonOption" : myElement =deleteButtonOption; break;
            case "activeButton" : myElement = activeButton; break;
            case "stage" : myElement =stage;break;
            case "certificate" : myElement = certificate;break;
            case "newauch":myElement=newauch;break;

        }

        clickFunction(myElement);
    }
    public void findAndContainsText(String strElement, String text){
        switch (strElement)
        {
            case "dashboard" : myElement =dashboard; break;
            case "successMessage" : myElement =successMessage; break;
            case "alreadyExist" : myElement =alreadyExist; break;
            case "successDeleted" : myElement =successDeleted; break;
        }
        verifyContainsText(myElement,text);
    }
    public void SearchAndDelete(String searchText){
        findAndSend("searchInput", searchText); // aranacak kelimeyi kutucuğa gönder
        findAndClick("searchButton"); // arama butonuna bas

        waitUntilLoading();

        findAndClick("deleteButton");// silme butonua bas
        findAndClick("deleteDialogBtn");// dilogdaki silme butonuna bas
    }


}
