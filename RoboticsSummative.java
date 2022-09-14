package cccpractice;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class RoboticsSummative {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n<4) {
            System.out.println("0");
            return;
        }
        ArrayList<Integer> len = new ArrayList<>();
        for (int i = 1; i < n+1; i++) {
            len.add(s.nextInt());
        }
        Collections.sort(len);
        long min = 0;
        int count = 0;
        for (int i = n-1; i > 0; i--) {
            int temp = len.get(i) - len.get(i-1);
            if (temp < 2) {
                count++;
                if (count == 2) {
                    System.out.println(min*(long)(len.get(i-1)));
                    return;
                }
                min = len.get(i-1);
                i--;
            }
        }
        System.out.println("0");
    }
}
