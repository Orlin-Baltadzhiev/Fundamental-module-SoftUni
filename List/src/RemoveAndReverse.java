import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveAndReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

     String[] parts = scan.nextLine().split(" ");

        List<Integer> numbers= Arrays.stream(parts)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int counter = 0;
        for (int i = 0; i <numbers.size() ; i++) {

            if (numbers.get(i)<0){

            numbers.remove(i);
            i--;
            }
        }
        Collections.reverse(numbers);
        if (numbers.isEmpty()){
            System.out.println("empty");
        }
        printList(numbers);
    }
    private static void printList(List<Integer> lines){
        for (Integer item : lines) {
            System.out.print(item + " ");
        }
    }
}
