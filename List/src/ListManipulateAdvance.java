import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulateAdvance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String[] parts = scan.nextLine().split(" ");
        List<Integer> listNumbers = Arrays.stream(parts).map(Integer::parseInt).collect(Collectors.toList());

        while (true) {
            String line = scan.nextLine();

            if (line.equals("end")) {
                break;
            }
            String[] tokens = line.split(" ");

            switch (tokens[0]) {
                case "Contains":
                    int containsNumber = Integer.parseInt(tokens[1]);
                    if (listNumbers.contains(containsNumber)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    int output = 0;
                    if (tokens[1].equals("even")) {
                        for (int i = 0; i < listNumbers.size(); i++) {
                            if (listNumbers.get(i) % 2 == 0) {
                                System.out.print(listNumbers.get(i) + " ");
                            }
                        }
                    } else if (tokens[1].equals("odd")) {
                        for (int i = 0; i < listNumbers.size(); i++) {
                            if (listNumbers.get(i) % 2 != 0) {
                                System.out.print(listNumbers.get(i) + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;

                case "Get":
                    int sum = 0;
                    for (Integer number : listNumbers) {
                        sum += number;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String outputFilter = "";
                    int num = Integer.parseInt(tokens[2]);
                    if (tokens[1].equals(">")) {
                        for (Integer listNumber : listNumbers) {
                            if (listNumber > num) {
                                outputFilter += String.valueOf(listNumber) + " ";
                            }

                        }
                        System.out.println(outputFilter);
                    } else if (tokens[1].equals(">=")) {
                        for (Integer listNumber : listNumbers) {
                            if (listNumber >= num) {
                                outputFilter += String.valueOf(listNumber) + " ";
                            }

                        }
                        System.out.println(outputFilter);
                    } else if (tokens[1].equals("<")) {
                        for (Integer listNumber : listNumbers) {
                            if (listNumber < num) {
                                outputFilter += String.valueOf(listNumber) + " ";
                            }
                        }
                        System.out.println(outputFilter);
                    } else if (tokens[1].equals("<=")) {
                        for (Integer listNumber : listNumbers) {
                            if (listNumber <= num) {
                                outputFilter += String.valueOf(listNumber) + " ";
                            }
                        }
                        System.out.println(outputFilter);
                    }
                    break;
            }
        }
    }
}
