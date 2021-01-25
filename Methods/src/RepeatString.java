import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int num = Integer.parseInt(scan.nextLine());

        String result = getPrint(input,num);
        System.out.println(result);
    }

    private static String getPrint(String input, int num) {
        String saveInput = "";
        for (int i = 0; i <num ; i++) {
            saveInput +=input;

        }
        return saveInput;
    }
}
