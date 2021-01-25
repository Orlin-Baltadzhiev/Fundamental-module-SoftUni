import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOperation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }

        String line="";

        while (!"end".equals(line = scan.nextLine().toLowerCase())) {

            String[] tokens = line.split(" ");

            if (tokens[0].equals("add")) {
                int addNumber = Integer.parseInt(tokens[1]);
                numbers.add(numbers.size(), addNumber);

            }
            if (tokens[0].equals("insert")) {
                int insertNumber = Integer.parseInt(tokens[1]);
                int atIndex = Integer.parseInt(tokens[2]);
                if (atIndex >= 0 && atIndex < numbers.size()) {
                    numbers.add(atIndex, insertNumber);
                } else {
                    System.out.println("Invalid index");
                }

            }
            if (tokens[0].equals("remove")) {
                int removeAtIndex = Integer.parseInt(tokens[1]);
                if (removeAtIndex >= 0 && removeAtIndex < numbers.size()) {
                    numbers.remove(removeAtIndex);
                } else {
                    System.out.println("Invalid index");
                }


            }
            if (tokens[0].equalsIgnoreCase("shift")) {
                int count = Integer.parseInt(tokens[2]);
                if (tokens[1].equalsIgnoreCase("left")) {
                    getShiftLeft(numbers, count);
                } else {
                    getShiftRight(numbers, count);
                }
            }
        }
        for (Integer number : numbers) {
            System.out.printf("%d ", number);
        }
    }

    private static void getShiftRight(List<Integer> list, int count) {
        for (int rightStep = 0; rightStep < count; rightStep++) {
            int temp = list.get(list.size() - 1);
            for (int i = list.size() - 1; i > 0; i--) {
                list.set(i,list.get(i-1));
            }
            list.set(0,temp);
        }
    }

    private static void getShiftLeft(List<Integer> list, int count) {
        for (int shiftstep = 0; shiftstep < count; shiftstep++) {
            int temp = list.get(0);
            for (int i = 0; i < list.size() - 1; i++) {
                list.set(i, list.get(i + 1));
            }
            list.set(list.size() - 1, temp);
        }
    }
}
