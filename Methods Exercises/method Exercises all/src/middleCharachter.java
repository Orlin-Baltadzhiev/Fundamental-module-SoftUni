import java.util.Scanner;

public class middleCharachter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        getTheMiddleCharachter(input);
    }

    private static void getTheMiddleCharachter(String input) {
        if (input.length() % 2 == 0) {
            char firstSymbol = input.charAt(input.length() / 2 - 1);
            System.out.print(firstSymbol);
        }
        char secondSymbol = input.charAt(input.length() / 2);
        System.out.print(secondSymbol);


    }
}
