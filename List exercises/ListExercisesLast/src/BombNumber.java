import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numberList = Arrays.stream(scan.nextLine().split(" "))
                                    .map(Integer::parseInt)
                                    .collect(Collectors.toList());

        String[] specialNumbers = scan.nextLine().split(" ");
        int specialNum = Integer.parseInt(specialNumbers[0]);

        int power = Integer.parseInt(specialNumbers[1]);

        for (int i = 0; i <numberList.size() ; i++) {

            if(numberList.get(i)==specialNum){
                for (int j = i+power; j >=i+1 ; j--) {
                    //int idexx = numberList.get(j);
                    if (j<= numberList.size())
                    numberList.remove(j);
                }
                numberList.remove(i);
                for (int m = i-1; m >=i-power ; m--) {
                   // int index = numberList.get(m);
                    if (m>=0)
                    numberList.remove(m);
                }

            }

        }
        int sum =0;
        for (Integer specialNumber : numberList) {
           sum +=specialNumber;

        }
        System.out.println(sum);


    }
}
