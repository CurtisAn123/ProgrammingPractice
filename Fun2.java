package cccpractice;

import java.util.Scanner;

public class Fun2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int S = s.nextInt();
        int T = s.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int in = s.nextInt();
            if (in*2 >= S && in*2 <=T) {
                ans++;
            }
        }
        System.out.println(ans);
    }
    
}
