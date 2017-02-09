import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int[] res=new int[n];
        for(int i=0;i<n;i++)
            {
            res[i]=sc.nextInt();
        }
        
        int temp;
        int counter=0;
        for(int i=0;i<res.length-1;i++)
            {
            for(int j=i+1;j<res.length;j++)
                {
                if(res[i]>res[j])
                    {
                    counter++;
                 temp=res[i];
                    res[i]=res[j];
                    res[j]=temp;
                }
            }
        }
        
        System.out.println("Array is sorted in " + counter + " swaps.");
        System.out.println("First Element: " + res[0]);
        System.out.println("Last Element: " + res[n-1]);
    }
}