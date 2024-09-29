package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AutocompletePage;
import pages.FormsPage;

import static support.TestContext.getData;


public class AutoCompleteStepdefs extends AutocompletePage {
    @Given("user is on the forms page")
    public void userIsOnTheFormsPage() {
    new FormsPage().openPage();
    }

    @When("they enter their address into the address autocomplete fields")
    public void theyEnterTheirAddressIntoTheAddressAutocompleteFields() {
    goToAutoCompleteField();
    fillInAddress("20800 Homestead Rd, Cupertino, CA");
    }

    @Then("the error message is displayed")
    public void theErrorMessageIsDisplayed() {
    Assert.assertEquals(getData("errorMessage"), errorMessage());
    }

    @When("they go to the autocomplete page")
    public void theyGoToTheAutocompletePage() {
        new AutocompletePage().openPage();
    }


}
