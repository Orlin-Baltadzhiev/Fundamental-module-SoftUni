import java.util.Scanner;

public class MathOperation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        char operator=scan.nextLine().charAt(0);
        double b = Double.parseDouble(scan.nextLine());

        double result = getTheSum(a,operator,b);

        System.out.printf("%.0f",result);
    }

    private static double getTheSum(double a, char operator, double b) {
        double result=0;
        switch (operator){
            case '*':
                result=a*b;
                break;
            case '+':
                result=a+b;
                break;
            case '-':
                result = a-b;
                break;
            case '/':
                result=a/b;
                break;
        }
        return result;
    }
}
