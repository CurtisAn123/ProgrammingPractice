/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cccpractice;
import java.io.*;
import java.util.*;

public class slimes {

    //Cindy
    public static long memo[][] = new long[405][405];
    public static long psa[] = new long[405];
    public static long a[] = new long[405];

    public static long fun(int l, int r) {
        //cannot combine --> no cost
        if (l == r) {
            return 0;
        }

        //two Slime
        if (l + 1 == r) {
            return a[l] + a[r];
        }

        //if already know the answer just return the answer
        if (memo[l][r] != Long.MAX_VALUE) {
            return memo[l][r];
        }

        //if memo no valid value
        //m represent split the slime range into two segment
        for (int m = l; m < r; m++) {
            memo[l][r] = Math.min(memo[l][r], fun(l, m) + fun(m + 1, r) + psa[r] - psa[l - 1]);
        }
        return memo[l][r];
    }

    //Erika
    public static void main(String[] args) throws IOException {
        //fill the memo array with the maximum value to find the minimum 
        for (int i = 0; i < 405; i++) {
            Arrays.fill(memo[i], Long.MAX_VALUE);
        }

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        //Input costs into array 
        int N = Integer.parseInt(in.readLine());
        String[] tmp = in.readLine().split(" ");
        for (int i = 1; i <= N; i++) {
            a[i] = Long.parseLong(tmp[i - 1]);
        }

        //calculate the prefix sum
        for (int i = 1; i <= N; i++) {
            psa[i] = psa[i - 1] + a[i];
        }
        System.out.println(fun(1, N));
    }
}
