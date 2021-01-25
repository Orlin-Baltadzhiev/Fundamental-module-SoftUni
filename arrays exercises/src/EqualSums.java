import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int leftSum = 0;
        int rightSum = 0;
        int add = 0;
        int minus = 0;
        boolean isEqual= false;
        // 1 2 3 3
        for (int i = 0; i < num.length; i++) {
            rightSum = 0;
            leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += num[j];
            }
            for (int k = i + 1; k < num.length; k++)
                rightSum += num[k];

            if (rightSum == leftSum) {
                System.out.println(i);
                isEqual = true;
            }
        }
        if(!isEqual){
            System.out.println("no");
        }
    }
}