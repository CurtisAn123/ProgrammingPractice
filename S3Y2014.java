/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cccpractice;

import java.util.Scanner;
import java.util.LinkedList;

public class S3Y2014 {
    public static void main(String [] args) {
        
        //Obligatory does not work, finished with stack
        
        
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int[] N = new int[T];
        LinkedList<Integer> Mcart = new LinkedList<Integer>();
        LinkedList<Integer> Bcart = new LinkedList<Integer>();
        LinkedList<Integer> Lcart = new LinkedList<Integer>();
        for (int i = 0; i < T; i++) {
            N[i] = s.nextInt();
            for (int j = 0; j < N[i]; j++) {
                Mcart.add(s.nextInt());
            }
            int LakeVal = 1;
            while(true) {
                if (!Mcart.isEmpty() && Mcart.get(Mcart.size() - 1) == LakeVal) {
                    Lcart.add(Mcart.get(Mcart.size() - 1));
                    LakeVal++;
                } else if (!Bcart.isEmpty() && Bcart.get(Bcart.size() - 1) == LakeVal) {
                    Lcart.add(Bcart.get(Bcart.size() - 1));
                    LakeVal++;
                } else {
                    System.out.println("N");
                    break;
                }
                if (Lcart.size() == N[i] - 1) {
                    System.out.println("Y");
                    break;
                }
            }
        }
        
        
    }
    
    
}
