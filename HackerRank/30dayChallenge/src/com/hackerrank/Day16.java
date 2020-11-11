package com.hackerrank;
import java.util.Scanner;

public class Day16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        try{
            int result = Integer.parseInt(S);
            System.out.println(result);
        }catch(NumberFormatException ex){
            System.out.println("Bad String");
        }
        
    }
}
