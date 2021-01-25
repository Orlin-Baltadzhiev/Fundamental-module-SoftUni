import java.util.Scanner;

public class EvenAndOddSubstraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int[] numbers = new int[input.length];

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);

            if (numbers[i] % 2 == 0) {
                evenSum += numbers[i];
            } else if (numbers[i] % 2 != 0){
                oddSum+=numbers[i];
            }
        }
        int result = evenSum - oddSum;
        System.out.println(result);
    }
}
