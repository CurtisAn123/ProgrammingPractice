/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cccpractice;

import java.util.Scanner;

public class S2Y2018 {
    
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[][] height = new int[N][N];
        int[][] corner = new int[2][2];
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                height[r][c] = s.nextInt();
            }
        }
        corner[0][0] = height[0][0];
        corner[1][0] = height[N-1][0];
        corner[0][1] = height[0][N-1];
        corner[1][1] = height[N-1][N-1];
        int rotations = 0;
        if (corner [0][1] > corner[0][0] && corner[1][0] > corner[0][0]) {
            rotations = 0;
        }
        if (corner [1][1] < corner[1][0] && corner[1][1] < corner[0][1]) {
            rotations = 2;
        }
        if (corner [0][0] > corner[0][1] && corner[1][1] > corner[0][1]) {
            rotations = 1;
        }
        if (corner [0][0] > corner[1][0] && corner[1][1] > corner[1][0]) {
            rotations = 3;
        }
        if (rotations == 0) {
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    System.out.print(height[r][c] + " ");
                }
                System.out.println();
            }
        }
        else if (rotations == 1) {
            for (int r = N-1; r >= 0; r--) {
                for (int c = 0; c < N; c++) {
                    System.out.print(height[c][r] + " ");
                }
                System.out.println();
            }
        }
        else if (rotations == 2) {
            for (int r = N-1; r >= 0; r--) {
                for (int c = N-1; c >= 0; c--) {
                    System.out.print(height[r][c] + " ");
                }
                System.out.println();
            }
        }
        else if (rotations == 3) {
            for (int r = 0; r < N; r++) {
                for (int c = N - 1; c >= 0; c--) {
                    System.out.print(height[c][r] + " ");
                }
                System.out.println();
            }
        }
        
    }
    
}
