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

import static com.advantageonlineshop.advantagedemosuite.constants.UserData.USERS_DATA_PATH;
import static com.advantageonlineshop.advantagedemosuite.models.User.createUser;


public class GenerateUsers {

    public static List<User> fromCSVFile() {

        List<User> users = new ArrayList<>();
        Path pathToFile = Paths.get(USERS_DATA_PATH);

        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8)) {

            String line = br.readLine();
            while (line != null) {

                String[] attributes = line.split(",");
                if (attributes.length >= 1) {
                    User user = createUser(attributes);
                    users.add(user);
                    line = br.readLine();
                } else {
                    break;
                }
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return users;

    }

}




