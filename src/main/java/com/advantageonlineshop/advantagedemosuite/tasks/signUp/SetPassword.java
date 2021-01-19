package com.advantageonlineshop.advantagedemosuite.tasks.signUp;

import com.advantageonlineshop.advantagedemosuite.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.advantageonlineshop.advantagedemosuite.userinterfaces.RegisterPageObjects.USER_PASSWORD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SetPassword implements Task {

    public SetPassword(User user){
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(USER_PASSWORD),
                Enter.theValue(user.getPassword()).into(USER_PASSWORD)
        );
    }
    public static SetPassword with(User user) {
        return instrumented(SetPassword.class, user);
    }
    private final User user;
}
