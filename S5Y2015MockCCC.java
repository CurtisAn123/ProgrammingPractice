package cccpractice;

// https://pastebin.com/wUivDFkU

import java.io.*;
import java.util.Collections;
import java.util.ArrayList;

public class S5Y2015MockCCC {
    public static class Edge implements Comparable<Edge>{
        int bv, ev, cost;
        public Edge(int bv, int ev, int cost) {
            this.bv = bv;
            this.ev = ev;
            this.cost = cost;
        }
        
        public int compareTo(Edge o) {
            return o.cost - this.cost;
        }
    }
    
    public static ArrayList<Edge> edges;
    public static ArrayList<Edge> temp;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] A = br.readLine().split(" ");
        int V = Integer.parseInt(A[0]);
        int E = Integer.parseInt(A[1]);
        edges = new ArrayList<Edge>(); //keep two versions as one used to update and resort
        for (int i=0; i<E; i++) {
            A = br.readLine().split(" ");
            int bv = Integer.parseInt(A[0]);
            int ev = Integer.parseInt(A[1]);
            int cost = Integer.parseInt(A[2]);
            edges.add(new Edge(bv, ev, cost));
        }
        temp = new ArrayList<Edge>(edges); //version that will actually be modified
        Collections.sort(temp);
        
    }
    
    
}
