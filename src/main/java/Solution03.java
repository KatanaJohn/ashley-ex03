/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Ashley
 */

import java.util.Scanner;


public class Solution03 {

    /*
    prompt user to enter a quote
    read the input into a quote string
    prompt the user to enter a name
    read the input into a person string
    print out the entire statement with the person/quote
     */

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the quote? ");
        String quote = input.nextLine();

        System.out.print("Who said it? ");
        String person = input.nextLine();

        System.out.print(person + " says, " + quote);

    }
}
