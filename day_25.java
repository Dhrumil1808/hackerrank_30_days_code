import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
            {
            long num=sc.nextLong();
            if(num<=1)
                System.out.println("Not prime");
            if(num==2)
                System.out.println("Prime");
            else
                {
                int count=0;
                for(long j=2;j<(long)(Math.sqrt(num)) +1 ;j++)
                    {
                    count++;
                    if(num%j==0)
                        {
                        System.out.println("Not prime");
                        break;
                    }
                    else
                        {
                        if(count==(long)(Math.sqrt(num))-1)
                            System.out.println("Prime");
                    }
                }
                    }
        }
    }
}