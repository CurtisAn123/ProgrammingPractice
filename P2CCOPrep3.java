package cccpractice;

import java.util.Scanner;

public class P2CCOPrep3 {
    public static int n, L;
    public static int min(int x){
        for (int i = 0; i < L+1; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j<i; j++) {
                min = min(j);
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        L = s.nextInt();
        int[] dp = new int[L+1];
        for (int i = 0; i < L; i++) {
            dp[i] = s.nextInt();
        }
        
        
    }
    
}
