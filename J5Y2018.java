/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cccpractice;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Arrays;

public class J5Y2018 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean[][] map = new boolean[n+1][n+1];
        boolean[] endingPage = new boolean[n+1];
        boolean[] reached = new boolean[n+1];
        for (int i = 1; i < n+1; i++) {
            int m = s.nextInt();
            if (m == 0) {
                endingPage[i] = true;
            } else {
                for(int j = 0; j < m; j++) {
                    int mTemp = s.nextInt();
                    map[i][mTemp] = true;
                }
            }
        }
        int[] step = new int[n+1];
        Arrays.fill(step,Integer.MAX_VALUE);
        step[1] = 1;
        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        int min = Integer.MAX_VALUE;
        while(!queue.isEmpty()) {
            int curPage = queue.poll();
            for (int i = 1; i < n+1; i++) {
                if (map[curPage][i] == true) {
                    reached[i] = true;
                    if (endingPage[i] == true) {
                        if (step[curPage] + 1 < min) {
                            min = step[curPage] + 1;
                        }
                    } else if (step[i] > step[curPage] + 1) {
                        step[i] = step[curPage] + 1;
                        queue.add(i);
                    }
                }
            }
        }
        for (int i = 2; i < n+1; i++) {
            if (reached[i] == false) {
                System.out.println("N");
                System.out.println(min);
                return;
            }
        }
        System.out.println("Y");
        System.out.println(min);
        
    }
}
