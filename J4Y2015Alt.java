
package cccpractice;

import java.util.Scanner;
import java.util.LinkedList;

public class J4Y2015Alt {
    
    
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] wait = new int[101];
        int[] receive = new int[101];
        int[] reply = new int[101];
        int time = 0;
        for (int i = 0; i < N; i++) {
            String input = s.next();
            int I = s.nextInt();
            if (input.equals("R")) {
                time++;
                receive[I] = time;
                reply[I] = -1;
            } else if (input.equals("W")) {
                time+= I-1;
            } else if (input.equals("S")) {
                time++;
                wait[I] += time - receive[I];
                reply[I] = time;
            }
        }
        for (int i = 1; i < 101; i++) {
            if (reply[i] == -1) {
                System.out.println(i + " -1");
            } else if (reply[i] != 0) {
                System.out.println(i + " " + wait[i]);
            }
        }
        
    }
}
