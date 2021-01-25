import java.util.Scanner;

public class SignOfIntiger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        getPirintNumbers(num);
    }

    private static void getPirintNumbers(int currentNum) {
        if (currentNum>0){
            System.out.printf("The number %d is positive.",currentNum);
        } else if (currentNum<0){
            System.out.printf("The number %d is negative.",currentNum);
        } else {
            System.out.println("The number 0 is zero.");
        }
    }
}
