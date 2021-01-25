package Article2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(", ");
        int num = Integer.parseInt(scan.nextLine());;
        for (int i = 0; i < num; i++) {
            String[] command =scan.nextLine().split(": ");
            switch (command[0]){
                case "Edit":
                    break;
                case "ChangeAuthor":
                    break;
                case "Rename":
                    break;


            }
        }
    }
}
