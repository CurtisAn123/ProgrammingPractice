/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cccpractice;

import java.util.Scanner;

public class S1Y2017 {
    
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[][] score = new int[N][2];
        int sum = 0;
        for (int i = 0; i<N; i++) {
            sum += s.nextInt();
            score[i][0] = sum;
        }
        sum = 0;
        for (int i = 0; i<N; i++) {
            sum += s.nextInt();
            score[i][1] = sum;
        }
        for (int i = N-1; i>=0; i--) {
            if (score[i][0] == score[i][1]) {
                System.out.println((i+1));
                System.exit(0);
            }
        }
        System.out.println("0");
    }
    
}
