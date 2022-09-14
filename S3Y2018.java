/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cccpractice;

//https://pastebin.com/dyQKeAC9 this problem

import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList;

public class S3Y2018 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int R = s.nextInt();
        int C = s.nextInt();
        char[][] map = new char[R][C];
        for (int r = 0; r < R; r++) {
            map[r] = s.next().toCharArray();
        }
        int br = 0;
        int bc = 0;
        int[][] step = new int[R][C];
        for (int r = 0; r < R; r++) {
            Arrays.fill(step[r], Integer.MAX_VALUE);
        }
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                if (map[r][c] == 'W') {
                    step[r][c] = -1;
                } else if (map[r][c] == 'S') {
                    br = r;
                    bc = c;
                } else if (map[r][c] == 'C') {
                    //update step value affected by C to -1
                    for (int i = r; i >=0; i--) {
                        if (map[i][c] == 'W') {
                            break;
                        } else if (map[i][c] =='.' || map[i][c] == 'S'){
                            step[i][c] = -1;
                        }
                    }
                    for (int i = r; i <= R; i++) {
                        if (map[i][c] == 'W') {
                            break;
                        } else if (map[i][c] =='.' || map[i][c] == 'S'){
                            step[i][c] = -1;
                        }
                    }
                    for (int i = c; i >=0; i--) {
                        if (map[r][i] == 'W') {
                            break;
                        } else if (map[r][i] =='.' || map[r][i] == 'S'){
                            step[r][i] = -1;
                        }
                    }
                    for (int i = c; i <= C; i++) {
                        if (map[r][i] == 'W') {
                            break;
                        } else if (map[r][i] =='.' || map[r][i] == 'S'){
                            step[r][i] = -1;
                        }
                    }
                }
            }
        }
        //create a linkedlist queue to store the processing oder
        step[br][bc] = 0;
        LinkedList<Integer> rq = new LinkedList<Integer>();
        LinkedList<Integer> cq = new LinkedList<Integer>();
        rq.add(br);
        cq.add(bc);
        
        while(!rq.isEmpty()) {
            int r = rq.poll();
            int c = cq.poll();
            if (step[r+1][c] != -1 && (map[r][c] == '.' || map[r][c] == 'S' || map[r][c] == 'D')) { //in the future, check the boundary
                if (map[r+1][c] == '.' && step[r][c]+1 < step[r+1][c]) { //check boundary by doing if(r-1>=0)
                    step[r+1][c] = step[r][c] + 1;
                    rq.add(r+1);
                    cq.add(c);
                } else if (map[r+1][c] != '.' && step[r+1][c] > step[r][c]){
                    step[r+1][c] = step[r][c];
                    rq.add(r+1);
                    cq.add(c);
                }
            }
            if (step[r-1][c] != -1 && (map[r][c] == '.' || map[r][c] == 'S' || map[r][c] == 'U')) {
                if (map[r-1][c] == '.' && step[r][c]+1 < step[r-1][c]) { //check boundary by doing if(r-1>=0)
                    step[r-1][c] = step[r][c] + 1;
                    rq.add(r-1);
                    cq.add(c);
                } else if (map[r-1][c] != '.' && step[r-1][c] > step[r][c]){
                    step[r-1][c] = step[r][c];
                    rq.add(r-1);
                    cq.add(c);
                }
            }
            if (step[r][c+1] != -1 && (map[r][c] == '.' || map[r][c] == 'S' || map[r][c] == 'R')) {
                if (map[r][c+1] == '.' && step[r][c]+1 < step[r][c+1]) { //check boundary by doing if(r-1>=0)
                    step[r][c+1] = step[r][c] + 1;
                    rq.add(r);
                    cq.add(c+1);
                } else if (map[r][c+1] != '.' && step[r][c+1] > step[r][c]){
                    step[r][c+1] = step[r][c];
                    rq.add(r);
                    cq.add(c+1);
                }
            }
            if (step[r][c-1] != -1 && (map[r][c] == '.' || map[r][c] == 'S' || map[r][c] == 'R')) {
                if (map[r][c-1] == '.' && step[r][c]+1 < step[r][c-1]) { //check boundary by doing if(r-1>=0)
                    step[r][c-1] = step[r][c] + 1;
                    rq.add(r);
                    cq.add(c-1);
                } else if (map[r][c-1] != '.' && step[r][c-1] > step[r][c]){
                    step[r][c-1] = step[r][c];
                    rq.add(r);
                    cq.add(c-1);
                }
            }
        }
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++){
                if (map[i][j] == '.') {
                    if (step[i][j] == Integer.MAX_VALUE) {
                        System.out.println("-1");
                    } else {
                    System.out.println(step[i][j]);
                    }
                }
            }
        }
        
    }
}
