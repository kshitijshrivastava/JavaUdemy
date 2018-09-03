package practisePrograms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
        int length = arr.length;
        int primarySum = 0;
        int secondarySum = 0;
        //calculating primary diagonal
        for(int i=0;i<length; i++)
        {
            for(int k=0;k<length;k++)
            {
                if(i==k)
                {
                    primarySum= primarySum+arr[i][k];
                }
    
            }
        }
        for(int i=0;i<length;i++)
        {
            for(int k=length-1;k>0;k--)
            {
                secondarySum = secondarySum+arr[i][k];
            }
        }
        System.out.println(primarySum);
        System.out.println(secondarySum);
        int diagDifference = primarySum-secondarySum;
        return Math.abs(diagDifference);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

