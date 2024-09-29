package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.AssertJUnit;
import pages.CompleteWebForm;
import pages.ConfirmationPage;

import static support.TestContext.getData;

public class CompleteWebFormStepdefs {
    @Given("user is on the complete web form page")
    public void userIsOnTheCompleteWebFormPage() {
        new CompleteWebForm().openPage();
    }

    @When("they enter all required information")
    public void theyEnterAllRequiredInformation() {
        CompleteWebForm completeWebForm = new CompleteWebForm();
        completeWebForm.enterFirstName(getData("firstName"));
        completeWebForm.enterLastName(getData("lastName"));
        completeWebForm.enterJobTitle(getData("jobTitle"));
        completeWebForm.chooseEducationLevel();
        completeWebForm.chooseGender();
        completeWebForm.selectYearsOfExperience(getData("yearsExperience"));
        completeWebForm.selectDate(getData("date"));


    }

    @And("they submit the form")
    public void theySubmitTheForm() throws InterruptedException {
        new CompleteWebForm().submitForm();
        Thread.sleep(3000);
    }

    @Then("the form submission confirmed")
    public void theFormSubmissionConfirmed() {
        AssertJUnit.assertTrue(new ConfirmationPage().getSuccessMessage(
        ).contains("The form was successfully submitted!"));
    }
}


