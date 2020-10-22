package com.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Day6 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String input = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int lines = Integer.parseInt(br.readLine());
            for(int a=1; a<=lines; a++){
                StringBuilder odd = new StringBuilder();
                StringBuilder even = new StringBuilder();
                input = br.readLine();
                for(int i =0; i < input.length(); i++){
                    if(i % 2 == 0){
                        even.append(input.charAt(i));
                    }else{
                        odd.append(input.charAt(i));
                    }
                }

                System.out.println(even+" "+odd);
            }


        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
}
