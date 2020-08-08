package com.advantageonlineshop.advantagedemosuite.stepdefinitions;

import com.advantageonlineshop.advantagedemosuite.tasks.OpenTheBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import java.io.IOException;
import static com.advantageonlineshop.advantagedemosuite.userinterfaces.AdvantageDemoHomePage.advantageDemoHomePage;
import static com.advantageonlineshop.advantagedemosuite.userinterfaces.HomePageObjects.USER_BUTTON;
import static com.advantageonlineshop.advantagedemosuite.userinterfaces.UserMenuObjects.CREATE_NEW_ACCOUNT;
import static java.util.concurrent.TimeUnit.SECONDS;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;


public class SignIn {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;

    @Before
    public void setUp() throws IOException {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User")
                .can(BrowseTheWeb.with(hisBrowser));
        hisBrowser.manage().timeouts().implicitlyWait(15, SECONDS);
        hisBrowser.manage().window().maximize();
        hisBrowser.manage().deleteAllCookies();
    }

    @Given("^that user get to AdvantageDemo shopping page$")
    public void thatUserGetToAdvantageDemoShoppingPage() throws Exception {
        theActorInTheSpotlight().attemptsTo(OpenTheBrowser.on(advantageDemoHomePage()));
    }

    @And("^access to Sign In form$")
    public void accessToSignInForm() throws Exception {
        theActorInTheSpotlight().attemptsTo(WaitUntil.the(USER_BUTTON, isEnabled()));
        theActorInTheSpotlight().attemptsTo((Click.on(USER_BUTTON)), Click.on(CREATE_NEW_ACCOUNT));
    }

    @When("^I fill all the required fields$")
    public void iFillAllTheRequiredFields() throws Exception {
//        User.attemptsTo(Complete.theRegister();
    }

    @Then("^I should be successfully logged on$")
    public void iShouldBeSuccessfullyLoggedOn() throws Exception {
    }

}
