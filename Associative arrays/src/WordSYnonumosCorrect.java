import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordSYnonumosCorrect {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        Map<String, ArrayList<String>> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = scan.nextLine();
            String syn = scan.nextLine();

            map.putIfAbsent(word,new ArrayList<>());
            map.get(word).add(syn);

        }

        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(),String.join(", ",
                    entry.getValue()));
        }
    }
}
