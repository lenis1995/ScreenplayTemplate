package com.advantageonlineshop.advantagedemosuite.tasks.signUp;

import com.advantageonlineshop.advantagedemosuite.utils.SelectRandom;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.targets.Target;

import static com.advantageonlineshop.advantagedemosuite.userinterfaces.RegisterPageObjects.COUNTRY_OPTIONS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SetCountry implements Task {

    public SetCountry(Target target){
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byIndex(SelectRandom.country(actor,COUNTRY_OPTIONS)).from(target)
        );
    }
    public static SetCountry as(Target target) {
        return instrumented(SetCountry.class,target);
    }

    private final Target target;
}
