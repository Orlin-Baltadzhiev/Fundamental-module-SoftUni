import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());

        int sum = getAdd(num1,num2);
        int result =sum - num3;
        System.out.println(result);
    }

    private static int getAdd(int num1, int num2) {
        int result = num1+num2;
        return result;
    }
}
