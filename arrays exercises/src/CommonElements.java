import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] firsOutput = scan.nextLine().split(" ");
        String[] secondOutput = scan.nextLine().split(" ");

        for (int i = 0; i < secondOutput.length; i++) {
            for (int j = 0; j <firsOutput.length; j++) {


                if (secondOutput[i].equals(firsOutput[j])){
                    System.out.print(firsOutput[j]+ " ");
                }
            }
        }
    }
}
