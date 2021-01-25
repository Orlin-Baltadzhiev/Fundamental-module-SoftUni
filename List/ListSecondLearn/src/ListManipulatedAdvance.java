import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulatedAdvance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> listNumbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String s = scan.nextLine();
        int sumOfAllNums = 0;
        while (!s.equals("end")) {
            String[] command = s.split(" ");

            switch (command[0]) {
                case "Contains":
                    int containsNumber = Integer.parseInt(command[1]);
                    if (listNumbers.contains(containsNumber)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String evenOrodd = command[1];
                    if (evenOrodd.equals("even")) {
                        for (int i = 0; i < listNumbers.size(); i++) {
                            if (listNumbers.get(i) % 2 == 0) {
                                System.out.print(listNumbers.get(i) + " ");
                            }
//                            if (i==listNumbers.size()-1){
//                                System.out.println();
//                            }
                        }

                    } else if (evenOrodd.equals("odd")) {
                        for (int i = 0; i < listNumbers.size(); i++) {
                            if (listNumbers.get(i) % 2 != 0) {
                                System.out.print(listNumbers.get(i) + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                case "Get":
                    for (int i = 0; i < listNumbers.size(); i++) {
                        sumOfAllNums += listNumbers.get(i);
                    }
                    System.out.println(sumOfAllNums);

                    break;
                case "Filter":
                    int numberToFilter = Integer.parseInt(command[2]);
                    if (command[1].equals(">")) {
                        for (int i = 0; i < listNumbers.size(); i++) {
                            if  (listNumbers.get(i)>numberToFilter) {
                                System.out.print(listNumbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }

                    if (command[1].equals(">=")) {
                        for (int i = 0; i < listNumbers.size(); i++) {
                            if (listNumbers.get(i)>=numberToFilter) {
                                System.out.print(listNumbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    if (command[1].equals("<")) {
                        for (int i = 0; i < listNumbers.size(); i++) {
                            if (listNumbers.get(i)<numberToFilter) {
                                System.out.print(listNumbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    if (command[1].equals("<=")) {
                        for (int i = 0; i < listNumbers.size(); i++) {
                            if (listNumbers.get(i)<=numberToFilter) {
                                System.out.print(listNumbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
            }


            s = scan.nextLine();
        }
    }
}
