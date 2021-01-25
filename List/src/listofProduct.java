import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class listofProduct {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<String> products = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String current = scan.nextLine();
            products.add(current);
        }
       // getPrintList(products);

        Collections.sort(products);



        for (int i = 0; i < products.size(); i++) {
            System.out.println((i +1)+"."+products.get(i));

        }
    }

//    private static void getPrintList(List<String> lines) {
//
//        for (String item : lines) {
//            System.out.println(item);
//        }
////        lines.add("printed");
//    }

}
