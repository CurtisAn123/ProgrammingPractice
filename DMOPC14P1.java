/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cccpractice;

import java.io.*;
import java.util.*;

public class DMOPC14P1 {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double[] num = new double[n];
        for (int i = 0; i < n; i++){
            num[i] = s.nextDouble();
        }
        Arrays.sort(num);
        if (n%2==1){
            System.out.println((int)num[n/2]);
        }
        else {
            double temp = (num[n/2] + num[n/2 - 1]) / 2;
            if (temp - (int)temp == 0.5) {
                System.out.println((int)temp + 1);
            }
            else {
                System.out.println((int)temp);
            }
        }
        
    }
    
    
    
    
}
