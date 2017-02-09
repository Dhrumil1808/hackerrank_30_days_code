import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
            int result = 0;
		      for (int j = 1; j <= N; j++) {
                  int A=j;
			for (int k = j + 1; k <= N; k++) {
                int B=k;
				int current = A & B;
				if (current > result && current < K) {
					result = current;
				}
			}

		}
    System.out.println(result);
	}

        
        
    }
}