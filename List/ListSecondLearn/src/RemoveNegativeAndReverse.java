import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativeAndReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());

        for (int i = 0; i <numbers.size() ; i++) {
            if (numbers.get(i)<0){
                numbers.remove(i);
                i=-1;
            }

        }
        if (!numbers.isEmpty()){
            Collections.reverse(numbers);
        } else {
            System.out.println("empty");
        }
        for (Integer number : numbers) {
            System.out.printf("%d ", number);
        }
    }
}
