package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DatePickerPage extends FormsPage{

    public DatePickerPage(){
        setUrl("https://formy-project.herokuapp.com/datepicker");
    }

    @FindBy(id = "datepicker")
    WebElement dateField;

    public void enterToDateField(String text){
        dateField.sendKeys(text);
    }

    public String getValueFromTheField(){
        return dateField.getAttribute("value");
    }
}
