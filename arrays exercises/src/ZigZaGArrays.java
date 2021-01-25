import java.util.Scanner;

public class ZigZaGArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        
        String[] firsArray = new String[num];
        String[] secondArray = new String[num];

        for (int i = 0; i <num ; i++) {
            String[] input = scan.nextLine().split(" ");


            if (i%2 ==0){
                firsArray[i]=input[0];
                secondArray[i]=input[1];
            } else {
                secondArray[i]=input[0];
                firsArray[i]=input[1];
            }
            
        }
        System.out.print(String.join(" ",firsArray));
        System.out.println();
        System.out.print(String.join(" ",secondArray));
    }
}
