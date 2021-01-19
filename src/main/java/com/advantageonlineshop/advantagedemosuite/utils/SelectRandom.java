package com.advantageonlineshop.advantagedemosuite.utils;
import com.advantageonlineshop.advantagedemosuite.models.User;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;
import java.util.Random;

public class SelectRandom {


    public static User user(){
        List<User> users = GenerateUsers.fromCSVFile();
        Random random = new Random();
        return users.get(random.nextInt(users.size()));
    }

    public static int country(Actor actor, Target target) {
        Random rand = new Random();
        List<WebElementFacade> optionsList = target.resolveAllFor(actor);
        int optionsSize= optionsList.size();
        return rand.nextInt(optionsSize);
    }

}


