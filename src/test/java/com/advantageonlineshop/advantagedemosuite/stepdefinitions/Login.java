package com.advantageonlineshop.advantagedemosuite.stepdefinitions;

import com.advantageonlineshop.advantagedemosuite.tasks.Check;
import com.advantageonlineshop.advantagedemosuite.tasks.Complete;
import com.advantageonlineshop.advantagedemosuite.tasks.Get;
import com.advantageonlineshop.advantagedemosuite.tasks.OpenTheBrowser;
import com.advantageonlineshop.advantagedemosuite.userinterfaces.AdvantageDemoHomePage;
import cucumber.api.java.Before;
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
    private Actor Alejo = Actor.named("Alejo");
    private AdvantageDemoHomePage advantageDemoHomePage;

    public void setHisTimeout(WebDriver hisBrowser) {
        this.hisBrowser = hisBrowser;
        hisBrowser.manage().timeouts().implicitlyWait(20, SECONDS);
    }

    @Before
    public void setUp() {
        setHisTimeout(hisBrowser);
        hisBrowser.manage().window().maximize();
        Alejo.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^that Alejo get to shopping page$")
    public void thatAlejoGetToShoppingPage() throws Exception {
        Alejo.wasAbleTo(OpenTheBrowser.on(advantageDemoHomePage));
    }
    @When("^he signs in with username \"([^\"]*)\" email \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void heSignsInWithUsernameEmailAndPassword(String username, String email, String password    ) throws Exception {
        Alejo.attemptsTo((Get.into(USER_BUTTON_LINK)), Get.into(CREATE_NEW_ACCOUNT), Complete.theRegister(username, email, password));
    }
    @Then("^he should be successfully logged on with username \"([^\"]*)\"$")
    public void heShouldBeSuccessfullyLoggedOnWithUsername(String username) throws Exception {
      Alejo.attemptsTo(Check.theUsername(username));
    }
    @When("^he enters his valid data$")
    public void heEntersHisValidData() throws Exception {

    }

    @When("^he choose a product$")
    public void heChooseAProduct() throws Exception {

    }

    @Then("^he should see the product in the cart$")
    public void heShouldSeeTheProductInTheCart() throws Exception {

    }
}