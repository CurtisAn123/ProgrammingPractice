/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cccpractice;

import java.util.Scanner;


public class S2Y2013 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int W = s.nextInt();
        int N = s.nextInt();
        int[] cars = new int[N];
        for (int i = 0; i < N; i++) {
            cars[i] = s.nextInt();
        }
        int sum = 0;
        int count = 0;
        for (int i = 0; i < N; i++) {
            sum += cars[i];
            count++;
            if (count > 4) {
                sum-= cars[i-4];
            }
            if (sum > W) {
                System.out.println(count-1);
                return;
            }
        }
        System.out.println(N);
        
    }
    
    
    
}
