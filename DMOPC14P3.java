/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cccpractice;

import java.io.*;
import java.util.*;

public class DMOPC14P3 {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double I = s.nextDouble();
        double sum=0;
        for (int i = 0; i < I; i++){
            sum+= s.nextDouble();
        }
        double S = s.nextDouble();
        for (int i = 1; i <= S; i++){
            sum+= s.nextDouble();
            double temp = (sum) / (I+i);
            System.out.println(temp);
        }
    }
    
    
}
