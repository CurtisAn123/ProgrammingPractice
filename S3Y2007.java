package cccpractice;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Arrays;

public class S3Y2007 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] friend = new int[10000];
        for (int i = 0; i < n; i++) {
            int x = s.nextInt();
            int y = s.nextInt();
            friend[x] = y;
        }
        LinkedList<Integer> queue = new LinkedList<Integer>();
        int[] step = new int[10000];
        int f1 = s.nextInt();
        int f2 = s.nextInt();
        while(f1!=0) {
            Arrays.fill(step, Integer.MAX_VALUE);
            step[f1] = 0;
            queue.add(f1);
            
            while(!queue.isEmpty()){
                int temp = queue.poll();
                if (friend[temp] == f2) {
                    System.out.println("Yes" + " " +step[temp]);
                } else if (friend[temp] != f2) {
                    if(step[friend[temp]] != Integer.MAX_VALUE){
                        System.out.println("No");
                        break;
                    } else {
                        step[friend[temp]] = step[temp]+1;
                        queue.add(friend[temp]);
                    }
                }
                
                
            }
            f1 = s.nextInt();
            f2 = s.nextInt();
        }
    }
}
