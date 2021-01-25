import java.util.Scanner;

public class arrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input =scan.nextLine().split(" ");
        int num = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < num; i++) {
           String firstSring = input[0];
            for (int j = 0; j <input.length-1 ; j++) {
                input[j]=input[j+1];
            }
            input[input.length-1]=firstSring;
        }

        System.out.println(String.join(" ",input));

    }
}
