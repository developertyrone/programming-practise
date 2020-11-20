package com.hackerrank;

import java.util.Scanner;

public class Day29 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);
            
            int max = 0;
            for(int i=1; i <=n; i++){
                for(int j=i+1; j<=n; j++){
                    int result = i&j;
                    if(result > max && result < k){
                        max = result;
                    }
                }
            }
            System.out.println(max);
        }

        scanner.close();

        /* Faster Solution ?
        T = int(input().strip())
for _ in range(T):
    n , k = map(int , input().split())
    print(k-1 if ((k-1) | k) <= n else k-2)
        */
    }
}
