/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cccpractice;

import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList;

public class S2Y2018MockCCC {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        LinkedList<Integer> set = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            set.add(s.nextInt());
        }
        int count = 0;
        for (int i = N; i > 0; i--) {
            int index = set.indexOf(i);
            if (index != N-i) {
                count+= index - (N-i);
                set.remove(index);
                set.add(N-i, i);
            }
        }
        System.out.println(count);
        
    }
}
