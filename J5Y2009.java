
package cccpractice;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Arrays;

public class J5Y2009 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        LinkedList<Integer> numOF = new LinkedList<>();
        LinkedList<Integer> friendsOF = new LinkedList<>();
        LinkedList<Integer> DOfS = new LinkedList<>();
        boolean[][] map = new boolean[51][51];
        while (true) {
            String input = s.next();
            if (input.equals("i")) {
                int bv = s.nextInt();
                int ev = s.nextInt();
                map[bv][ev] = true;
                map[ev][bv] = true;
            } else if (input.equals("d")) {
                int bv = s.nextInt();
                int ev = s.nextInt();
                map[bv][ev] = false;
                map[bv][ev] = false;
            } else if (input.equals("n")) {
                numOF.add(s.nextInt());
            } else if (input.equals("f")) {
                friendsOF.add(s.nextInt());
            } else if (input.equals("s")) {
                DOfS.add(s.nextInt());
                DOfS.add(s.nextInt());
            } else if (input.equals("q")) {
                break;
            }
        }
        //Hardcode Map
        map[2][6] = true;
        map[6][2] = true;
        map[1][6] = true;
        map[6][1] = true;
        map[7][6] = true;
        map[6][7] = true;
        map[5][6] = true;
        map[6][5] = true;
        map[4][6] = true;
        map[6][4] = true;
        map[3][6] = true;
        map[6][3] = true;
        map[8][7] = true;
        map[7][8] = true;
        map[8][9] = true;
        map[9][8] = true;
        map[9][10] = true;
        map[10][9] = true;
        map[9][12] = true;
        map[12][9] = true;
        map[10][11] = true;
        map[11][10] = true;
        map[11][12] = true;
        map[12][11] = true;
        map[12][13] = true;
        map[13][12] = true;
        map[15][13] = true;
        map[13][15] = true;
        map[14][13] = true;
        map[13][14] = true;
        map[15][3] = true;
        map[3][15] = true;
        map[17][16] = true;
        map[16][17] = true;
        map[18][16] = true;
        map[16][18] = true;
        map[17][18] = true;
        map[18][17] = true;
        
        int[] step = new int[51];
        Arrays.fill(step, Integer.MAX_VALUE);
        LinkedList<Integer> queue = new LinkedList<>();
        
        
    }
    
}
