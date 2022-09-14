/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cccpractice;

import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList;

public class S3Y2008 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int x = 0; x < t; x++) {
            int R = s.nextInt();
            int C = s.nextInt();
            char[][] map = new char[R][C];
            for (int r = 0; r < R; r++) {
                map[r] = s.next().toCharArray();
            }
            
            int[][] step = new int[R][C];
            for (int r = 0; r < R; r++) {
                Arrays.fill(step[r], Integer.MAX_VALUE);
            }
            step[0][0] = 1;
            LinkedList<Integer> rq = new LinkedList<>();
            LinkedList<Integer> cq = new LinkedList<>();
            rq.add(0);
            cq.add(0);
            while(!rq.isEmpty()){
                int curR = rq.poll();
                int curC = cq.poll();
                if (curR + 1 < R) {
                    if (map[curR + 1][curC] != '*' && map[curR][curC] != '-') {
                        if (step[curR][curC] + 1 < step[curR + 1][curC]) {
                            rq.add(curR + 1);
                            cq.add(curC);
                            step[curR + 1][curC] = step[curR][curC] + 1;
                        }
                    }
                }
                if (curR - 1 >= 0) {
                    if (map[curR - 1][curC] != '*' && map[curR][curC] != '-') {
                        if (step[curR][curC] + 1 < step[curR - 1][curC]) {
                            rq.add(curR - 1);
                            cq.add(curC);
                            step[curR - 1][curC] = step[curR][curC] + 1;
                        }
                    }
                }
                if (curC + 1 < C) {
                    if (map[curR][curC + 1] != '*' && map[curR][curC] != '|') {
                        if (step[curR][curC] + 1 < step[curR][curC + 1]) {
                            rq.add(curR);
                            cq.add(curC + 1);
                            step[curR][curC + 1] = step[curR][curC] + 1;
                        }
                    }
                }
                if (curC - 1 >= 0) {
                    if (map[curR][curC - 1] != '*' && map[curR][curC] != '|') {
                        if (step[curR][curC] + 1 < step[curR][curC - 1]) {
                            rq.add(curR);
                            cq.add(curC - 1);
                            step[curR][curC - 1] = step[curR][curC] + 1;
                        }
                    }
                }
                if (curR == R-1 && curC == C-1) {
                    System.out.println(step[curR][curC]);
                    break;
                }
            }
            if (step[R-1][C-1] == Integer.MAX_VALUE) {
                    System.out.println("-1");
            }
        }
    }
    
}
