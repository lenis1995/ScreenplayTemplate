package com.advantageonlineshop.advantagedemosuite.tasks.signUp;

import com.advantageonlineshop.advantagedemosuite.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.advantageonlineshop.advantagedemosuite.userinterfaces.RegisterPageObjects.USER_PHONE_NUMBER;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SetPhoneNumber implements Task {

    public SetPhoneNumber(User user){
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(USER_PHONE_NUMBER),
                Enter.theValue(user.getPhoneNumber()).into(USER_PHONE_NUMBER)
        );
    }
    public static SetPhoneNumber with(User user) {
        return instrumented(SetPhoneNumber.class, user);
    }
    private final User user;
}
