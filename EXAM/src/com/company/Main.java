package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String text = scan.nextLine();

        while (!text.equals("Generate")){
            String[] tokens = text.split(">>>");
            String command = tokens[0];

            switch (command) {
                case "Contains":
                    String substring = tokens[1];
                    if (input.contains(substring)) {
                        System.out.println(String.format("%s contains %s",input,substring));
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String toChange =input;
                    String upperOrLower = tokens[1];
                    int startIndex = Integer.parseInt(tokens[2]);
                    int endIndex =   Integer.parseInt(tokens[3]);
                    String oldChar =input.substring(startIndex,endIndex);
                    if(upperOrLower.equals("Upper")){

                        toChange=toChange.substring(startIndex,endIndex).toUpperCase();
                        String upperCase=input.replace(oldChar,toChange);
                        input=upperCase;
                        System.out.println(input);
                    } else if (upperOrLower.equals("Lower")){
                        toChange=toChange.substring(startIndex,endIndex).toLowerCase();
                        String lowerCase=input.replace(oldChar,toChange);
                        input=lowerCase;
                        System.out.println(input);
                    }
                    break;
                case "Slice":
                    int startI =Integer.parseInt(tokens[1]);
                    int endI=   Integer.parseInt(tokens[2]);
                    input = input.substring(0,startI)+input.substring(endI,input.length());
                    System.out.println(input);
                    break;
            }



            text=scan.nextLine();
        }
        System.out.println("Your activation key is: "+input);
    }
}
