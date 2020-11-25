import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.IntStream;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        List<Integer> result = Arrays.asList(0, 0, 0);
        for (int a : arr) {
            if (a == 0) {
                result.set(2, result.get(2) + 1);
            } else if (a > 0) {
                result.set(0, result.get(0) + 1);
            } else {
                result.set(1, result.get(1) + 1);
            }
        }

        int sum = result.stream().mapToInt(Integer::intValue).sum();

        for (int r : result) {
            System.out.println((double) r / sum);
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
