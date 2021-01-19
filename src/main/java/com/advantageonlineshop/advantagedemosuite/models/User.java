package com.advantageonlineshop.advantagedemosuite.models;

public class User {

    private final String username;
    private final String email;
    private final String password;
    private final String firstName;
    private final String lastName;
    private final String phoneNumber;
    private final String city;
    private final String address;
    private final String state;
    private final String postalCode;

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
    public String getUsername() { return username; }
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
