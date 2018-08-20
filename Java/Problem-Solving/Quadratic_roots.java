/*
Problem statement:
https://www.hackerrank.com/contests/coding-mock-7/challenges/search-for-roots-of-quadratic-equation

contributed by:
github.com/vinitkadam

java 8 code:
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        double sq = Math.sqrt(b*b - 4*a*c);
        double root1 = (-1 * b + sq)/ 2*a;
        double root2 = (-1 * b - sq)/ 2*a;
        System.out.printf("%.6f\n", (float)root1);
        
        System.out.printf("%.6f", (float)root2);
    }
}
