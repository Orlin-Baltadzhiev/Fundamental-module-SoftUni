import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<Integer> list = Arrays.stream(input.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command =scan.nextLine();
        while(!command.equals("end")){ // da proverq komandata
            String[] tokens =command.split(" ");

            switch (tokens[0]){
                case "Add":
                    int numToadd=Integer.parseInt(tokens[1]);
                    list.add(numToadd);
                    break;
                case "Remove":
                    int numToRemove= Integer.parseInt(tokens[1]);
                    list.remove(Integer.valueOf(numToRemove));
                    break;
                case "RemoveAt":
                    int removeAt= Integer.parseInt(tokens[1]);
                    list.remove(removeAt);
                    break;
                case "Insert":
                    int index = Integer.parseInt(tokens[1]);
                    int numToInsert=Integer.parseInt(tokens[2]);
                    list.add(numToInsert,index);
                    break;
            }

            command =scan.nextLine();
        }
        for (Integer integer : list) {
            System.out.print(integer+" ");

        }
    }
}
