/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Seney
 */

import java.util.Scanner;

public class PasswordValidation {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String correctPass = "abc$123";

        System.out.println("What is the username?");
        String inputUser = scanner.next();

        System.out.println("What is the password?");
        String inputPass = scanner.next();

        if (correctPass.equals(inputPass))
        {
            System.out.print("Welcome!");
        }
        else
        {
            System.out.println("I don't know you.");
        }
    }
}
