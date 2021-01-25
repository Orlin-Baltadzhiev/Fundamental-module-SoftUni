import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOfOperation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numberList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());;

                String input = scan.nextLine();
                while(!"End".equals(input)){
                    String[] command = input.split(" ");

                    switch (command[0]){
                        case "Add":
                            int numberToAddAtLastIndex= Integer.parseInt(command[1]);
                            numberList.add(numberToAddAtLastIndex);
                            break;
                        case "Insert":
                            int numberToInsert = Integer.parseInt(command[1]);
                            int index = Integer.parseInt(command[2]);
                            if (index>=0 && index<=numberList.size()){
                                numberList.add(index, numberToInsert);
                            } else {
                                System.out.println("Invalid index");
                            }
                            break;
                        case "Remove":
                            int indexToRemove = Integer.parseInt(command[1]);
                            if (indexToRemove>=0 && indexToRemove<=numberList.size()) {
                                numberList.remove(indexToRemove);
                            } else {
                                System.out.println("Invalid index");
                            }
                            break;
                        case "Shift":
                            if (command[1].equals("left")){

                                int count = Integer.parseInt(command[2]);
                                getTheShift(numberList,count);
                        } else if(command[1].equals("right")) {
                                int countRight= Integer.parseInt(command[2]);
                                getTheShiftRight(numberList,countRight);

                        }
                            break;
                    }
                    input=scan.nextLine();
                }
        for (Integer integer : numberList) {
            System.out.print(integer + " ");

        }
    }

    private static void getTheShiftRight(List<Integer> numberList, int countRight) {

        for (int i = 0; i < countRight; i++) {
            int temporary = numberList.get(numberList.size()-1);
            for (int j = numberList.size()-1; j >0 ; j--) {
                numberList.set(j,numberList.get(j-1));

            }
            numberList.set(0,temporary);
        }
    }

    private static void getTheShift(List<Integer> numberList, int count) {

        for (int i = 0; i <count ; i++) {
            int temporary = numberList.get(0);
            for (int j = 0; j <numberList.size()-1 ; j++) {
                numberList.set(j,numberList.get(j+1));

            }
            numberList.set(numberList.size()-1,temporary);

        }
    }
}
