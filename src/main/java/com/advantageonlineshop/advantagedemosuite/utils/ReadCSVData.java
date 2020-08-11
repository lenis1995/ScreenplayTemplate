package com.advantageonlineshop.advantagedemosuite.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;



public class ReadCSVData {

    public static void main(String[] args){
        List<User> users=randomUser();

        for (User u:users){
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
                  if(attributes.length>1) {
                      User user=createUser(attributes);
                      users.add(user);
                      line = br.readLine();
                  }else{break;}
              }

         }
         catch (IOException ioe) { ioe.printStackTrace();
         }
         return users;
         }
    public static User createUser(String[] userData) {
        String username = userData[0];
        String email = userData[1];
        String password = userData[2];
        String firstName = userData[3];
        String lastName = userData[4];
        String phoneNumber = userData[5];
        String city = userData[6];
        String address = userData[7];
        String state = userData[8];
        String postalCode = userData[9];

        return new User(username, email, password, firstName, lastName, phoneNumber, city, address, state, postalCode);
    }

}
class User {

    private String username;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String city;
    private String address;
    private String state;
    private String postalCode;

    public User(String username, String email, String password, String firstName, String lastName, String phoneNumber, String city, String address, String state, String postalCode) {

        this.username = username;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.address = address;
        this.state = state;
        this.postalCode = postalCode;
    }
    //GETTERS
    /*public String getUsername() {
        return username;
    }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getCity() { return city; }
    public String getAddress() { return address; }
    public String getState() { return state; }
    public String getPostalCode() { return postalCode; }
    //SETTERS
    public void setUsername(String username) { this.username=username;}
    public void setEmail(String email) { this.email=email; }
    public void setPassword(String password) { this.password=password; }
    public void setFirstName(String firstName) { this.firstName=firstName; }
    public void setLastName(String lastName) { this.lastName=lastName; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber=phoneNumber; }
    public void setCity(String city) { this.city=city; }
    public void setAddress(String address) { this.address=address; }
    public void setState(String state) { this.state=state; }
    public void setPostalCode(String postalCode) { this.postalCode=postalCode; }*/

    @Override public String toString() {
        return "User [name=" + username + ", firstname=" + firstName + ", lastname=" + lastName + "]"; }

}

