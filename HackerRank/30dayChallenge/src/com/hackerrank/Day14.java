package com.hackerrank;


import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Difference {
    private int[] elements;
    public int maximumDifference;
    public int smallest = 101;
    public int biggest  = -1;

    // Add your code here
    Difference(int[] input) {
        this.elements = input;
    }

    public void computeDifference(){
        /*IntStream  stream = IntStream.of(elements);

        // Displaying the sequential ordered stream
        stream.forEach(i -> {
            if (i < smallest) {
                smallest = i;
            }

            if (i > biggest) {
                biggest = i;
            }
        });*/

        for(int i=0; i<=elements.length-1; i++){
            if (elements[i] < smallest) {
                smallest = elements[i];
            }

            if (elements[i] > biggest) {
                biggest = elements[i];
            }
        }

        maximumDifference = Math.abs(biggest - smallest);
    }

}
public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

