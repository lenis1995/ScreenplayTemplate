package com.advantageonlineshop.advantagedemosuite.tasks.signUp;

import com.advantageonlineshop.advantagedemosuite.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.advantageonlineshop.advantagedemosuite.userinterfaces.RegisterPageObjects.USER_EMAIL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SetEmail implements Task {

    public SetEmail(User user){
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(USER_EMAIL),
                Enter.theValue(user.getEmail()).into(USER_EMAIL)
        );
    }
    public static SetEmail with(User user) {
        return instrumented(SetEmail.class, user);
    }
    private final User user;
}
