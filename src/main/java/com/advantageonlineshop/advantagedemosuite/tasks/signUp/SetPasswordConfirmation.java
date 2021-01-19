package com.advantageonlineshop.advantagedemosuite.tasks.signUp;

import com.advantageonlineshop.advantagedemosuite.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.advantageonlineshop.advantagedemosuite.userinterfaces.RegisterPageObjects.USER_CONFIRM_PASSWORD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SetPasswordConfirmation implements Task {

    public SetPasswordConfirmation(User user) {
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(USER_CONFIRM_PASSWORD),
                Enter.theValue(user.getPassword()).into(USER_CONFIRM_PASSWORD)
        );
    }

    public static SetPasswordConfirmation with(User user) {
        return instrumented(SetPasswordConfirmation.class, user);
    }

    private final User user;
}
