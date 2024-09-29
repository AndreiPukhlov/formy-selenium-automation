package pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class CheckBoxesPage extends BasePage{

    public CheckBoxesPage(){setUrl("https://formy-project.herokuapp.com/checkbox");}

    @FindBy(id = "checkbox-1")
    WebElement checkbox_1;

    @FindBy(id = "checkbox-2")
    WebElement checkbox_2;

    @FindBy(id = "checkbox-3")
    WebElement checkbox_3;

    public void checkTheSecondCheckBox(){
        checkbox_2.click();
    }

    public void checkTheFirstCheckBox(){
        checkbox_1.click();
    }

    public void checkTheThirdCheckBox(){
        checkbox_3.click();
    }
}

