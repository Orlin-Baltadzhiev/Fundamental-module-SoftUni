import java.lang.reflect.Array;
import java.rmi.UnexpectedException;
import java.util.Scanner;

public class DayofWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] dayOfWeeks ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        int n = scan.nextInt();
        int daysOF=n-1;

      if (daysOF>=0 && daysOF<=6){
          System.out.println(dayOfWeeks[daysOF]);
        } else {
          System.out.println("Invalid day!");
      }

    }
}
