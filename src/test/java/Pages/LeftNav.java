package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Departments']")
    private WebElement departments;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement countries;

    @FindBy(xpath = "//span[text()='Citizenships']")
    private WebElement citizenShip;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;

    @FindBy(xpath = "//span[text()='Fees']")
    private WebElement fees;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExamsOne;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement setupTwo;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExamsTwo;

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement setupThree;

    @FindBy(xpath = "(//span[text()='Education'])")
    private WebElement Education;

    @FindBy(xpath = "(//span[text()='Setup'])[4]")
    private WebElement Setupfour;

    @FindBy(xpath = "(//span[text()='Subject Categories'])[1]")
    private WebElement SubjectCatagories;

    @FindBy(xpath = "//span[text()='Position Categories']")
    private WebElement position;

    @FindBy(xpath = "//span[text()='Grade Levels']")
    private WebElement gradeLevel;

    @FindBy (xpath = "//span[text()='Attestations']")
    private WebElement attestations;

    @FindBy (xpath = "//span[text()='School Setup']")
    private WebElement schoolSetup;

    @FindBy (xpath = "//span[text()='Locations']")
    private WebElement locations;

    @FindBy(xpath = "//span[contains(text(),'Document')]")
    private WebElement documentTypes;

    @FindBy (xpath = "//span[text()='Fields']")
    private WebElement fields;

    WebElement myElement;
    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "setupOne" : myElement =setupOne; break;
            case "departments":myElement=departments;break;
            case "parameters" : myElement =parameters; break;
            case "countries" : myElement =countries; break;
            case "citizenShip" : myElement =citizenShip; break;
            case "nationalities" : myElement =nationalities; break;
            case "fees" : myElement =fees; break;
            case "entranceExamsOne" : myElement =entranceExamsOne; break;
            case "setupTwo" : myElement =setupTwo; break;
            case "entranceExamsTwo" : myElement =entranceExamsTwo; break;
            case "humanResources" : myElement =humanResources; break;
            case "Education":myElement=Education;break;
            case "Setupfour":myElement=Setupfour;break;
            case "SubjectCatagories":myElement=SubjectCatagories;break;
            case "setupThree" : myElement =setupThree; break;
            case "position" : myElement =position; break;
            case "gradeLevel" : myElement =gradeLevel; break;
            case "attestations" : myElement = attestations; break;
            case "schoolSetup" : myElement = schoolSetup; break;
            case "locations" : myElement = locations; break;
            case "documentTypes" :myElement =documentTypes;break;
            case "fields" : myElement =fields;break;
        }

        clickFunction(myElement);
    }

}
