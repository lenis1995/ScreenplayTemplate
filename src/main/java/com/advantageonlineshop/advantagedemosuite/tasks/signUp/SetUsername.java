package com.advantageonlineshop.advantagedemosuite.tasks.signUp;

import com.advantageonlineshop.advantagedemosuite.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.advantageonlineshop.advantagedemosuite.userinterfaces.RegisterPageObjects.USER_USERNAME;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SetUsername implements Task {

    public SetUsername(User user){
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(USER_USERNAME),
                Enter.theValue(user.getUsername()).into(USER_USERNAME)
        );
    }
    public static SetUsername with(User user) {
        return instrumented(SetUsername.class, user);
    }
    private final User user;
}
