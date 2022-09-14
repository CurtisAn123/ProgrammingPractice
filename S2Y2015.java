/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cccpractice;

import java.util.Scanner;

public class S2Y2015 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int J = Integer.parseInt(s.nextLine());
        int A = Integer.parseInt(s.nextLine());
        char[] jers = new char[J + 1];
        char[] size = new char[A];
        int[] num = new int[A];
        String temp;
        for (int i = 1; i < J + 1; i++) {
            temp = s.nextLine();
            jers[i] = temp.charAt(0);
        }
        String temp2;
        for (int i = 0; i < A; i++) {
            temp = s.nextLine();
            size[i] = temp.charAt(0);
            temp2 = (temp.substring(2));
            num[i] = Integer.parseInt(temp2);
        }
        int count = 0;
        for (int i = 0; i < A; i++) {
            if (jers[num[i]] == 'L') {
                count++;
                jers[num[i]] = 'N';
            } else if (jers[num[i]] == 'M' && (size[i] == 'S' || size[i] == 'M')) {
                count++;
                jers[num[i]] = 'N';
            } else if (jers[num[i]] == 'S' && size[i] == 'S') {
                count++;
                jers[num[i]] = 'N';
            }
        }
        System.out.println(count);
    }
}
