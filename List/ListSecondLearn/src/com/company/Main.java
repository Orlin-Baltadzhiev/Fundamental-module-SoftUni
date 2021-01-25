package com.company;

import java.awt.*;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> num = Arrays.stream(scan.nextLine()
                .split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        double index =0;
        double secondIndex=0;
        for (int i = 0; i <num.size()-1 ; i++) {
            index=num.get(i);
            secondIndex = num.get(i+1);
            double sum=0;
            if(index==secondIndex){
                sum=index+secondIndex;
                num.set(i,sum);
                num.remove(i+1);
                i=-1;


            }

        }
        String output="";
        for (Double item:num) {

        output +=(new DecimalFormat("0.#").format(item)+ " ");

        }
        System.out.println(output);


    }
}
