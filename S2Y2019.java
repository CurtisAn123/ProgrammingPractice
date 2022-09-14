/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cccpractice;

import java.util.Scanner;


public class S2Y2019 {
    
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int[] N = new int[T];
        for (int i = 0; i < T; i++) {
            N[i] = s.nextInt();
        }
        int[] Ans = new int[T];
        
        for (int i = 0; i<T; i++) {
            Ans[i] = Factor1(N[i]);
        }
        
        for (int i = 0; i<T; i++) {
            int Ans2 = N[i]*2-Ans[i];
            System.out.println(Ans[i] + " " + Ans2);
        }
    }
    
    public static boolean isPrime (int n) {
        if (n%2 == 0) {
            return false;
        }
        for (int i = 3; i<Math.sqrt(n) + 1; i+=2) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static int Factor1(int p) {
        /*first get lower side factor
        is prime this factor
        if not get next lowest factor
        if it is a prime, do 2*N - this number, then isprime that number
        if it is a prime then there are the 2 addition factors, if not then move to next lowest number*/
        if (isPrime(p))
            return p;
        if (p%2 == 0) {
            p++;
            for (int i = 2; i < p; i+=2) {
                int f1 = p-i;
                if (isPrime(f1)) {
                    if (isPrime(2*(p-1) -f1)) {
                        return f1;
                    }
                }
            }
        } else {
            for (int i = 2; i < p; i+=2) {
                int f1 = p-i;
                if (isPrime(f1)) {
                    if (isPrime(2*(p) -f1)) {
                        return f1;
                    }
                }
            }
        }
        return 0;
    }
    
}
