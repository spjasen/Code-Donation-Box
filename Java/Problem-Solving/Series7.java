/*
Problem Statement:
https://www.hackerrank.com/contests/coding-mock-7/challenges/series-7/

contributed by:
githb.com/vinitkadam

java 8 code:
*/

import java.io.*;
import java.util.*;

public class Series7 {
    
    public static void printNthPrime(int index){
        int num, count, i;
        num=1;
        count=0;

        while (count < index +1){
            num=num+1;
            int flag = 0;
            int n = (int)Math.sqrt(num);
            for (i = 2; i <= n; i++){
                if (num % i == 0) {
                    flag = 1;
                }
            }
            if(flag != 1){
                count = count+1;
            }
        }
        System.out.println(num);
    }
    
    public static void printNthFib(int index){
        int count = 1;
        if(index == 0 || index == 1){
            System.out.println(1);
        } else {
            int temp1 = 1;
            int temp2 = 1;
            while(count != index){
                count += 1;
                int temp3 = temp1 + temp2;
                if(count == index){
                    System.out.println(temp3);
                }else{
                    temp1 = temp2;
                    temp2 = temp3;
                }
            }
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        int index = (int)Math.ceil(pos / 2.0) - 1;
        // System.out.println(index);
        if(pos % 2 == 0){
            printNthPrime(index);
        }else {
            printNthFib(index);
        }
    }
}
