package com.gfarkas.emailapp;

public class EmailApp {

    public static void main(String[] args) {

        Email em1 = new Email("John", "Smith");

        em1.setAlternateEmail("info@gfarkas.com");

        System.out.println("Your alternate email is: " + em1.getAlternateEmail());

    }

}
