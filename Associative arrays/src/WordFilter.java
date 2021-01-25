import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] words = Arrays.stream(scan.nextLine().split("\\s+"))
                .filter(w -> w.length()%2 == 0)
                .toArray(String[]::new);


            System.out.printf(String.join(" %n" ,words));



    }
}
