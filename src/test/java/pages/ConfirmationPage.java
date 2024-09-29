package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmationPage extends BasePage{

    @FindBy(xpath = "//*[contains(text(),'The form was successfully submitted!')]")
    WebElement successfulMessage;

    public String getSuccessMessage() {
        return successfulMessage.getText();
    }
}
