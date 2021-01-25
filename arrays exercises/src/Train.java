import java.util.Arrays;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int[] people = new int[num];

        for (int i = 0; i < num; i++) {
            String input = scan.nextLine();
            people[i]=Integer.parseInt(input);
            sum+=people[i];

            }
        for (int i = 0; i <num ; i++) {
            System.out.print(people[i]+ " ");

        }
        System.out.println();
        System.out.println(sum);
        }

    }

