import java.util.Scanner;

public class PrintTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());


        printTriangle(num);
        printDownTriangele(num);
    }

    private static void printDownTriangele(int num) {
        int someInt= num;
        for (int i = 1; i <num ; i++) {

            for (int j =1; j < someInt ; j++) {
                System.out.print(j+ " ");
            }
            someInt--;
            System.out.println();
        }
    }

    private static void printTriangle(int num) {
        for (int i = 1; i <=num ; i++) {
            for (int j =1 ; j <=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }
}
