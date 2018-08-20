/*
Problem Statement:
https://www.hackerrank.com/contests/coding-mock-7/challenges/version-change

contributed by:
github.com/vinitkadam

java 8 code:
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            // System.out.println(s);
            int index = s.indexOf("//");
            if(index >= 0){
                String substr1 = s.substring(0, index);
                String substr2 = s.substring(index, s.length());
                String newop = substr1.replaceAll("->", ".");
                System.out.println(newop+substr2);
            } else {
                String newop = s.replaceAll("->", ".");
                System.out.println(newop);
            }
            
        }
    }
}
