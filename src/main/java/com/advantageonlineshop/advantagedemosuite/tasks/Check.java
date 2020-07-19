package com.advantageonlineshop.advantagedemosuite.tasks;

import static com.advantageonlineshop.advantagedemosuite.userinterfaces.HomePageObjects.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.junit.Assert;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Check implements Task {

    public Check(String username) {
        this.username = username;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Assert.assertEquals("The username isn't equal",username, USER_NAME.toString());
    }

    public static Check theUsername(String username) {
        return instrumented(Check.class, username);
    }

    private String username;
}
