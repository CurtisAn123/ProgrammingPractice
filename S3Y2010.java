/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cccpractice;

//https://pastebin.com/uDkujueH

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class S3Y2010 {
    static int H,k;
    static int[] houses;
    
    public static boolean isPossible(int x) {
        int last = -1;
        int count = 0;
        for (int h = 0; h<H; h++){
            int housePos = houses[h];
            if (housePos > last){
                count++;
                last = housePos + 2*x;
            }
        }
        if (last >= 1000000) {
            last-=1000000;
            if (houses[0] <= last) {
                count--;
            }
        }
        if (count <= k) {
            return true;
        } else {
            return false;
        }
    }
    
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        H = s.nextInt();
        houses = new int[H];
        for (int i = 0; i < H; i++) {
            houses[i] = s.nextInt();
        }
        k = s.nextInt();
        Arrays.sort(houses);
        for (int i = 0; i < 500000; i++) {
            if (isPossible(i)) {
                System.out.println(i);
                return; 
            }
        }
    }
}
