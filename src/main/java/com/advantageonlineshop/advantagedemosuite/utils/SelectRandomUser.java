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

public class SelectRandomUser {

    private static List<User> readUsersFromCSV(String fileName) {

        List<User> users = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(",");
                User user = createUser(attributes);
                users.add(user);
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return users;
    }

    private static User createUser(String[] metadata) {
        String name = metadata[0];
        int price = Integer.parseInt(metadata[1]);
        String author = metadata[2];
        return new User(name, price, author);
    }
}


