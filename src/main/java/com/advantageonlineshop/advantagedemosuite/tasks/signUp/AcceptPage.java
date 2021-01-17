package com.advantageonlineshop.advantagedemosuite.tasks.signUp;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.advantageonlineshop.advantagedemosuite.userinterfaces.RegisterPageObjects.ALLOW_OFFERS_CHECKBOX;
import static com.advantageonlineshop.advantagedemosuite.userinterfaces.RegisterPageObjects.CONDITIONS_CHECKBOX;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AcceptPage implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ALLOW_OFFERS_CHECKBOX),
                Click.on(CONDITIONS_CHECKBOX)
        );
    }

    public static AcceptPage conditions(){return instrumented(AcceptPage.class);}
}
