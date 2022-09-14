/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cccpractice;

import java.util.Scanner;
import java.util.Arrays;

public class S3Y2017 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] length = new int[n];
        for (int i = 0; i < n; i++) {
            length[i] = s.nextInt();
        }
        Arrays.sort(length);
        int[] sum = new int[n/2+1];
        int[] height = new int[n/2+1];
        sum[0] = length[0] + length[n-1];
        for (int i = 1; i < n; i++) {
            sum[i] = length[i] + length[n-i-1];
            if (sum[i] == sum[i-1]) {
                height[i] += 1;
            }
        }
        int numL = 1;
        int leng = 1;
        for (int i = 1; i < n/2; i++) {
            if (height[i] > height[i-1]) {
                leng = height[i];
            } else if (height[i] == height[i-1]) {
                numL++;
            }
        }
        
    }
}
