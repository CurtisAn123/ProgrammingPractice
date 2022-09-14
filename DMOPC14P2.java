/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cccpractice;

import java.util.*;
import java.io.*;

public class DMOPC14P2 {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int w = s.nextInt();
        int l = s.nextInt();
        int t = s.nextInt();
        int temp1 = w/t;
        int temp2 = l/t;
        System.out.println(temp1*temp2);
    }
    
}
