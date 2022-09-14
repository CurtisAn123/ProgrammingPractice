/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cccpractice;

import java.util.Scanner;
import java.util.Arrays;


//set asterisk value to 0
//if the diff between the two is more than a, then there must be asterisks
//convert all char vals into an int array, sort arary, then compare values
//start comparing from beginning and keep note of how many spots skipped. find if ascii val of * is > or < a


public class S1Y2016 {
    
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        String first = s.nextLine();
        String second = s.nextLine();
        int asterisk = 0;
        int[] fArr = new int[28];
        int[] sArr = new int[28];
        for (int i = 0; i < first.length(); i++) {
            fArr[(int)first.charAt(i) - 97]++;
        }
        for (int i = 0; i < second.length(); i++) {
            if (second.charAt(i) != '*') {
                sArr[(int)second.charAt(i) - 97]++;
            } else {
                asterisk++;
            }
        }
        int diff = 0;
        for (int i = 0; i < 27; i++) {
            if (fArr[i] != sArr[i]) {
                diff = fArr[i] - sArr[i];
                if (diff < 0) {
                    System.out.println("N");
                    System.exit(0);
                }
                asterisk -= diff;
                if (asterisk < 0) {
                    System.out.println("N");
                    System.exit(0);
                }
            }
        }
        System.out.println("A");
        
        
    }
    
}
