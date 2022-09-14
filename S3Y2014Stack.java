/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cccpractice;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Stack;

public class S3Y2014Stack {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int[] N = new int[T];
        Stack<Integer> Mcart = new Stack<Integer>();
        Stack<Integer> Bcart = new Stack<Integer>();
        Stack<Integer> Lcart = new Stack<Integer>();
        char[] ans = new char[T];
        
        for (int i = 0; i < T; i++) {
            N[i] = s.nextInt();
            for (int j = 0; j < N[i]; j++) {
                Mcart.add(s.nextInt());
            }
            int LakeVal = 1;
            while(true) {
                if (!Mcart.isEmpty() && Mcart.lastElement() == LakeVal) {
                    Lcart.add(Mcart.pop());
                    LakeVal++;
                } else if (!Bcart.isEmpty() && Bcart.lastElement() == LakeVal) {
                    Lcart.add(Bcart.pop());
                    LakeVal++;
                } else {
                    Bcart.add(Mcart.pop());
                }
                if (Lcart.size() == N[i]) {
                    ans[i] = 'Y';
                    break;
                } else if(Mcart.isEmpty() && Bcart.lastElement() != LakeVal) {
                    ans[i] = 'N';
                    break;
                }
            }
            while(!Mcart.isEmpty()) {
                Mcart.pop();
            }
            while(!Lcart.isEmpty()) {
                Lcart.pop();
            }
            while(!Bcart.isEmpty()) {
                Bcart.pop();
            }
        }
        
        for (int i = 0; i < T; i++) {
            System.out.println(ans[i]);
        }
        
        
    }
    
    
}
