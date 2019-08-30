package com.gfarkas.emailapp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("Email created: " + this.firstName + " " + this.lastName);

        // Call a function asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // Call a function that returns a random number

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


    // Set the mailbox capacity

    // Set the alternate email

    // Change the password
}
