
package cccpractice;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Arrays;

public class J5Y2010 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int startX = s.nextInt() - 1;
        int startY = s.nextInt() - 1;
        int endR = s.nextInt() - 1;
        int endC = s.nextInt() - 1;
        int step[][] = new int[8][8];
        for (int i = 0; i < 8; i++) {
            Arrays.fill(step[i], Integer.MAX_VALUE);
        }
        step[startX][startY] = 0;
        LinkedList<Integer> rq = new LinkedList<Integer>();
        LinkedList<Integer> cq = new LinkedList<Integer>();
        rq.add(startX);
        cq.add(startY);
        
        while(!rq.isEmpty()) {
            int r = rq.poll();
            int c = cq.poll();
            if (r == endR && c == endC) {
                System.out.println(step[r][c]);
                return;
            }
            if (r+2 < 8 && c+1 < 8) {
                if (r+2 == endR && c+1 == endC) {
                    System.out.println(step[r][c] + 1);
                    return;
                } else if (step[r][c]+1 < step[r+2][c+1]) {
                    rq.add(r+2);
                    cq.add(c+1);
                    step[r+2][c+1] = step[r][c] + 1;
                }
            }
            if (r+1 < 8 && c+2 < 8) {
                if (r+1 == endR && c+2 == endC) {
                    System.out.println(step[r][c] + 1);
                    return;
                } else if (step[r][c]+1 < step[r+1][c+2]) {
                    rq.add(r+1);
                    cq.add(c+2);
                    step[r+1][c+2] = step[r][c] + 1;
                }
            }
            if (r+2 < 8 && c-1 > 0) {
                if (r+2 == endR && c-1 == endC) {
                    System.out.println(step[r][c] + 1);
                    return;
                } else if (step[r][c]+1 < step[r+2][c-1]) {
                    rq.add(r+2);
                    cq.add(c-1);
                    step[r+2][c-1] = step[r][c] + 1;
                }
            }
            if (r+1 < 8 && c-2 > 0) {
                if (r+1 == endR && c-2 == endC) {
                    System.out.println(step[r][c] + 1);
                    return;
                } else if (step[r][c]+1 < step[r+1][c-2]) {
                    rq.add(r+1);
                    cq.add(c-2);
                    step[r+1][c-2] = step[r][c] + 1;
                }
            }
            if (r-1 > 0 && c-2 > 0) {
                if (r-1 == endR && c-2 == endC) {
                    System.out.println(step[r][c] + 1);
                    return;
                } else if (step[r][c]+1 < step[r-1][c-2]) {
                    rq.add(r-1);
                    cq.add(c-2);
                    step[r-1][c-2] = step[r][c] + 1;
                }
            }
            if (r-2 > 0 && c-1 > 0) {
                if (r-2 == endR && c-1 == endC) {
                    System.out.println(step[r][c] + 1);
                    return;
                } else if (step[r][c]+1 < step[r-2][c-1]) {
                    rq.add(r-2);
                    cq.add(c-1);
                    step[r-2][c-1] = step[r][c] + 1;
                }
            }
            if (r-2 > 0 && c+1 < 8) {
                if (r-2 == endR && c+1 == endC) {
                    System.out.println(step[r][c] + 1);
                    return;
                } else if (step[r][c]+1 < step[r-2][c+1]) {
                    rq.add(r-2);
                    cq.add(c+1);
                    step[r-2][c+1] = step[r][c] + 1;
                }
            }
            if (r-1 > 0 && c+2 < 8) {
                if (r-1 == endR && c+2 == endC) {
                    System.out.println(step[r][c] + 1);
                    return;
                } else if (step[r][c]+1 < step[r-1][c+2]) {
                    rq.add(r-1);
                    cq.add(c+2);
                    step[r-1][c+2] = step[r][c] + 1;
                }
            }
        }
        
    }
    
}
