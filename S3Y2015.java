package cccpractice;

import java.util.Scanner;

public class S3Y2015 {
    public static boolean[] gates;
    public static int planes;
    
    public static boolean planeCheck(int x){
        if (x == 0) {
            return false;
        } else if (!gates[x]){
            gates[x] = true;
            return true;
        } else {
            return planeCheck(x-1);
        }
        
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int g = s.nextInt();
        int p = s.nextInt();
        int count = 0;
        gates = new boolean[g+1];
        for (int i = 0; i < p; i++) {
            int plane = s.nextInt();
            if (planeCheck(plane)) {
                count++;
            } else {
                System.out.println(count);
                return;
            }
        }
        
    }
}
