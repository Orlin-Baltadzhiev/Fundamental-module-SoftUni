import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GuassTrrick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputNumbers = scan.nextLine().split(" ");
       List<Integer> items =new ArrayList<>();

        for (int i = 0; i <inputNumbers.length ; i++) {
            int currentNumber = Integer.parseInt(inputNumbers[i]);
        items.add(i, currentNumber);

        }
        int interAction = items.size()/2;
        for (int i = 0; i<interAction ; i++) {
            int firstNumberSum = items.get(i)+items.get(items.size()-1);
            items.set(i, firstNumberSum);
            items.remove(items.size()-1);
        }
        for (Integer item : items) {
            System.out.print(item + " ");

        }
    }
}
