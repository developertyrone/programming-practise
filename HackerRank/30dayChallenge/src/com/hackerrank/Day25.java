package com.hackerrank;

import java.util.Scanner;

public class Day25 {


    //Best method
    public static boolean isPrimeBest(int n){
        int count = 0;
        // check lower boundaries on primality
        if( n == 2 ){ 
            return true;
        } // 1 is not prime, even numbers > 2 are not prime
        else if( n == 1 || (n & 1) == 0){
            return false;
        }

        // Check for primality using odd numbers from 3 to sqrt(n)
        for(int i = 3; i <= Math.sqrt(n); i += 2){
            count++;
            // n is not prime if it is evenly divisible by some 'i' in this range
            if( n % i == 0 ){ 
                return false;
            }
        }
        // n is prime
        return true;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }
        
        for (int i : intArray) {
            if(i * 1  == 1){
                System.out.println("Not prime");
                continue;
            }
            boolean isPrime = true;
            for(int j = 2; j*j <= i; j++ ){ //faster solution
            //for(int j = 2; j <= i/2; j++ ){ //slower solution
                if( i % j  == 0){
                    System.out.println("Not prime");
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) System.out.println("Prime");
            
            
        }
    }
}
