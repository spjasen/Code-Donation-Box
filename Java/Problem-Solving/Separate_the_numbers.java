/*
Problem statement:
https://www.hackerrank.com/contests/coding-mock-7/challenges/separate-the-numbers/

contributed by:
github.com/vinitkadam

java 8 code:
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the separateNumbers function below.
    static void separateNumbers(String s) {
        int flag = 0;
        long firstNo = 0;
        for(int step = 1; step<= s.length()/2; step++){
            firstNo = Long.parseLong(s.substring(0, step));
            long firstElement = firstNo;
            
            String seq = Long.toString(firstElement);
            
            //create the ideal sequence based on the first number
            while(seq.length() < s.length()){
                seq += Long.toString(++firstElement);
            }
            
            // compare the created sequence with the actual input
            if(seq.equals(s)){
                flag = 1;
                break;
            }
        }
        
        if(flag == 1){
            System.out.println("YES "+firstNo);
        } else{
            System.out.println("NO");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            separateNumbers(s);
        }

        scanner.close();
    }
}

