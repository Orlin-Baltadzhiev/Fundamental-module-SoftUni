import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumberNew {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> bombInfo = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int bombNumber = bombInfo.get(0);
        int power = bombInfo.get(1);

        while (numberList.contains(bombNumber)){
            int position = numberList.indexOf(bombNumber);

            int leftBound = Math.max(0,position-power);
            int rightBound=Math.min((numberList.size()-1),position+power);

            for (int i = rightBound; i >=leftBound ; i--) {
                numberList.remove(i);

            }

        }
        int sum = 0;
        for (Integer integer : numberList) {
            sum +=integer;

        }
        System.out.println(sum);


    }
}
