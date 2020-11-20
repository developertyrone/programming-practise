package com.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Pattern;

import sun.jvm.hotspot.gc.shared.CollectedHeap;

public class Day28 {
    private static final Scanner scanner = new Scanner(System.in);

    //riya riya@gmail.com
    public static void main(String[] args) {
        ArrayList<String> matches = new ArrayList<String>();
        String myRegExString = "[a-z]+@gmail.com";
        Pattern p = Pattern.compile(myRegExString);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];
            if(p.matcher(emailID).find()){
                matches.add(firstName);
            }
        }

        Collections.sort(matches);

        for(String s : matches){
            System.out.println(s);
        }

        scanner.close();
    }
}
