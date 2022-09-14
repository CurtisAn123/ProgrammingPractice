package cccpractice;

import java.util.Scanner;


public class Fun1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int t = s.nextInt();
            int ans = 0;
            for (int j = 1; j < t; j++) {
                for (int k = j; k<t; k++) {
                    if (j*k <= t) {
                        ans++;
                    }
                }
            }
            
            System.out.println(ans+1);
        }
    }
}
