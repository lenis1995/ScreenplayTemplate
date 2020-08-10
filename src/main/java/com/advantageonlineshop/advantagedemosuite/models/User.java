package com.advantageonlineshop.advantagedemosuite.models;

public class User {

    private static String username;
    private static String email;
    private static String password;
    private static String firstName;
    private static String lastName;
    private static String phoneNumber;
    private static String city;
    private static String address;
    private static String state;
    private static String postalCode;

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

    public static String getUsername() {
        return username;
    }
    public static String getEmail() {
        return email;
    }
    public static String getPassword() { return password; }
    public static String getFirstName() { return firstName; }
    public static String getLastName() { return lastName; }
    public static String getPhoneNumber() { return phoneNumber; }
    public static String getCity() { return city; }
    public static String getAddress() { return address; }
    public static String getState() { return state; }
    public static String getPostalCode() { return postalCode; }

    public static User createUser(String[] userData) {
        System.out.println(userData.length);
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
