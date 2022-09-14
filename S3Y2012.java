package cccpractice;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

//pastebin.com/Vx2321W3

public class S3Y2012 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> max = new ArrayList<>();
        ArrayList<Integer> secmax = new ArrayList<>();
        int n = s.nextInt();
        int[] freq = new int[1001];
        int[] freq2 = new int[1001];
        for (int i = 0; i < n; i++) {
            int input = s.nextInt();
            freq[input]++;
            freq2[input]++;
        }
        Arrays.sort(freq);
        int biggest1 = freq[1000];
        int biggest2 = freq[999];
        
        if (biggest1 == biggest2) {
            for (int i = 1; i<1001; i++) {
                if (biggest1 == freq2[i]) {
                    max.add(i);
                }
            }
        } else {
            for (int i = 1; i < 1001; i++) {
                if (freq2[i] == biggest1) {
                    max.add(i);
                } else if (freq2[i] == biggest2) {
                    secmax.add(i);
                }
            }
        }
        
        if (max.size() ==1) {
            int l=max.get(0);
            int diffA = Math.abs(secmax.get(0) - l);
            int diffB = Math.abs(secmax.get(secmax.size()-1) - l);
            System.out.println(Math.max(diffA, diffB));
        } else {
            System.out.println(max.get(max.size()-1) - max.get(0));
        }
        
    }
}
