import java.util.Scanner;

public class GreaterofTwoValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        String input = "";

        if (command.equals("int")) {
            int num = Integer.parseInt(scan.nextLine());
            int num2 = Integer.parseInt(scan.nextLine());
            int result = getMax(num, num2);
            System.out.println(result);
        } else if (command.equals("char")) {
            char a = scan.nextLine().charAt(0);
            char b = scan.nextLine().charAt(0);
            getMax(a, b);
        } else if (command.equals("String".toLowerCase())) {
            input = scan.nextLine();
            String input2 = scan.nextLine();
            String resultString = getMax(input, input2);
            System.out.println(resultString);
        }
    }



     static String getMax(String input, String input2) {

        if (input.compareTo(input2)>=0) {
            return input;
        }else {
            return input2;
        }
        }

     static void getMax (char a, char b) {

        if (a>b) {
            System.out.println(a);
            return;
        }
            System.out.println(b);
     }


    static int getMax(int num, int num2) {

        if (num > num2) {
         return num;
        }
        return num2;
    }
}
