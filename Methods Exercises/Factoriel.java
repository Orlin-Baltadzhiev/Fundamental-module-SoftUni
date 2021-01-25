import java.util.Scanner;

public class Factoriel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num = Double.parseDouble(scan.nextLine());
        double num2 = Double.parseDouble(scan.nextLine());
        double firstNumber = firstFactoriel(num);
        double secondNumber = secondFactoriel(num2);
        double result = firstNumber / secondNumber;
        System.out.print(String.format("%.2f", result));

    }

    public static double firstFactoriel(double  num) {
        double result = 1;


        for (double i =1; i <= num; i++) {
            result *= i;

        }
        return result;
    }

    public static double secondFactoriel(double num2) {
        double result = 1;

        for (double i = 1; i <=num2; i++) {
            result *= i;

        }
        return result;
    }
}
