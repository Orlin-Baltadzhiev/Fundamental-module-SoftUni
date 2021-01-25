import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        int num = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());

        switch (command){
            case "add":
                getAdd(num,num2);
                break;
            case "multiply":
                getMiltiply(num,num2);
                break;
            case "subtract":
                getSubtract(num,num2);
                break;
            case "divide":
                getDivide(num,num2);
                break;



        }
    }

    private static void getDivide(int num, int num2) {
        System.out.println(num/num2);
    }

    private static void getSubtract(int num, int num2) {
        System.out.println(num-num2);
    }

    private static void getMiltiply(int num, int num2) {
        System.out.println(num*num2);
    }

    private static void getAdd(int num, int num2) {
        System.out.println(num +num2);
    }
}
