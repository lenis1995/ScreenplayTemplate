package com.advantageonlineshop.advantagedemosuite.tasks.signUp;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.advantageonlineshop.advantagedemosuite.userinterfaces.RegisterPageObjects.REGISTER_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Finish implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(REGISTER_BUTTON));
    }

    public static Finish register(){
        return instrumented(Finish.class);
    }
}
