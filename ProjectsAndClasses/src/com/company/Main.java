package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	    String[] words = scan.nextLine().split(" ");
        Random  rnd = new Random();

        for (int i = 0; i <words.length; i++) {
            int swapIndex = rnd.nextInt(words.length);

            String temporary = words[i];
            words[i] = words[swapIndex];
            words[swapIndex] = temporary;
            int result = 0;
        }
        for (int i = 0; i <words.length ; i++) {
            System.out.print(words[i] + " ");
        }
    }
}
