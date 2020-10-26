package com.hackerrank;

import java.util.Scanner;

public class Day10 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        int consecutive = 0;
        int tempcount = 0;

        while(n > 0){
            int remainder = n%2;
            if (remainder == 0){
                tempcount = 0;
            }else{
                tempcount++;
                if(tempcount > consecutive){
                    consecutive = tempcount;
                }
            }
            n = n/2;
        }

        System.out.println(consecutive);

    }

}
