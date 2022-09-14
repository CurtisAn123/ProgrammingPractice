package cccpractice;

import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList;

public class S3Y2013 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] game = new char[6];
        int[] points = new int[4];
        LinkedList<String> map = new LinkedList<>();
        map.add("12");
        map.add("13");
        map.add("14");
        map.add("23");
        map.add("24");
        map.add("34");
        int T = s.nextInt();
        int G = s.nextInt();
        for (int i = 0; i < G; i++) {
            String team = s.next() + s.next();
            int index = map.indexOf(team);
            int s1 = s.nextInt();
            int s2 = s.nextInt();
            if (s1>s2){
                game[index] = 'W';
            } else if (s1<s2) {
                game[index] = 'L';
            } else {
                game[index] = 'T';
            }
        }
        LinkedList<char[]> queue = new LinkedList<>();
        queue.add(game);
        int count = 0;
        while(true) {
            char[] temp = queue.peek();
            int index = -1;
            for (int i =0; i<6; i++) {
                if (game[i] =='\u0000'){
                    index=i;
                    break;
                }
            }
            if (index==-1) {
                break;
            } else {
                char[] temp1 = Arrays.copyOf(game, 6);
                temp1[index] = 'W';
                char[] temp2 = Arrays.copyOf(game, 6);
                temp2[index] = 'L';
                char[] temp3 = Arrays.copyOf(game, 6);
                temp3[index] = 'T';
                queue.add(temp1);
                queue.add(temp2);
                queue.add(temp3);
            }
        }
        while(!queue.isEmpty()) {
            Arrays.fill(points, 0);
            char[] R = queue.poll();
            for (int i = 0; i < 6;i++){
                
                
            }
        }
    }
}
