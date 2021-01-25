import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();


        boolean isCorrectPass = isCorrectThePassword(input);
        if (isCorrectPass) {
            System.out.println("Password is valid");
        }
    }

    private static boolean isCorrectThePassword(String input) {
        boolean isSixToTenCharachters = isSixToTen(input);
        boolean lettersAndDigits = lettersAndDigit(input);
        boolean atLeastTwoDigits = checkForTwoDigits(input);

        if (isSixToTenCharachters && lettersAndDigits && atLeastTwoDigits) {
            return true;
        }
        return false;
    }

    private static boolean checkForTwoDigits(String input) {
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);

            if (Character.isDigit(symbol)) {
                counter++;
            }
        }
        if (counter >= 2) {
            return true;
        } else
            System.out.println("Password must have at least 2 digits");

        return false;
    }

    private static boolean lettersAndDigit(String input) {

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            int symbolInNum = symbol;
            if (Character.isLetterOrDigit(symbol)) {


            } else {
                System.out.println("Password must consist only of letters and digits");
                return false;
            }
        }
        return true;
    }

    private static boolean isSixToTen(String input) {
        if (input.length() >= 6 && input.length() <= 10) {
            return true;
        } else {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
    }
}
