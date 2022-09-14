/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cccpractice;

import java.util.*;
import java.io.*;

public class coins {
    
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        double[] prob = new double[N+1];
        double[][] memo = new double[N+1][N+1];
        for (int i = 1; i < N + 1; i++) {
            prob[i] = s.nextDouble();
        }
        memo[0][0] = 1;
        for (int i = 1; i < N+1; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    memo[i][j] = memo[i - 1][j] * (1-prob[i]);
                } else {
                    memo[i][j] = memo[i - 1][j - 1] * prob[i] + memo[i-1][j] * (1-prob[i]);
                }
            }
        }
        double sum = 0;
        for (int  i = N/2+1; i < N+1; i++){
            sum += memo[N][i];
        }
        System.out.println(sum);
        
    }
    
}
