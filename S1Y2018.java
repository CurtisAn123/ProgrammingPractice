/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cccpractice;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class S1Y2018 {
    
    public static void main(String [] args) {
        Scanner s = new Scanner (System.in);
        int N = s.nextInt();
        double[] vill = new double[N];
        ArrayList<Double> village = new ArrayList<Double>();
        
        for (int i = 0; i < N; i++) {
            village.add(s.nextDouble());
        }
        Collections.sort(village);
        //Arrays.sort(village);
        double min = 10000000001.0;
                
        for (int i = 1; i < N-1; i++) {
            //double val = (vill[i] - vill[i-1])/2 + (vill[i+1] - vill[i])/2;
            double val = (village.get(i) - village.get(i-1)) /2 + (village.get(i+1) - village.get(i)) /2;
            if (val <= min)
                min = val;
        }
        System.out.printf("%.1f", min);
    }
    
}
