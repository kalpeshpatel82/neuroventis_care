package care.neuroventis.steps;/* 
 Created by Kalpesh Patel
 */

import care.neuroventis.pages.AccountPage;
import care.neuroventis.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I press right arrow key to navigate next page of Tutorial page$")
    public void iPressRightArrowKeyToNavigateNextPageOfTutorialPage() {
        new HomePage().clickOnRadioNextButton();
    }

    @And("^I click 'Let's Go'$")
    public void iClickLetSGo() {
        new HomePage().clickOnLetsGoButton();
    }

    @Then("^I navigate to account login options page$")
    public void iNavigateToAccountLoginOptionsPage() {
        Assert.assertEquals("Hi!",new HomePage().loginPageHeader());
    }

    @And("^I select 'I already have an account'$")
    public void iSelectIAlreadyHaveAnAccount() {
        new HomePage().clickOnLoginButton();
    }

    @Then("^I navigate to user login Page$")
    public void iNavigateToUserLoginPage() throws InterruptedException {
    }

    @And("^I Enter valid email address \"([^\"]*)\"$")
    public void iEnterValidEmailAddress(String text){
        try{
            Thread.sleep(3000);
            new HomePage().sendTextToEmailField(text);
        }catch (Exception arg){
            System.out.println("failed");
        }
    }

    @And("^I Enter valid password \"([^\"]*)\"$")
    public void iEnterValidPassword(String text) {
        try {
            Thread.sleep(3000);
            new HomePage().sendTextTPasswordField(text);
        }catch (Exception arg){
            System.out.println("Failed");
        }
    }

    @And("^I click on 'Login' button$")
    public void iClickOnLoginButton() {
        new HomePage().clickOnLogin();
    }

    @Then("^I navigate to the account page$")
    public void iNavigateToTheAccountPage() {
        Assert.assertEquals("Home",new AccountPage().getAccountPageHeader());
    }

    @And("^I click on 'Add Seizure'$")
    public void iClickOnAddSeizure() {
        new AccountPage().clickOnAddSeizureButton();
    }

    @And("^I select on 'Focal Aware Seizure' from type and validate it$")
    public void iSelectOnFocalAwareSeizureFromTypeAndValidateIt() {
        new AccountPage().clickOnSeizureType();
        new AccountPage().clickOnFocalAwareSeizure();
        new AccountPage().clickOnValidateButton();

    }

    @And("^I select 'No' from 'Felt it coming\\?'$")
    public void iSelectNoFromFeltItComing() {
        new AccountPage().clickOnFeltNoRadioButton();
    }

    @And("^I click on 'Save' button$")
    public void iClickOnSaveButton() {
        new AccountPage().clickOnSaveButton();
    }

    @And("^I click on 'Close' button from confirmation message$")
    public void iClickOnCloseButtonFromConfirmationMessage() {
        new AccountPage().clickOnCloseButton();
    }

    @Then("^I verify if 'Focal aware seizure' is added$")
    public void iVerifyIfFocalAwareSeizureIsAdded() {
        Assert.assertEquals("Focal aware seizure",new AccountPage().getFocalAwareText());
    }

    @And("^I click on 'Edit Seizure'$")
    public void iClickOnEditSeizure() {
        new AccountPage().clickOnEditCalender();
    }

    @And("^I click on 'Focal Aware Seizure'$")
    public void iClickOnFocalAwareSeizure() {
        new AccountPage().clickOnEditItem();
    }

    @And("^I select on 'Generalized tonic-clonic seizure' from type and validate it$")
    public void iSelectOnGeneralizedTonicClonicSeizureFromTypeAndValidateIt() {
        new AccountPage().clickOnSeizureType();
        new AccountPage().clickOnGeneralSeizure();
        new AccountPage().clickOnValidateButton();
    }

    @And("^I click on 'Home' button from lower menu$")
    public void iClickOnHomeButtonFromLowerMenu() {
        new AccountPage().clickOnHomeButton();
    }

    @Then("^I verify if 'Generalized tonic-clonic seizure' is added$")
    public void iVerifyIfGeneralizedTonicClonicSeizureIsAdded() {
        Assert.assertEquals("Generalized tonic-clonic seizure",new AccountPage().getGeneralizedText());
    }
}
