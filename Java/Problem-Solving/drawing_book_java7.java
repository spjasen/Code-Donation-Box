/*
Problem statement:
https://www.hackerrank.com/challenges/drawing-book/

java 7 code:
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int p){
        int front=0;
        int back=0;
        int flag=0;
        int i=1;
        while(i<=n&&flag==0)
        {
            
            
            if(p==1)
                flag=1;
            else
            {
                
                front++;
                i+=2;
                if(p==i || p==i-1)
                   flag=1;
                
            }   
        }
        flag=0;
        i=n;
        
        while( i>=1 && flag==0)
        {
            if(n%2==0)
            {
                if(p==i)
                    flag=1;
                else
                {
                    back++;
                    i-=2;
                    if(p==i || p==i+1)
                        flag=1;
                }
            }
            else
            {
                
                if(p==i || p==i-1)
                    flag=1;
                else
                {
                    back++;
                    i-=2;
                    if(p==i || p==i-1)
                        flag=1;
                }
            }
         
        }
        return front<back?front:back;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
