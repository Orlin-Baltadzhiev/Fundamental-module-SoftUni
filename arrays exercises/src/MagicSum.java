import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] num = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int toCheckNumber= scan.nextInt();

        for (int i = 0; i < num.length; i++) {
            int currentNumber = num[i];
            for (int j = i + 1; j <num.length ; j++) {
                int secondNumber = num[j];

                if (currentNumber +secondNumber ==toCheckNumber ){
                    System.out.print(currentNumber + " "+ secondNumber);
                    System.out.println();
                }
            }
        }
    }
}
