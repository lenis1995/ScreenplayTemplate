package com.advantageonlineshop.advantagedemosuite.stepdefinitions;

import com.advantageonlineshop.advantagedemosuite.models.User;
import com.advantageonlineshop.advantagedemosuite.tasks.signUp.*;
import com.advantageonlineshop.advantagedemosuite.utils.SelectRandom;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static com.advantageonlineshop.advantagedemosuite.userinterfaces.AdvantageDemoHomePage.advantageDemoHomePage;
import static com.advantageonlineshop.advantagedemosuite.userinterfaces.HomePageObjects.*;
import static com.advantageonlineshop.advantagedemosuite.userinterfaces.RegisterPageObjects.*;
import static com.advantageonlineshop.advantagedemosuite.utils.Highlighter.highlightElement;
import static java.util.concurrent.TimeUnit.SECONDS;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

@SuppressWarnings("ALL")
public class SignIn {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;

    @Steps
    User userInfo = SelectRandom.user();

    @Before
    public void setUp() throws IOException {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User")
                .can(BrowseTheWeb.with(hisBrowser));
        hisBrowser.manage().timeouts().implicitlyWait(10, SECONDS);
        hisBrowser.manage().window().maximize();
        hisBrowser.manage().deleteAllCookies();
    }
    @Given("^that user get to AdvantageDemo shopping page$")
    public void thatUserGetToAdvantageDemoShoppingPage() throws Exception {
        theActorInTheSpotlight().attemptsTo(Open.browserOn(advantageDemoHomePage()));
    }

    @And("^access to Sign In form$")
    public void accessToSignInForm() throws Exception {
        //Actor Expected Conditions Waits
        theActorInTheSpotlight().wasAbleTo(WaitUntil.the(PAGE_LOADER,isNotCurrentlyVisible()));
        theActorInTheSpotlight().wasAbleTo(WaitUntil.the(USER_BUTTON,isClickable()));
        //Actor Interactions
        highlightElement(hisBrowser,USER_BUTTON.resolveFor(theActorInTheSpotlight()));
        theActorInTheSpotlight().attemptsTo((Click.on(USER_BUTTON)));
        //Actor Expected Conditions Waits
        theActorInTheSpotlight().wasAbleTo(WaitUntil.the((LOGIN_MODAL),isVisible()));
        theActorInTheSpotlight().wasAbleTo(WaitUntil.the((CREATE_NEW_ACCOUNT_BUTTON),isVisible()));
        //Actor Interactions
        highlightElement(hisBrowser,CREATE_NEW_ACCOUNT_BUTTON.resolveFor(theActorInTheSpotlight()));
        theActorInTheSpotlight().attemptsTo((Click.on(CREATE_NEW_ACCOUNT_BUTTON)));
    }
    @When("^I fill all the required fields$")
    public void iFillAllTheRequiredFields() throws Exception {
        //Actor Expected Conditions Waits
        theActorInTheSpotlight().wasAbleTo(WaitUntil.the((SIGN_UP_FORM),isVisible()));
        theActorInTheSpotlight().wasAbleTo(
                SetUsername.with(userInfo),
                SetEmail.with(userInfo),
                SetPassword.with(userInfo),
                SetPasswordConfirmation.with(userInfo),
                SetFirstname.with(userInfo),
                SetLastname.with(userInfo),
                SetPhoneNumber.with(userInfo),
                Scroll.to(USER_FIRST_NAME),
                SetCountry.as(USER_COUNTRY),
                SetCity.with(userInfo),
                SetAddress.with(userInfo),
                SetDepartment.with(userInfo),
                SetPostalCode.with(userInfo),
                AcceptPage.conditions(),
                Finish.register()
        );

    }

    @Then("^I should be successfully logged on$")
    public void iShouldBeSuccessfullyLoggedOn() throws Exception {

    }
}
