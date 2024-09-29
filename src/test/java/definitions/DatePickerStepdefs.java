package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DatePickerPage;

import static support.TestContext.getData;

public class DatePickerStepdefs {
    @When("user goes to the date picker page")
    public void userGoesToTheDatePickerPage() {
        new DatePickerPage().openPage();
    }

    @And("enter the date to the date field")
    public void enterTheDateToTheDateField() {

        new DatePickerPage().enterToDateField(getData("date"));
    }

    @Then("the date is saved correctly")
    public void theDateIsSavedCorrectly() {
        Assert.assertEquals(getData("middleName"), new DatePickerPage().getValueFromTheField());
    }
}
