package cccpractice;

import java.util.Scanner;

public class J4Y2011 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean[][] map = new boolean[401][201];
        for (int i = 1; i <= 3; i++) {
            map[200][i] = true;
        }
        for (int i = 201; i <= 203; i++) {
            map[i][3] = true;
        }
        map[203][4] = true;
        map[203][5] = true;
        map[204][5] = true;
        map[205][5] = true;
        map[205][4] = true;
        map[205][3] = true;
        map[206][3] = true;
        map[207][3] = true;
        for (int i = 4; i <= 7; i++) {
            map[207][i] = true;
        }
        for (int i = 206; i >= 199; i--) {
            map[i][7] = true;
        }
        map[199][6] = true;
        map[199][5] = true;
        int lastx = 199;
        int lasty = 5;
        while(true) {
            String dir = s.next();
            int val = s.nextInt();
            if (dir.equals("q")) {
                break;
            } else if (dir.equals("d")) {
                for (int i =1; i <= val; i++) {
                    if (!map[lastx][lasty + i]) {
                        map[lastx][lasty + i] = true;
                    } else {
                        lasty += val;
                        System.out.println((lastx-200) + " -" + lasty + " DANGER");
                        return;
                    }
                }
                lasty += val;
                System.out.println((lastx-200) + " -" + lasty + " safe");
            } else if (dir.equals("u")) {
                for (int i =1; i <= val; i++) {
                    if (!map[lastx][lasty - i]) {
                        map[lastx][lasty - i] = true;
                    } else {
                        lasty -= val;
                        System.out.println((lastx-200) + " -" + lasty + " DANGER");
                        return;
                    }
                }
                lasty -= val;
                System.out.println((lastx-200) + " -" + lasty + " safe");
            } else if (dir.equals("r")) {
                for (int i =1; i <= val; i++) {
                    if (!map[lastx + i][lasty]) {
                        map[lastx + i][lasty] = true;
                    } else {
                        lastx += val;
                        System.out.println((lastx-200) + " -" + lasty + " DANGER");
                        return;
                    }
                }
                lastx += val;
                System.out.println((lastx-200) + " -" + lasty + " safe");
            } else if (dir.equals("l")) {
                for (int i =1; i <= val; i++) {
                    if (!map[lastx - i][lasty]) {
                        map[lastx - i][lasty] = true;
                    } else {
                        lastx -= val;
                        System.out.println((lastx-200) + " -" + lasty + " DANGER");
                        return;
                    }
                }
                lastx -= val;
                System.out.println((lastx-200) + " -" + lasty + " safe");
            }
            
            
            
        }
    }
}
