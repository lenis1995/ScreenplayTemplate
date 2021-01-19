package com.advantageonlineshop.advantagedemosuite.tasks.signUp;

import com.advantageonlineshop.advantagedemosuite.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.advantageonlineshop.advantagedemosuite.userinterfaces.RegisterPageObjects.USER_CITY;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SetCity implements Task {

    public SetCity(User user){
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(USER_CITY),
                Enter.theValue(user.getCity()).into(USER_CITY)
        );
    }
    public static SetCity with(User user) {
        return instrumented(SetCity.class, user);
    }
    private final User user;
}
