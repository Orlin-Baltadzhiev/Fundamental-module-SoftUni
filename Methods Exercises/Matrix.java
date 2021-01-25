import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        getTheMatrix(num);
    }
    public static void getTheMatrix (int num){
        for (int i = 1; i <=num ; i++) {

            for (int j = 1; j <=num; j++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
