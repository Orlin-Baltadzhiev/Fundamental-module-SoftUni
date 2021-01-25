import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeOfList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scan.nextLine();

        while (!"end".equals(input=scan.nextLine())){

            String[] command=input.split(" ");

            switch (command[0]){
                case "Insert":
                    int numToInsert =Integer.parseInt(command[1]);
                    int index = Integer.parseInt(command[2]);
                    if (index>=0 && index<=numberList.size())
                    numberList.add(index,numToInsert);
                    break;
                case "Delete":
                    int numToDelete = Integer.parseInt(command[1]);
                    while (numberList.contains(numToDelete))
                    numberList.remove(Integer.valueOf(numToDelete));
                    break;
            }
        }
        for (Integer integer : numberList) {
            System.out.print(String.format("%d ",integer));

        }

    }
}
