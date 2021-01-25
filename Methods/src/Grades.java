import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = Double.parseDouble(scan.nextLine());

        getPrintGrade(num);
    }

    private static void getPrintGrade(double currentNum) {
        if(currentNum>=2.00 && currentNum<3){
            System.out.println("Fail");
        }
        else if(currentNum>=3.00 && currentNum<3.50){
            System.out.println("Poor");
        }
        else if(currentNum>=3.50 && currentNum<4.50){
            System.out.println("Good");
        }
        else if(currentNum>=4.50 && currentNum<5.50){
            System.out.println("Very good");
        }
        else if(currentNum>=5.50 && currentNum<=6){
            System.out.println("Excellent");
        }

    }
}
