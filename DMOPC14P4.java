/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cccpractice;

import java.util.*;
import java.io.*;

public class DMOPC14P4 {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x1 = s.nextInt();
        int x2 = s.nextInt();
        int dx = Math.abs(x1-s.nextInt());
        int dy = Math.abs(x2-s.nextInt());
        int t = dx+dy;
        String[] temp2 = s.nextLine().split(":");
        int[] time = new int[6];
        for (int i = 0; i < 6; i++){
            time[i] = Integer.parseInt(temp2[i]);
        }
        time[5]+= t; //total s
        time[4]+= time[5]/60; //total m
        time[5]%=60; //final s
        time[3]+=time[4]/60; //total h
        time[4]%=60; //final m
        time[2]+=time[3]/24; //total d
        time[3]%=24; //final h
        time[1]+=time[2]; //total month
        time[2]%=12; //final d
        
        
    }
}
