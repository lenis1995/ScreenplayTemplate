package com.advantageonlineshop.advantagedemosuite.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Get implements Task {

    public Get(Target userLink){
        this.userLink=userLink;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(userLink));
    }

    public static Get into(Target userLink) {
        return instrumented(Get.class, userLink);
    }

    private Target userLink;
}
