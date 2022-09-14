package cccpractice;

import java.util.Scanner;
import java.util.ArrayList;

public class J4Y2008 {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<String>();
        Scanner s = new Scanner(System.in);
        int index = 0;
        while(true) {
            input.add(s.nextLine());
            if (input.get(index).equals("0")){
                break;
            }
            index++;
        }
        for (int i = 0; i < index; i++) {
            char[] val = new char[(input.get(i).length()/2)+ 1];
            System.out.println(input.get(i).length());
            for (int j = 0; j < input.get(i).length(); j++) {
                char temp = input.get(i).charAt(j);
                if (temp != ' ') {
                    val[j] = temp;
                }
            }
            for (char c: val) {
                System.out.println(c);
            }
        }
        
        
        
    }
}
