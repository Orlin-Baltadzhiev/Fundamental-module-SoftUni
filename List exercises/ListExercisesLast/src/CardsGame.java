import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int i =0;
        while (!firstList.isEmpty() && !secondList.isEmpty()){
            int firstHand = firstList.get(0);
            int secondHand = secondList.get(0);

            if (firstHand>secondHand){
                firstList.add(firstHand);
                firstList.add(secondHand);

                firstList.remove(0);
                secondList.remove(0);
            } else if (secondHand> firstHand){
                secondList.add(secondHand);
                secondList.add(firstHand);

                firstList.remove(0);
                secondList.remove(0);
            } else if (firstHand == secondHand) {
                firstList.remove(0);
                secondList.remove(0);
            }



        }
        int sum =0;
        if (firstList.size()>0){
            for (Integer integer : firstList) {
                sum +=integer;
            }
            System.out.printf("First player wins! Sum: %d",sum);
        } else {
            for (Integer integer : secondList) {
                sum+=integer;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }

    }
}
