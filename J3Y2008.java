/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cccpractice;

import java.util.Scanner;

public class J3Y2008 {
    public static void main(String [] args) {
        char[][] keys = {{'A','B','C','D','E','F'}, {'G','H','I','J','K','L'},{'M','N','O','P','Q','R'},{'S','T','U','V','W','X'},{'Y','Z','\n','-','.','e'}};
        Scanner s = new Scanner(System.in);
        String entry = s.nextLine();
        int sum = 0;
        int row = 0;
        int column = 0;
        int orow = 0;
        int ocolumn = 0;
        boolean bk = false;
        for (int i = 0; i < entry.length(); i++) {
            if (i == 0) {
                for (int r = 0; r < 6; r++) {
                    for (int c = 0; c < 5; c++) {
                        if (entry.charAt(i) == keys[r][c]) {
                            row = r;
                            column = c;
                            bk = true;
                            break;
                        }
                        if (bk = true)
                            break;
                    }
                }
                sum+= column + row;
                ocolumn = column;
                orow = row;
            } else {
                for (int r = 0; r < 6; r++) {
                    for (int c = 0; c < 5; c++) {
                        if (entry.charAt(i) == keys[r][c]) {
                            row = r;
                            column = c;
                            bk = true;
                            break;
                        }
                        if (bk = true)
                            break;
                    }
                }
                sum+= Math.abs(column -ocolumn) + Math.abs(row - orow);
            }
            
        }
        
        
        
    }
}
