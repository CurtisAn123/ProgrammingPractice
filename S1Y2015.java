/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cccpractice;

import java.util.Scanner;
import java.util.LinkedList;

public class S1Y2015 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int K = s.nextInt();
        int sum = 0;
        int v = 0;
        LinkedList<Integer> values = new LinkedList<Integer>();
        for (int i = 0; i < K; i++) {
            v=s.nextInt();
            if (v==0) {
                values.removeLast();
            } else {
                values.add(v);
            }
        }
        while(!values.isEmpty()) {
            sum+=values.poll();
        }
        System.out.println(sum);
    }
    
}
