import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scan.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> bombInfo = Arrays.stream(scan.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int bombNumber = bombInfo.get(0);
        int power = bombInfo.get(1);

        while (list.contains(bombNumber)) {
            int bombPostion= list.indexOf(bombNumber);

            int leftBound = Math.max(0,bombPostion-power);
            int rightBound = Math.min((list.size()-1), bombPostion+power);
            for (int i = rightBound; i>=leftBound ; i--) {
                list.remove(i);
            }
        }
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum +=list.get(i);

        }
        System.out.println(sum);
       // int sum1 = list.stream().mapToInt(Integer::intValue).sum();
    }
}
