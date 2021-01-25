import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WeponSmith {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> list = Arrays.stream(scan.nextLine().split("\\|"))
                .collect(Collectors.toList());

        String input = "";
        while(!"Done".equals(input=scan.nextLine())){

            String[] command = input.split(" ");

            switch (command[0]){
                case "Move":
                    String side = command[1];
                    int indexToChange = Integer.parseInt(command[2]);
                    //proverka ako e po golqmo ot duljinata
                    if (indexToChange<list.size()-1 && indexToChange>=0) {

                        if (side.equals("Right")) {

                            //..ha|Do|mm|om|er   move right 0
                            String temporary = list.get(indexToChange + 1); //do
                            String wordToChange = list.get(indexToChange); //ha
                            list.set(indexToChange, temporary);
                            list.set(indexToChange + 1, wordToChange);

                        }
                    }
                    if(indexToChange>0 && indexToChange<list.size()-1) {


                        if (side.equals("Left")) { //prowerka ako po malko ot nula
                            String temporary = list.get(indexToChange - 1);
                            String wordToChange = list.get(indexToChange);
                            list.set(indexToChange, temporary);
                            list.set(indexToChange - 1, wordToChange);
                        }
                    }
                    break;
                case "Check":
                    String oddOrEven= command[1];
                    if (oddOrEven.equals("Even")){
                        getPrintEven(list);
                        System.out.println();
                    } else if (oddOrEven.equals("Odd")){
                        getPrintOdd(list);
                        System.out.println();
                    }
                    break;
            }


        }
        String result ="";
        for (int i = 0; i <list.size() ; i++) {

            result +=list.get(i);

        }
        System.out.printf("You crafted %s!",result);

    }

    private static void getPrintOdd(List<String> list) {
        for (int i = 0; i <list.size() ; i++) {
            if (i % 2 != 0){
                System.out.print(list.get(i) + " ");
            }
        }
    }

    private static void getPrintEven(List<String> list) {
        for (int i = 0; i <list.size() ; i++) {
            if (i%2==0){
                System.out.print(list.get(i) + " ");
            }
            
        }
    }
}
