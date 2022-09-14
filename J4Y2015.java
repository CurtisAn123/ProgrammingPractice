
package cccpractice;

import java.util.Scanner;
import java.util.LinkedList;

public class J4Y2015 {
    
    
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int M = s.nextInt();
        int time = 0;
        int[] rt = new int[101]; //receive time
        int[] st = new int[101]; //send time
        int[] diff = new int[101];
        LinkedList<Integer> friends = new LinkedList<>();
        for (int i = 0; i < M; i++) {
            String input = s.next();
            if (input.equals("R")) {
                int friend = s.nextInt();
                rt[friend] = time;
                time++;
                if (friends.contains(friend)) {
                    friends.add(friend);
                }
            } else if (input.equals("W")) {
                int wait = s.nextInt();
                time += wait - 1;
            } else if (input.equals("S")) {
                int sent = s.nextInt();
                st[sent] = time;
                diff[sent] += (st[sent]- rt[sent]);
                rt[sent] = 0;
                st[sent] = 0;
                time++;
            }
        }
        while(!friends.isEmpty()) {
            int temp = friends.poll();
            System.out.println(temp + " " + diff[temp]);
        }
    }
}
