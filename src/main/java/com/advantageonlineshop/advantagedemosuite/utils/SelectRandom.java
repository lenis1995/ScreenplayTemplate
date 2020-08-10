package com.advantageonlineshop.advantagedemosuite.utils;

import com.advantageonlineshop.advantagedemosuite.models.User;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.advantageonlineshop.advantagedemosuite.models.User.createUser;
import static java.nio.file.Files.newBufferedReader;


public class SelectRandom {

    public static User user(String filePath) {

        List<User> users = new ArrayList<>();
        Path pathToFile = Paths.get(filePath);

        try (BufferedReader br = newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
            String line = br.readLine();
            while (line != null) {
                String[] values = line.split(",");
                if(values.length>1) {
                    User user = createUser(values);
                    users.add(user);
                    line = br.readLine();
                }else{
                    break;
                }
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        Random rand = new Random();
        User randomUser;
        randomUser = users.get(rand.nextInt(users.size()));
        return randomUser;
    }

}



