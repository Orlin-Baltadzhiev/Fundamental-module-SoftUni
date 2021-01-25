import java.util.Arrays;
import java.util.Scanner;

public class topIntiger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            boolean isBigger = true;
            for (int j = i + 1; j < numbers.length; j++) {
                if (currentNumber <= numbers[j]) {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger) {
                System.out.print(currentNumber+ " ");

            }
        }



        //System.out.println(numbers[numbers.length - 1]);
    }
}
