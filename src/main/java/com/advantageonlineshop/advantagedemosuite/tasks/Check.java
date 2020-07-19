package com.advantageonlineshop.advantagedemosuite.tasks;

import static com.advantageonlineshop.advantagedemosuite.userinterfaces.HomePageObjects.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.junit.Assert;

import static com.advantageonlineshop.advantagedemosuite.utils.UserData.Username;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Check implements Task {

    public Check (Actor User){
        this.User=User;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Assert.assertEquals("The username isn't equal",USER_NAME.resolveFor(User).getText(), Username());
    }

    public static Check theUsername(Actor User) {
        return instrumented(Check.class,User);
    }

    private Actor User;
}
