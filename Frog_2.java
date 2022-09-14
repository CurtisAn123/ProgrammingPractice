/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cccpractice;

import java.util.Scanner;

public class Frog_2 {
    public static int N,K;
    public static int[] h, tcost;
    
    public static int minCost(int x){
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < K+1; i++) {
            int min2 = tcost[x-i] + Math.abs(h[x] - h[x-i]);
            if (min2 < min) {
                min = min2;
            }
            if (x-i == 0)
                break;
        }
        return min;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        N = s.nextInt();
        K = s.nextInt();
        h = new int[N];
        for (int i = 0; i < N; i++) {
            h[i] = s.nextInt();
        }
        tcost = new int[N];
        tcost[0] = 0;
        for (int i = 1; i < N; i++) {
            tcost[i] = tcost[i-1] + Math.abs(h[i-1] - h[i]);
            if (i > 1 && K>2) {
                tcost[i] = minCost(i);
            } else if (i > 1 && K==2) {
                tcost[i] = Math.min(tcost[i-2] + Math.abs(h[i-2] - h[i]),  tcost[i-1] + Math.abs(h[i-1] - h[i]));
            }
        }
        System.out.println(tcost[N-1]);

        
    }
}
