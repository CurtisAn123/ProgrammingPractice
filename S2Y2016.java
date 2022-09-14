/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cccpractice;

import java.util.Arrays;
import java.util.Scanner;

public class S2Y2016 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int q = s.nextInt();
        int N = s.nextInt();
        int[] dmoj = new int[N];
        int[] peg = new int[N];
        for (int i = 0; i < N; i++) {
            dmoj[i] = s.nextInt();
        }
        for (int i = 0; i < N; i++) {
            peg[i] = s.nextInt();
        }
        Arrays.sort(dmoj);
        Arrays.sort(peg);
        int speed = 0;
        int max = 0;
        if (q==1) {
            for (int i = 0; i < N; i++) {
                if (dmoj[i] > peg[i]) {
                    speed += dmoj[i];
                } else {
                    speed += peg[i];
                }
            }
        } else {
            for (int i = 0; i < N; i++) {
                if (dmoj[i] > peg[N-1-i]) {
                    speed += dmoj[i];
                } else {
                    speed += peg[N-1-i];
                }
            }
        }
        System.out.println(speed);
    }
    
    
}
