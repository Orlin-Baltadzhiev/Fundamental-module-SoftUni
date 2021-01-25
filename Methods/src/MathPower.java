import java.math.BigDecimal;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigDecimal a = new BigDecimal(scan.nextLine());
        int b = scan.nextInt();
        BigDecimal result = getBigDecimalPow(a,b);
        System.out.println(result);
    }

    private static BigDecimal getBigDecimalPow(BigDecimal a, int b) {
        BigDecimal result = a.pow(b);
        return result;
    }
}
