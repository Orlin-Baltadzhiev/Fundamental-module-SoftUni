import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");

            if (command[0].equals("Add")) {
                int pasingerToAdd = Integer.parseInt(command[1]);
                wagons.add(pasingerToAdd);
            } else {
                int passinger = Integer.parseInt(command[0]);

                for (int i = 0; i < wagons.size(); i++) {

                    int futureNumber = passinger + wagons.get(i);
                    if (futureNumber <= maxCapacity) {
                        wagons.set(i, futureNumber);
                        break;
                    }
                }
            }
            input =scan.nextLine();
        }
        for (Integer wagon : wagons) {
            System.out.print(String.format("%d ",wagon));
            
        }
    }
}
