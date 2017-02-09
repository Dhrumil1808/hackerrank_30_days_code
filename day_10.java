import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> binary=new ArrayList<Integer>(); 
        int count=1,max=1;
        while(n!=0)
            {
            int b=n%2;
            binary.add(b); 
               n=n/2;   
        }
        for(int k=1;k<binary.size();k++)
            {
            if(binary.get(k)==binary.get(k-1) && binary.get(k)==1)
                {
                count++;
                if(max<count)
                    max=count;
            }
            else
                count=1;
        }
        System.out.println(max);
        
    }
}