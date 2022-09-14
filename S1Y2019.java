/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cccpractice;

import java.util.Scanner;

public class S1Y2019 {
    
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        int v = 0;
        int h = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.substring(i,i+1).equals("H")) {
                h++;
            } else {
                v++;
            }
        }
        
        if (v%2 == 0 && h%2 == 0) {
            System.out.println("1 2");
            System.out.println("3 4");
        } else if (v%2 == 1 && h%2 == 0) {
            System.out.println("2 1");
            System.out.println("4 3");
        } else if (v%2 == 0 && h%2 == 1) {
            System.out.println("3 4");
            System.out.println("1 2");
        } else {
            System.out.println("4 3");
            System.out.println("2 1");
        }
        
    }
    
}
