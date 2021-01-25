import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Collections;

public class listManipulationBasics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] parts = scan.nextLine().split(" ");
        List<Integer> numbers= Arrays.stream(parts).map(Integer::parseInt).collect(Collectors.toList());

        while(true){
            String line =scan.nextLine();
            if (line.equals("end")){
                break;
            }
            String[] tokens = line.split(" ");

            switch (tokens[0]){
                case "Add":
                    int numberToAdd = Integer.parseInt(tokens[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(tokens[1]);
                    numbers.remove(Integer.valueOf(numberToRemove));
                    break;
                case "RemoveAt":
                    int numberToRemoveAt=Integer.parseInt(tokens[1]);
                    numbers.remove(numberToRemoveAt);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(tokens[1]);
                    int indexToInsert = Integer.parseInt(tokens[2]);
                    numbers.add(indexToInsert, numberToInsert);
                    break;
            }
        }
        for (Integer ssss : numbers) {

            System.out.print(ssss + " ");
            
        }




    }


}
