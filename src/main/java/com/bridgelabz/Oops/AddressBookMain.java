package com.bridgelabz.Oops;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Address Book Program");
        System.out.println("Enter the First Name");
        String firstName = sc.next();
        System.out.println("Enter the Last Name");
        String lastName = sc.next();
        System.out.println("Enter The Address");
        String address = sc.next();
        System.out.println("Enter the city");
        String city = sc.next();
        System.out.println("Enter the state");
        String state = sc.next();
        System.out.println("Enter the zip Code");
        int zip = sc.nextInt();
        System.out.println("Enter the Phone number");
        long phone = sc.nextLong();
        List<ContactDetails> contactList = new ArrayList<>();
        ContactDetails contact = new ContactDetails(firstName, lastName, address, city, state, zip, phone);
        contactList.add(contact);

    }

}

