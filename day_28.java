import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        String Regex="@gmail.com";
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] name=new String[n];
        String[] email=new String[n];
        ArrayList<String> names=new ArrayList<String>();
        for(int i=0;i<n;i++)
            {
            name[i]=sc.next();
            email[i]=sc.nextLine();
           // System.out.println(name[i]+ "  " + email[i]);
            if(email[i].matches("(.*)@gmail.com(.*)"))
                {
                names.add(name[i]);
            }
        }
        Collections.sort(names);
        
        for(int i=0;i<names.size();i++)
            {
System.out.println(names.get(i));
}
        
        
    }
}