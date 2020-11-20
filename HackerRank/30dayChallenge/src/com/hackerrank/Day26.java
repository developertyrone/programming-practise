package com.hackerrank;

import java.util.Scanner;

class MyDate{
    int day, month, year;
    MyDate(int d,int m,int y){
        day = d;
        month = m;
        year = y;
    }
    
    public void printString(){
        System.out.println(day+" "+month+" "+year);
    }
}

public class Day26 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        MyDate actualDate = new MyDate(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
        
        MyDate expectDate = new MyDate(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
        /*
        if(actualDate.year - expectDate.year > 0){
            System.out.println(10000);
        }else if(actualDate.year - expectDate.year == 0 && actualDate.month - expectDate.month > 0){
            System.out.println((actualDate.month - expectDate.month)*500);
        }else if(actualDate.year - expectDate.year == 0 && actualDate.month - expectDate.month == 0 && actualDate.day - expectDate.day > 0){
            System.out.println((actualDate.day - expectDate.day)*15);
        }else{
            System.out.println(0);
        }*/

        if(actualDate.year - expectDate.year == 0){
            if(actualDate.month - expectDate.month == 0){
                if(actualDate.day - expectDate.day == 0){
                    System.out.println(0);
                }else{
                    System.out.println(15 * Math.max(0, actualDate.day - expectDate.day));
                }
            }else{
                System.out.println(500 * Math.max(0, actualDate.month - expectDate.month));
            }
        }else{
            if (actualDate.year - expectDate.year > 0){
                System.out.println(10000);
            }else{
                System.out.println(0); 
            }  
        }
    
        
        
    }
}
