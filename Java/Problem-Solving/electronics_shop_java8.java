/*
Problem Statement:
https://www.hackerrank.com/challenges/electronics-shop/

contributed by:
github.com/vinitkadam

java 7 / Java 8 code
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getMoneySpent(int[] keyboards, int[] drives, int s){
        for(int i=0;i<keyboards.length;i++)
            for(int j=0;j<keyboards.length-i-1;j++)
                if(keyboards[j]<keyboards[j+1])
                {
                    int temp = keyboards[j];
                    keyboards[j] = keyboards[j+1];
                    keyboards[j+1] = temp;
                }
        Arrays.sort(drives);
        int max=-1;
        for(int i=0,j=0;i<keyboards.length;i++)
            for(;j<drives.length;j++)
            {
                if(keyboards[i]+drives[j]>s) break;
                else
                    if(keyboards[i]+drives[j]>max)
                        max=keyboards[i]+drives[j];
                    
            }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}
