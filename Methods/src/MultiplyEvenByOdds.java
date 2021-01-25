import java.util.Scanner;

public class MultiplyEvenByOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        int evenSum =evenSumResult(num);
        int oddSum=oddSumResult(num);

        int result = evenSum*oddSum;
        System.out.println(result);
    }

    private static int oddSumResult(int num) {
        int sum = 0;
        num = Math.abs(num);
        while (num>0){
            int currentNum=num%10;
            if(currentNum%2 != 0){
                sum+=currentNum;
            }
            num=num/10;
        }
        return Math.abs(sum);
    }

    private static int evenSumResult(int num) {
        num = Math.abs(num);
        int sum =0;
        while(num>0){
            int currentNum= num%10;
            if(currentNum%2==0){
                sum+=currentNum;
            }
            num=num/10;

        }
        return Math.abs(sum);

    }
}
