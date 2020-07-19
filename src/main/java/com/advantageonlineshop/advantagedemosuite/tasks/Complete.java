package com.advantageonlineshop.advantagedemosuite.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.advantageonlineshop.advantagedemosuite.userinterfaces.RegisterPageObjects.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Complete implements Task {

    public Complete(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public static Complete theRegister(String username, String email, String password) {
        return instrumented(Complete.class, username, email, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(USER_NAME),
                Enter.theValue(email).into(USER_EMAIL),
                Enter.theValue(password).into(USER_PASSWORD),
                Enter.theValue(password).into(USER_CONFIRM_PASSWORD),
                Click.on(ALLOW_OFFERS),
                Click.on(CONDITIONS_CHECKBOX),
                Click.on(REGISTER_BUTTON));
    }
    private String username;
    private String email;
    private String password;
}
