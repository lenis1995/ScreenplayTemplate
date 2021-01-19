package com.advantageonlineshop.advantagedemosuite.tasks.signUp;

import com.advantageonlineshop.advantagedemosuite.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.advantageonlineshop.advantagedemosuite.userinterfaces.RegisterPageObjects.USER_POSTAL_CODE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SetPostalCode implements Task {

    public SetPostalCode(User user){
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(USER_POSTAL_CODE),
                Enter.theValue(user.getPostalCode()).into(USER_POSTAL_CODE)
        );
    }
    public static SetPostalCode with(User user) {
        return instrumented(SetPostalCode.class, user);
    }
    private final User user;
}
