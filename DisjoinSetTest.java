/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cccpractice;

//pastebin.com/HZbfqtfh

import java.util.Arrays;
import java.util.Scanner;
import java.util.LinkedList;

public class DisjoinSetTest {
    public static int[] parent;
    
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        parent = new int[N];
        Arrays.fill(parent, -1);
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 1; i < M; i++) {
            int bv = s.nextInt() -1;
            int ev = s.nextInt() -1;
            int pb = find(bv);
            int pe = find(ev);
            if (pb != pe) {
                parent[pb] = pe;
                queue.add(i);
                if (queue.size() == M-1) {
                    while(!queue.isEmpty()){
                        System.out.println(queue.poll());
                    }
                    return;
                }
            }
        }
        
    }
    
    public static int find(int x) {
        if (parent[x] == -1) {
            return x;
        } else {
            parent[x] = find(parent[x]);
            return parent[x];
        }
    }
    
}

/*Edge[] edges = new Edge[M];
        for(int i = 0; i < M; i++) {
            int bv = s.nextInt();
            int ev = s.nextInt();
            int cost = i+1;
            edges[i] = new Edge(bv, ev, cost);
        }
        parent = new int[N];
        Arrays.fill(parent, -1);
        int index = 0;
        Edge[] MST = new Edge[N-1];
        for (Edge e: edges) {
            int pb = find(e.bv);
            int pe = find(e.ev);
            if (pb!=pe){
                parent[pb] = pe;
                MST[index] = e;
                index++;
                if (index == N-1) {
                    break;
                }
            }
        }*/
