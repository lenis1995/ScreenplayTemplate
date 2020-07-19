package com.advantageonlineshop.advantagedemosuite.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenTheBrowser implements Task {

    public OpenTheBrowser(PageObject desiredPage) {
        this.desiredPage = desiredPage;
    }

    @Override
    @Step("{0}: Opens the browser on AdvantageDemo Home Page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(desiredPage));
    }

    public static OpenTheBrowser on(PageObject desiredPage) {
        return instrumented(OpenTheBrowser.class,desiredPage);
    }

    private PageObject desiredPage;
}
