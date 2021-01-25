import java.util.Scanner;

public class methodExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());

        int sum = getSum(num1, num2);
        int result = getSubstract(sum, num3);
        System.out.println(result);
    }

    private static int getSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
    private static int getSubstract(int sum,int num3){
        int result = sum - num3;
        return result;
    }
}
