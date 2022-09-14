package cccpractice;

import java.util.Scanner;


public class J4Y2004 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String code = s.nextLine();
        String wordInput = s.nextLine();
        String word = "";
        for (int i = 0; i < wordInput.length(); i++){
            if(wordInput.charAt(i) >= 'A' && wordInput.charAt(i) <= 'Z') {
                word += wordInput.substring(i,i+1);
            }
        }
        for (int i = 0; i < word.length(); i++) {
            char temp = word.charAt(i);
            temp += (code.charAt(i%code.length())-'A');
            if (temp > 'Z') {
                temp =(char)('A' + (temp - 'Z')-1);
            }
            System.out.print(temp);
            
        }
        
    }
}
