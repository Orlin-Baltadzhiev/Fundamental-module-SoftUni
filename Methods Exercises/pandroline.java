import java.util.Scanner;

public class pandroline {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String number = scan.nextLine();
        while (!number.equals("END")) {


            if (reverse(number)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            number = scan.nextLine();
        }

    }
    public static boolean reverse (String word){
        String reverse="";
        char   reversedNuumber = '\n';
        for (int i =word.length()-1; i>=0 ; i--) {
            reversedNuumber = word.charAt(i);
            reverse +=reversedNuumber;
        }
        if (reverse.equals(word)){
            return  true;
        } else {
            return  false;
        }
    }
}