package com.advantageonlineshop.advantagedemosuite.tasks.signUp;

import com.advantageonlineshop.advantagedemosuite.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static com.advantageonlineshop.advantagedemosuite.userinterfaces.RegisterPageObjects.USER_DEPARTMENT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SetDepartment implements Task {

    public SetDepartment(User user){this.user = user;}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user.getState()).into(USER_DEPARTMENT)
        );
    }

    public static SetDepartment with(User user){
        return instrumented(SetDepartment.class,user);
    }

    private User user;
}
