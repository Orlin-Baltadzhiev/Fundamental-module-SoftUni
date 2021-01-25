import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arrays = scan.nextLine().split("\\|");


        String result="";
        for (int i = arrays.length-1; i>=0 ; i--) {
            String[] realArray=arrays[i].split("\\s+");
            for (int j = 0; j <realArray.length ; j++) {
                if (!realArray[j].equals(""))
                result+=realArray[j]+" ";

            }
        }
        System.out.println(result.trim());

    }
}
