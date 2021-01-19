package com.advantageonlineshop.advantagedemosuite.tasks.signUp;

import com.advantageonlineshop.advantagedemosuite.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.advantageonlineshop.advantagedemosuite.userinterfaces.RegisterPageObjects.USER_LAST_NAME;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SetLastname implements Task {

    public SetLastname(User user){
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(USER_LAST_NAME),
                Enter.theValue(user.getLastName()).into(USER_LAST_NAME)
        );
    }
    public static SetLastname with(User user) {
        return instrumented(SetLastname.class, user);
    }
    private final User user;
}
