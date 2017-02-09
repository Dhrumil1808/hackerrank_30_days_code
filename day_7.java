import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] result=new int[n];
        int[] arr = new int[n];
        for(int i=n-1; i >=0 ; i--){
            arr[i] = in.nextInt();
            Sstem.out.print(arr[i]);
        }
        for(int k=0;k<=n-2;;k--)
            {
            System.out.print(arr[k]);
        }
        in.close();
        
    }
}
