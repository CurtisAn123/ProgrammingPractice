/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cccpractice;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Arrays;

public class S4Y2013 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        boolean[][] map = new boolean[N][N];
        int M = s.nextInt();
        for (int i = 0; i < M; i++) {
            int bv = s.nextInt()-1;
            int ev = s.nextInt()-1;
            map[bv][ev] = true;
        }
        int p = s.nextInt()-1;
        int q = s.nextInt()-1;
        //compare p with q, then q with b
        int[] step = new int[N];
        Arrays.fill(step, Integer.MAX_VALUE);
        step[p] = 0;
        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(p);
        while(!queue.isEmpty()) {
            int curV = queue.poll();
            if (curV == q) {
                System.out.println("yes");
                return;
            }
            for (int i = 0; i < N; i++) {
                if (map[curV][i] == true && step[i] > step[curV]) {
                    step[i] = step[curV] + 1;
                    queue.add(i);
                }
            }
        }
        Arrays.fill(step, Integer.MAX_VALUE);
        step[q] = 0;
        queue.add(q);
        while(!queue.isEmpty()) {
            int curV = queue.poll();
            if (curV == p) {
                System.out.println("no");
                return;
            }
            for (int i = 0; i < N; i++) {
                if (map[curV][i] == true && step[i] > step[curV]) {
                    step[i] = step[curV] + 1;
                    queue.add(i);
                }
            }
        }
        System.out.println("unknown");
        
        //to reduce memory size, make the 2D array into a 1D Array List array
        //You have the 1D array represent the values with the indexes
        //Each array list in the 1D array contains the numbers that it is greater than
        
        
    }
    
}
/*
Arrays.fill(step, Integer.MAX_VALUE);
        step[q] = 0;
        queue.add(q);
        while(!queue.isEmpty()) {
            int curV = queue.poll();
            if (curV == p) {
                System.out.println("no");
                System.exit(0);
            }
            for (int i = 0; i < N; i++) {
                if (map[curV][i] == true) {
                    step[i] = step[i-1] + 1;
                    queue.add(i);
                }
            }
        }
        System.out.println("unknown");
*/