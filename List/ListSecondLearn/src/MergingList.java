import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputNumbers=scan.nextLine();
        List<String> numbers = Arrays.stream(inputNumbers.split(" "))
                .collect(Collectors.toList());
        String inputNumbers2 = scan.nextLine();
        List<String>numbers2=Arrays.stream((inputNumbers2.split(" ")))
                .collect(Collectors.toList());

        List<String>resultList =new ArrayList<>();
     int i =0;
    while(i<numbers.size()&& i<numbers2.size()){
        resultList.add(numbers.get(i));
        resultList.add(numbers2.get(i));

        i++;
    }
    if (i<numbers.size()){
        for (int j = i; j <numbers.size() ; j++) {
            resultList.add(numbers.get(j));

        }
    } else if (i < numbers2.size()) {
        for (int j = i; j <numbers2.size() ; j++) {
            resultList.add(numbers2.get(j));
        }
    }
        for (String s : resultList) {
            System.out.print(s + " ");
        }

    }
}
