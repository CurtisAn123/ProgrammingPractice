
package cccpractice;

import java.util.Scanner;
import java.util.Arrays;

//pastebin.com/4GZTgn5h

public class S4Y2017 {
    public static int[] parent;
    
    public static class Edge implements Comparable<Edge>{
        int bv, ev, cost;
        int active; //active is 0, inavtive is 1
        public Edge(int bv, int ev, int cost, int active) {
            this.bv = bv;
            this.ev = ev;
            this.cost = cost;
            this.active = active;
        }
        public int compareTo(Edge o) {
            if (this.cost  > o.cost) {
                return 1;
            } else if (this.cost < o.cost) {
                return -1;
            } else {
                if (this.active < o.active) {
                    return -1;
                } else if (this.active > o.active) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int E = s.nextInt();
        int D = s.nextInt();
        Edge[] edges = new Edge[E];
        int lastCost = 0;
        int lastActive = 0;
        for (int i = 0; i < E; i++) {
            int bv = s.nextInt() -1;
            int ev = s.nextInt() -1;
            int cost = s.nextInt();
            if (i >= V-1) {
                edges   [i] = new Edge(bv, ev, cost, 1);
            } else {
                edges[i] = new Edge(bv, ev, cost, 0);
            }
        }
        Arrays.sort(edges);
        Edge[] MST = new Edge[V-1];
        parent = new int[V];
        Arrays.fill(parent, -1);
        int day = 0;
        int index = 0;
        int ans = 0;
        for (int i = 0; i < E; i++) {
            int pb = find(edges[i].bv);
            int pe = find(edges[i].ev);
            if (pb!=pe) {
                parent[pe] = pb;
                day+= edges[i].active;
                index++;
                if( index == V-1){
                    lastActive = edges[i].active;
                    lastCost = edges[i].cost;
                }
            }
        }
        if (lastActive == 1) {
            for (int i = 0; i < E; i++) {
                
            }
        }
        
        System.out.println(ans);
        
        
        
    }
    
    public static int find(int x) {
        if (parent[x] == -1) {
            return x;
        }
        return find(parent[x]);
    }
    
    
}
