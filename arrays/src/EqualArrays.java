import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arrayNum = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] arrayOther = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int lenght = arrayOther.length;
        int sum = 0;
        boolean isTrue = true;
        for (int i = 0; i <lenght ; i++) {

            if (arrayNum[i]==arrayOther[i]){
                sum +=arrayNum[i];
            } else {
                int index = i;
                System.out.printf("Arrays are not identical. Found difference at %d index.", index);
                isTrue = false;
                break;
            }
        }
        if (isTrue){
            System.out.printf("Arrays are identical. Sum: %d",sum);
        }
    }
}
