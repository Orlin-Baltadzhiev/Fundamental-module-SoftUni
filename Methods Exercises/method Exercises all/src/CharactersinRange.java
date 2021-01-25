import java.util.Scanner;

public class CharactersinRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char startSymbol = scan.nextLine().charAt(0);
        char endSymbol = scan.nextLine().charAt(0);

        pritnTheSymbilsBetweenCharacters(startSymbol, endSymbol);

    }

    private static void pritnTheSymbilsBetweenCharacters(char a, char b) {

        for (int i = Math.min(a,b)+1; i < Math.max(a,b); i++) {
            System.out.print(String.format("%c ",i));
        }
    }
}
