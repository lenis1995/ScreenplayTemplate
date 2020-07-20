package com.advantageonlineshop.advantagedemosuite.stepdefinitions;

import com.advantageonlineshop.advantagedemosuite.tasks.Check;
import com.advantageonlineshop.advantagedemosuite.tasks.Complete;
import com.advantageonlineshop.advantagedemosuite.tasks.OpenTheBrowser;
import com.advantageonlineshop.advantagedemosuite.userinterfaces.AdvantageDemoHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.advantageonlineshop.advantagedemosuite.userinterfaces.HomePageObjects.USER_BUTTON;
import static com.advantageonlineshop.advantagedemosuite.userinterfaces.UserMenuObjects.CREATE_NEW_ACCOUNT;
import static com.advantageonlineshop.advantagedemosuite.utils.UserData.*;
import static java.util.concurrent.TimeUnit.SECONDS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class SignIn {

    @Before
    public void setUp() throws IOException {
        hisBrowser.manage().timeouts().implicitlyWait(10, SECONDS);
        hisBrowser.manage().window().maximize();
        hisBrowser.manage().deleteAllCookies();
        User.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^that user get to AdvantageDemo shopping page$")
    public void thatUserGetToAdvantageDemoShoppingPage() throws Exception {
        User.wasAbleTo(OpenTheBrowser.on(advantageDemoHomePage));
    }

    @And("^access to Sign In form$")
    public void accessToSignInForm() throws Exception {
        User.attemptsTo(WaitUntil.the(USER_BUTTON, isClickable()));
        User.attemptsTo((Click.on(USER_BUTTON)), Click.on(CREATE_NEW_ACCOUNT));
    }

    @When("^I fill all the required fields$")
    public void iFillAllTheRequiredFields() throws Exception {
        User.attemptsTo(Complete.theRegister(Username(),Email(),Password()));
    }

    @Then("^I should be successfully logged on$")
    public void iShouldBeSuccessfullyLoggedOn() throws Exception {
        User.attemptsTo(Check.theUsername(User));
    }

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor User = Actor.named("User");
    private AdvantageDemoHomePage advantageDemoHomePage;
    private Properties prop;
    private FileInputStream filePath;

}
