/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cccpractice;

import java.util.Scanner;
import java.util.Arrays;

public class S2Y2017 {
    
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] tide = new int[N];
        for (int i = 0; i<N; i++) {
            tide[i] = s.nextInt();
        }
        Arrays.sort(tide);
        int high,low;
        if (N%2 == 0) {
            high = N/2;
            low = N/2 - 1;
            for (int i = 0; i<N/2; i++) {
                System.out.print(tide[low - i] + " ");
                System.out.print(tide[high + i] + " ");
            }
        } else {
            high = N/2 + 1;
            low = N/2;
            for (int i = 0; i<N/2; i++) {
                System.out.print(tide[low - i] + " ");
                System.out.print(tide[high + i] + " ");
            }
            System.out.println(tide[0]);
        }
        
    }
    
}
