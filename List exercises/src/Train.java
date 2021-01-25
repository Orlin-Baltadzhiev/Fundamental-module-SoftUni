import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        List<Integer> wagons = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            wagons.add(Integer.parseInt(input[i]));
        }

        int capacity = Integer.parseInt(scan.nextLine());
        String line ;

        while (!"end".equals(line = scan.nextLine())) {
            String[] tokens=line.split(" ");

            if (tokens[0].equals("Add")){
                int passengers = Integer.parseInt(tokens[1]);
                wagons.add(passengers);
            } else {
                int passengers = Integer.parseInt(tokens[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    int futureNumber= wagons.get(i) + passengers;
                    if (futureNumber<=capacity){
                        wagons.set(i, futureNumber);
                        break;
                    }
                }

            }
        }
        printList(wagons);

    }

         static void printList(List<Integer> wagons) {
             for (int i = 0; i < wagons.size(); i++) {
                 System.out.print(wagons.get(i)+ " ");
             }
    }
}
