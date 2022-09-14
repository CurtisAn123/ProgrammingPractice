/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cccpractice;

import java.util.Scanner;

public class Frog_1 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] h = new int[N];
        for (int i = 0; i < N; i++) {
            h[i] = s.nextInt();
        }
        int[] tcost = new int[N];
        tcost[0] = 0;
        for (int i = 1; i < N; i++) {
            tcost[i] = tcost[i-1] + Math.abs(h[i-1] - h[i]);
            if (i > 1) {
                tcost[i] = Math.min(tcost[i-2] + Math.abs(h[i-2] - h[i]),  tcost[i-1] + Math.abs(h[i-1] - h[i]));
            }
        }
        System.out.println(tcost[N-1]);
        
    }
}
