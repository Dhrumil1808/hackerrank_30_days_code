import java.io.*;
import java.util.*;

public class Solution1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int day_returned=sc.nextInt();
        int month_returned=sc.nextInt();
        int year_returned=sc.nextInt();
        
        int day_actual=sc.nextInt();
        int month_actual=sc.nextInt();
        int year_actual=sc.nextInt();
        int fine=-1;
       if(year_returned<=year_actual)
           {
           if(month_returned < month_actual)
               {
              fine=0;
               System.out.println(fine);
           }
           else if((month_returned==month_actual && day_returned <= day_actual))
           {
             fine=0;
             System.out.println(fine);
           }
           else if(month_returned==month_actual && day_returned > day_actual)
               {
               int a= (day_returned - day_actual) * 15;
               System.out.println(a);
           }
           else if(month_returned > month_actual)
               {
                int b = (month_returned - month_actual) * 500;
               System.out.println(b);
           }
           
            }
        else  if(year_returned> year_actual)
            {
            System.out.println("10000");
        }
        //System.out.println(fine);
        sc.close();
    }
}