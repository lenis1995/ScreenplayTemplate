package com.advantageonlineshop.advantagedemosuite.stepdefinitions;

import com.advantageonlineshop.advantagedemosuite.tasks.Check;
import com.advantageonlineshop.advantagedemosuite.tasks.Complete;
import com.advantageonlineshop.advantagedemosuite.tasks.Get;
import com.advantageonlineshop.advantagedemosuite.tasks.OpenTheBrowser;
import com.advantageonlineshop.advantagedemosuite.userinterfaces.AdvantageDemoHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static com.advantageonlineshop.advantagedemosuite.userinterfaces.HomePageObjects.USER_BUTTON_LINK;
import static com.advantageonlineshop.advantagedemosuite.userinterfaces.UserMenuObjects.CREATE_NEW_ACCOUNT;
import static java.util.concurrent.TimeUnit.SECONDS;


public class Login {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor User = Actor.named("User");
    private AdvantageDemoHomePage advantageDemoHomePage;

    public void setHisTimeout(WebDriver hisBrowser) {
        this.hisBrowser = hisBrowser;
        hisBrowser.manage().timeouts().implicitlyWait(20, SECONDS);
    }

    @Before
    public void setUp() {
        setHisTimeout(hisBrowser);
        hisBrowser.manage().window().maximize();
        hisBrowser.manage().deleteAllCookies();
        User.can(BrowseTheWeb.with(hisBrowser));
    }
    @Given("^that user get to AdvantageDemo shopping page$")
    public void thatUserGetToAdvantageDemoShoppingPage() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        User.wasAbleTo(OpenTheBrowser.on(advantageDemoHomePage));
    }

    @Given("^access to Sign In form$")
    public void accessToSignInForm() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        String username="Lenis";
        String email="lensThor@outlook.com";
        String password="Ragnark123";
        User.attemptsTo((Get.into(USER_BUTTON_LINK)), Get.into(CREATE_NEW_ACCOUNT), Complete.theRegister(username, email, password));
    }

    @When("^I fill all the required fields$")
    public void iFillAllTheRequiredFields() throws Exception {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I should be successfully logged on$")
    public void iShouldBeSuccessfullyLoggedOn() throws Exception {
        // Write code here that turns the phrase above into concrete actions

    }


}