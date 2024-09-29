package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutocompletePage extends BasePage {
    @FindBy(id = "autocomplete")
    WebElement autoCompleteField;

    @FindBy(xpath = "//div[@class='pac-container']//span")
    WebElement errorText;

    @FindBy(xpath = "(//li)[3]")
    WebElement autocomplete;

    public AutocompletePage(){setUrl("https://formy-project.herokuapp.com/autocomplete");}


    public void goToAutoCompleteField(){
    click(autoCompleteField);
    }

    public void fillInAddress(String text){
        sendKeys(autoCompleteField, text);
    }

    public String errorMessage(){
        return errorText.getText();
    }
}
