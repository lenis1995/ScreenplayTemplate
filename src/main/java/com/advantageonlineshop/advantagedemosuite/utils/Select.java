package com.advantageonlineshop.advantagedemosuite.utils;

import com.advantageonlineshop.advantagedemosuite.models.User;
import java.util.List;
import java.util.Random;

public class Select {

    public static User RandomUser(){
        List<User> users = GenerateUsers.fromCSVFile();
        Random random = new Random();
        User randomUser = users.get(random.nextInt(users.size()));
        return randomUser;
    }

}


