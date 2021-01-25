import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       List<Integer> num= Arrays.stream(scan.nextLine().split("\\s+"))
                .map(e -> Integer.parseInt(e))
                .sorted((n1,n2) -> n2.compareTo(n1))
                .limit(3)
               .collect(Collectors.toList());

        for (Integer integer : num) {
            System.out.print(integer+ " ");
        }


    }
}
