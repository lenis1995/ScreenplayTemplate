package com.advantageonlineshop.advantagedemosuite.tasks.signUp;

import com.advantageonlineshop.advantagedemosuite.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.advantageonlineshop.advantagedemosuite.userinterfaces.RegisterPageObjects.USER_ADDRESS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SetCountry implements Task {

    public SetCountry(User user){
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(USER_ADDRESS),
                Enter.theValue(user.getAddress()).into(USER_ADDRESS)
        );
    }
    public static SetCountry with(User user) {
        return instrumented(SetCountry.class, user);
    }
    private User user;
}
