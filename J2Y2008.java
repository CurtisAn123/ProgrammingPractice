
package cccpractice;

import java.util.Scanner;
import java.util.LinkedList;

public class J2Y2008 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] mp3 = {'A','B','C','D','E'};
        while (true) {
            int input = s.nextInt();
            if (input == 1){
                char temp = mp3[0];
                mp3[0] = mp3[4];
                mp3[4] = temp;
            } else if (input == 2){
                char temp = mp3[4];
                mp3[4] = mp3[0];
                mp3[0] = temp;
            } else if (input == 3){
                char temp = mp3[0];
                mp3[0] = mp3[1];
                mp3[1] = temp;
            } else {
                break;
            }
        }
        for(int i = 0; i<5; i++){
            System.out.print(mp3[i] + " ");
        }
    }

    
}
