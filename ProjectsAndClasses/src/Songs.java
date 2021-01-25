import java.util.Scanner;

public class Songs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i <n; i++) {
            String[] data = scan.nextLine().split("_");

            String type = data[0];
            String name = data[1];
            String time = data[2];
        }
    }
    public class Song{
        private String typeList;
        private String name;
        private String time;

    }
}
