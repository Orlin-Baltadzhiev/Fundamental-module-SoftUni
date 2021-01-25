import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<String> namesList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");
            String name = input[0];
            if (input[2].equals("going!")) {
                if (namesList.contains(name)){
                    System.out.println(name + " is already in the list!");
                } else {
                    namesList.add(name);
                }
            } else if (input[2].equals("not")) {
                if (namesList.contains(name)) {
                    namesList.remove(name);
                } else {
                    System.out.println(name + " is not in the list!");
                }
            }

        }
        for (String s : namesList) {
            System.out.println(s);

        }
    }
}
