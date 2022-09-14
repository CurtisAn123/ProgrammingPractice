/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cccpractice;

import java.util.Scanner;

public class Vacation {
    
    public static int N;
    public static int[] h;
    public static int[][] points, htotal;
    
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        points = new int[N][3];
        h = new int[N];
        htotal = new int[N][3];
        for (int i = 0; i < N; i++){
            points[i][0] = s.nextInt();
            points[i][1] = s.nextInt();
            points[i][2] = s.nextInt();
        }
        htotal[0][0] = points[0][0];
        htotal[0][1] = points[0][1];
        htotal[0][2] = points[0][2];
        for (int i = 1; i<N; i++){
            htotal[i][0] = points[i][0] + Integer.max(htotal[i-1][1], htotal[i-1][2]);
            htotal[i][1] = points[i][1] + Integer.max(htotal[i-1][0], htotal[i-1][2]);
            htotal[i][2] = points[i][2] + Integer.max(htotal[i-1][0], htotal[i-1][1]);
        }
        System.out.println(Integer.max(htotal[N-1][0], Integer.max(htotal[N-1][1], htotal[N-1][2])));
        
    }
}
/*if ((points[x][i] + points[x+1][j]) / 2 > max) {
                        max = (points[x][i] + points[x+1][j]) / 2;
                        if (max > last){
                            
                        }
                        val = points[x][i];
                    }*/