package com.advantageonlineshop.advantagedemosuite.tasks.signUp;

import com.advantageonlineshop.advantagedemosuite.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.advantageonlineshop.advantagedemosuite.userinterfaces.RegisterPageObjects.USER_FIRST_NAME;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SetFirstname implements Task {

    public SetFirstname(User user){
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(USER_FIRST_NAME),
                Enter.theValue(user.getFirstName()).into(USER_FIRST_NAME)
        );
    }
    public static SetFirstname with(User user) {
        return instrumented(SetFirstname.class, user);
    }
    private final User user;
}
