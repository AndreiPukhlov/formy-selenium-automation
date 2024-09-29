package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CompleteWebForm extends FormsPage{

    @FindBy(id = "first-name")
    WebElement firstName;

    @FindBy(id = "last-name")
    WebElement lastName;

    @FindBy(id = "job-title")
    WebElement jobTitle;

    @FindBy(id = "radio-button-2")
    WebElement educationLevelCollege;

    @FindBy(id="checkbox-1")
    WebElement genderMale;

    @FindBy(id = "select-menu")
    WebElement dropDown;
    
    @FindBy(id = "datepicker")
    WebElement datePicker;

    @FindBy(xpath = "//*[text()='Submit']")
    WebElement submitButton;





    public CompleteWebForm(){setUrl("https://formy-project.herokuapp.com/form");}

    public void enterFirstName(String fName) {
        sendKeys(firstName, fName);
    }

    public void enterLastName(String lName) {
        sendKeys(lastName, lName);
    }

    public void enterJobTitle(String jTitle) {
        sendKeys(jobTitle, jTitle);
    }

    public void chooseEducationLevel() {
       click(educationLevelCollege);
    }

    public void chooseGender() {
        click(genderMale);
    }

    public void selectYearsOfExperience(String yearsExperience) {
        new Select(dropDown).selectByVisibleText(yearsExperience);
    }

    public void selectDate(String date) {
        sendKeys(datePicker, date);
    }

    public void submitForm() {
        click(submitButton);
    }


}
