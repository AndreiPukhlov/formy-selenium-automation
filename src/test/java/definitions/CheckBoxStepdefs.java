package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.CheckBoxesPage;

public class CheckBoxStepdefs {
    @When("user goes to checkbox page")
    public void userGoesToCheckboxPage() {
        new CheckBoxesPage().openPage();
    }

    @And("check all check boxes one by one")
    public void checkAllCheckBoxesOneByOne() {
        CheckBoxesPage checkBoxesPage = new CheckBoxesPage();
        checkBoxesPage.checkTheFirstCheckBox();
        checkBoxesPage.checkTheSecondCheckBox();
        checkBoxesPage.checkTheThirdCheckBox();
    }

    @And("uncheck all check boxes")
    public void uncheckAllCheckBoxes() {
        CheckBoxesPage checkBoxesPage = new CheckBoxesPage();
        checkBoxesPage.checkTheFirstCheckBox();
        checkBoxesPage.checkTheSecondCheckBox();
        checkBoxesPage.checkTheThirdCheckBox();
    }
}
