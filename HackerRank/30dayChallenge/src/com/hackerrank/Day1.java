package com.hackerrank;

import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) {
    //30-data-types
	// write your code here

        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        /* Declare second integer, double, and String variables. */
        int iInput = scan.nextInt();
        double dInput = scan.nextDouble();
        String sInput = scan.next();

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+iInput);
        /* Print the sum of the double variables on a new line. */
        System.out.println(i+dInput);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */

        StringBuilder result = new StringBuilder();
        result.append(s);
        result.append(sInput);

        System.out.println(result.toString());
    }
}
