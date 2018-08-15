/*
Problem statement:
https://www.hackerrank.com/challenges/day-of-the-programmer/


java 7 code:
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int year = in.nextInt();
    if(year>=1700 && year<=2700)
    {
        if(year>1918)
        {
         if  ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))

         System.out.println("12.09."+year);
        else
        System.out.println("13.09."+year);
        }
         if(year==1918)
          System.out.println("26.09."+year);
        if(year<1918)
        {

         if  (year % 4 == 0)

         System.out.println("12.09."+year);
        else
        System.out.println("13.09."+year); 
        }



    }
    }
}
