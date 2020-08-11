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

import static com.advantageonlineshop.advantagedemosuite.models.User.createUser;


public class ReadCSVData {

    public static void main(String[] args) {
        List<User> users = randomUser();

        for (User u : users) {
            System.out.println(u);
        }
    }

    public static List<User> randomUser() {

        List<User> users = new ArrayList<>();
        Path pathToFile = Paths.get("src/test/resources/userdata/usersData.csv");

        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {

            String line = br.readLine();
            while (line != null) {

                String[] attributes = line.split(",");
                if (attributes.length > 1) {
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

