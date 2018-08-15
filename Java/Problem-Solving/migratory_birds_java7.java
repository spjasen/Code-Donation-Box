/*
Problem statement:
https://www.hackerrank.com/challenges/migratory-birds/problem

java 7 code
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        int a[] ={0,0,0,0,0,0};
        for(int i=0;i<n;i++)
        {
            if(ar[i]==1)
                a[1]++;
            else if(ar[i]==2)
                a[2]++;
            else if(ar[i]==3)
                a[3]++;
            else if(ar[i]==4)
                a[4]++;
            else if(ar[i]==5)
                a[5]++;
        }
        int max=0; 
        int temp=1;
        for(int i=1;i<6;i++)
            if(a[i]>max)
            {
                max=a[i];
                temp = i;
            }
        return temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
