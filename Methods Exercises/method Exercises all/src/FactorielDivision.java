import java.util.Scanner;

public class FactorielDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num = Double.parseDouble(scan.nextLine());
        double num2 = Double.parseDouble(scan.nextLine());

        double firstSum=getTheFirstSum(num);
        double secondSum =getTheSecondFactoriel(num2);
        double result = firstSum/secondSum;
        System.out.println(String.format("%.2f",result));
    }

    private static double getTheSecondFactoriel(double num2) {
        double result=1;
        for (int i = 1; i <=num2 ; i++) {
            result*=i;
        }
        return result;
    }

    private static double getTheFirstSum(double num) {
        double result=1;
        for (int i = 1; i <=num ; i++) {
            result*=i;
        }
        return result;
    }
}
