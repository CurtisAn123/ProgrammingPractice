/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cccpractice;

import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList;

public class S3Y2018MockCCC {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int v = s.nextInt();
        int e = s.nextInt();
        boolean[][] map = new boolean[v][v];
        int[][] edge = new int[e][2];
        for (int i = 0; i < e; i++) {
            int bv = s.nextInt()-1;
            int ev = s.nextInt()-1;
            map[bv][ev] = true;
            edge[i][0] = bv;
            edge[i][1] = ev;
        }
        int[] step = new int[v];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < e; i++) {
            map[edge[i][0]][edge[i][1]] = false;
            Arrays.fill(step, Integer.MAX_VALUE);
            step[0] = 0;
            queue.add(0);
            while(!queue.isEmpty()) {
                int curV = queue.poll();
                for (int j = 0; j<v; j++) {
                    if (map[curV][j] == true) {
                        if (step[j] > step[curV] + 1) {
                            step[j] = step[curV] + 1;
                            queue.add(j);
                        }
                    }
                }
            }
            if (step[v-1] == Integer.MAX_VALUE) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
            map[edge[i][0]][edge[i][1]] = true;
        }
        
    }
}
