import java.util.Scanner;

public class PalindromeIntigers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String original = scan.nextLine();
        while (!original.equals("END")) {
            getThePalindrome(original);
            original = scan.nextLine();
        }

    }

    private static void getThePalindrome(String original) {
        String reverse = "";


        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}

