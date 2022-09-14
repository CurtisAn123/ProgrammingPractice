package cccpractice;

import java.util.*;
import java.io.*;

public class DWITE2010R1no3 {
    
    public static int minpower(int x){
        if (x ==1){
            return 0;
        }
        return minpower(x/2) + 1;
        
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(minpower(8));
        System.out.println(minpower(20));
        System.out.println(minpower(50));
        for (int i = 0; i < 5; i++){
            int not = 0;
            int N = s.nextInt();
            int M = s.nextInt();
            int min = Integer.min(N, M);
            int max = Integer.max(N, M);
            while(max!=0){
                int p2 = minpower(min);
                
            }
        }
        
        
    }
    
}
