package com.advantageonlineshop.advantagedemosuite.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserData {

    public UserData(String username,String email,String password) throws IOException {
        userProperties = new Properties();
        filePath = new FileInputStream(System.getProperty("user.dir") + "src\\test\\resources\\userdata\\userData.properties");
        userProperties.load(filePath);

    }
    public static String Username(){
        return userProperties.getProperty("username");
    }
    public static String Email(){
        return userProperties.getProperty("email");
    }
    public static String Password(){
        return userProperties.getProperty("password");
    }

    private static Properties userProperties;
    private static FileInputStream filePath;
}
