import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
          /* Declare second integer, double, and String variables. */
        int n=scan.nextInt();
        /* Read and save an integer, double, and String to your variables.*/
         double dob=scan.nextDouble();
         String str="";
        while(scan.hasNext())
            {
            str += scan.next() +" ";
        }
      // System.out.println(str);
        /* Print the sum of both integer variables on a new line. */
          int total=i + n;
            System.out.println(total);
        /* Print the sum of the double variables on a new line. */
		double tod= d + dob;
        System.out.printf("%.1f",tod);
          System.out.println();
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
           //System.out.println(s);
          String con = s + str;
        System.out.println(con);
         scan.close();
    }
}