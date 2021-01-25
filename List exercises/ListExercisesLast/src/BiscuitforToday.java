import java.util.Scanner;

public class BiscuitforToday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int biscuitForDay = Integer.parseInt(scan.nextLine());
        int workers = Integer.parseInt(scan.nextLine());
        int otherFactory = Integer.parseInt(scan.nextLine());

        int myFactori=0;

        for (int i = 0; i <30 ; i++) {
            if(i%3==0){
                myFactori+= (0.75*biscuitForDay*workers);
            } else {
                myFactori+= (biscuitForDay*workers);

            }
            //Chill_out
        }
        if (myFactori>otherFactory){
            double   result = myFactori-otherFactory;
            double percentage = (result/otherFactory)*100;
            System.out.printf("You have produced %d biscuits for the past month.%n",myFactori);
            System.out.printf("You produce %.2f percent more biscuits.",percentage);
        } else if (myFactori<otherFactory){
            double otherResult = otherFactory-myFactori;
            double otherPercentage=(otherResult/otherFactory)*100;
            System.out.printf("You have produced %d biscuits for the past month.%n",myFactori);
            System.out.printf("You produce %.2f percent less biscuits.", otherPercentage);
        }
    }
}
