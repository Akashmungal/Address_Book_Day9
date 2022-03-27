package com.bridgelabz;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book Program");
        Contacts contact = new Contacts("Akash", "Patil ", "Santosh Nagar ", "Pune ",
                "Maharashtra", 416353l, 8390308871l, "akash.com ");
        System.out.println("Name : " +contact.getFirstName()+ " " +contact.getLastName());
        System.out.println("Address : " +contact.getAddress());
        System.out.println("City : " +contact.getCity());
        System.out.println("State : " +contact.getState());
        System.out.println("Zip Code : " +contact.getZip());
        System.out.println("Phone Number : " +contact.getPhoneNumber());
        System.out.println("E-Mail Id : " +contact.getEmail());
    }
}

