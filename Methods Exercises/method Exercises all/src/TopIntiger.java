import java.util.Scanner;

public class TopIntiger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int sumDigit=0;
        for (int i = 1; i <=num ; i++) {
            int number = i;
            boolean isDigitodd =false;
            sumDigit=0;
            while(number>0){

                int lastDigit = number%10;
                if (lastDigit%2!=0){
                    isDigitodd=true;
                }
                sumDigit+=lastDigit;
                number=number/10;

            }
            if(isDigitodd && sumDigit%8==0){
                System.out.println(i);
            }
            
        }
    }
}
