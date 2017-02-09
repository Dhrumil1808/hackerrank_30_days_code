import java.io.*;
import java.util.*;

public class Solution {
    static int n2=1;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=factorial(n);
        
        System.out.println(result);
    }
    
    public static int factorial(int n)
        {
        
           int n1=1;
             n2*=n;
   
        if(n==1)
            {
            return n2;
        }
        else
            {
                factorial(n-1);
        }
        return n2;
    }
}