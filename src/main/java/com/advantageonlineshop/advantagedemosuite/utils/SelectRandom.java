package com.advantageonlineshop.advantagedemosuite.utils;

import com.advantageonlineshop.advantagedemosuite.models.User;
import java.util.List;
import java.util.Random;

public class SelectRandom {

    public static User User(){
        List<User> users = GenerateUsers.fromCSVFile();
        Random random = new Random();
        User randomUser = users.get(random.nextInt(users.size()));
        return randomUser;
    }

    /*public class RandomElement {

        public static WebElementFacade randomElement(Actor actor,Target target) {
            List<WebElementFacade> listElements = target.resolveAllFor(actor);
            int elementPosition = (int) (Math.random()*listElements.size());
            return listElements.get(elementPosition);
        }
    }*/


}


