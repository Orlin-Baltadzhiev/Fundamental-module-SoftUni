import java.util.*;
import java.util.stream.Collectors;

public class MargeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> left = readList(scan);
        List<Integer> right = readList(scan);

        List<Integer> result = new ArrayList<>();
         //3 5 2 43 12 3 54 10 23
        //76 5 34 2 4 12
        int i = 0;
        while (i < left.size() && i < right.size()) {
            result.add(left.get(i));
            result.add(right.get(i));

            i++;
        }
        if (i < left.size()) {
          result.addAll(getLeftovers(left,i));
        } else if (i < right.size()) {
            result.addAll(getLeftovers(right,i));
        }
        for (Integer number : result) {
            System.out.print(number + " ");
        }
    }

    private static List<Integer> getLeftovers(List<Integer> left, int afterIndex) {
        List<Integer> result = new ArrayList<>();

        for (int i = afterIndex; i <left.size() ; i++) {
            result.add(left.get(i));

        }
        return result;
    }

//    private static void getAddLeftOvers(List<Integer> left, List<Integer> result, int afterIndex) {
//        for (int j = afterIndex; j < left.size(); j++) {
//            result.add(left.get(j));
//        }
//    }


    private static List<Integer> readList(Scanner scan) {
        String[] split = scan.nextLine().split(" ");
        return Arrays.stream(split).map(Integer::parseInt).collect(Collectors.toList());
    }

}
