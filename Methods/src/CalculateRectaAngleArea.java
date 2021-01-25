import java.util.Scanner;

public class CalculateRectaAngleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());

        double area = printArea(a,b);
        System.out.printf("%.0f",area);

    }

    private static double printArea(double a, double b) {
        double result = a*b;
        //System.out.printf("%.0f",result);
        return result;
    }
}
