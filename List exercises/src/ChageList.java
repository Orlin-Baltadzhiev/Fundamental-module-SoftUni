import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChageList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> elements = Arrays.stream(scan.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String line;
        while (!"end".equals(line = scan.nextLine())) {
            String[] tokens = line.split("\\s+");
            String command = tokens[0];

            switch (command) {
                case "Delete":
                    String element = (tokens[1]);
                    while (elements.contains(element)) {
                        elements.remove(element);
                    }
                    break;
                case "Insert":
                    element = tokens[1];
                    int position = Integer.parseInt(tokens[2]);
                    if (0 <= position && position < elements.size()) {

                        elements.add(position, element);
                    }
                    break;

            }
        }
        System.out.println(elements.toString()
                .replaceAll("[\\[\\],]", ""));
    }
}
