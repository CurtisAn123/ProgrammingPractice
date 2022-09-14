package cccpractice;

import java.util.Scanner;
import java.util.Arrays;;

//pastebin.com/

public class S4Y2010 {
    public static int[] parent;
    
    public static class Edge implements Comparable<Edge> {
        int bv,ev,cost;
        public Edge(int bv, int ev, int cost) {
            this.bv = bv;
            this.ev = ev;
            this.cost = cost;
        }
        
        @Override
        public int compareTo(Edge o) {
            if (this.bv > o.bv) {
                return 1;
            } else if (this.bv < o.bv) {
                return -1;
            } else {
                return 0;
            }
        }
    }
    
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int P = s.nextInt();
        
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
