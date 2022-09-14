/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cccpractice;

import java.util.ArrayList;
import java.util.Scanner;

public class S2Y2014 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<String> set1 = new ArrayList<String>();
        ArrayList<String> set2 = new ArrayList<String>();
        
        for (int i = 0; i < n; i++){
            set1.add(s.next());
        }
        for (int i = 0; i < n; i++){
            set2.add(s.next());
        }
        boolean output = true;
        for (int i = 0; i < n; i++) {
            if (!set1.get(i).equals(set2.get(i))) {
                int index = set2.indexOf(set1.get(i));
                if (!set1.get(index).equals(set2.get(i))) {
                    System.out.println("bad");
                    return;
                }
            } else {
                System.out.println("bad");
                return;
            }
        }
        System.out.println("good");
    }
}
