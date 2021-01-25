import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int sum = 0;
        int result = getTheVowelsCount(input, sum);
        System.out.println(result);

    }

    private static int getTheVowelsCount(String input, int sum) {
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.toLowerCase().charAt(i);
            switch (symbol) {
                case 'a':
                    sum++;
                    break;
                case 'e':
                    sum++;
                    break;
                case 'y':
                    sum++;
                    break;
                case 'u':
                    sum++;
                    break;
                case 'i':
                    sum++;
                    break;
                case 'o':
                    sum++;
                    break;
            }


        }
        return sum;

    }
}
