package com.gfarkas.emailapp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength = 10;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "company.com";

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("Email created: " + this.firstName + " " + this.lastName);

        // Call a function asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // Call a function that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        // Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your email address is: " + email);

    }


    // Ask for department
    private String setDepartment() {

        System.out.print("Department codes\n\n1 for sales\n2 for Development\n3 for Accounting\n0 for none");
        System.out.println();
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();

        if (depChoice == 1) return "sales";
        else if (depChoice == 2) return "dev";
        else if (depChoice == 3) return "acct";
        else return "";

    }

    // Generate a random password
    private String randomPassword(int length) {

        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
        char[] password = new char[length];

        for (int i = 0; i < length; i++) {

            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);

        }

        return new String(password);

    }



    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity) {

        this.mailboxCapacity = capacity;

    }

    // Set the alternate email
    public void setAlternateEmail(String email) {

        this.alternateEmail = email;

    }

    // Change the password
    public void setPassword(String password) {

        this.password = password;

    }
}
