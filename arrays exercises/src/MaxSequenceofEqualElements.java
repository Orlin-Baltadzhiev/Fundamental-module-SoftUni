import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MaxSequenceofEqualElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        int lenght = 1;
        int besLenght = 0;
        int endIndex = -1;
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] == num[i + 1]) {
                lenght++;
                if (lenght > besLenght) {
                    besLenght = lenght;
                    endIndex = i + 1;
                }
            } else {
                lenght = 1;
            }
        }
        for (int i = endIndex; i > endIndex - besLenght; i--) {
            System.out.print(num[i] + " ");
        }
    }

}
