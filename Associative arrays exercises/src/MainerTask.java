import java.util.LinkedHashMap;
import java.util.Scanner;

public class MainerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = "";
        LinkedHashMap<String, Integer> resources = new LinkedHashMap<>();

        while (!"stop".equals(input = scan.nextLine())) {
            int count = Integer.parseInt(scan.nextLine());

            resources.putIfAbsent(input, 0);
            int oldCount = resources.get(input);
            resources.put(input, oldCount + count);
        }
        resources
                .forEach((k,v) -> System.out.println(String.format("%s -> %d",k,v)));
    }
}
