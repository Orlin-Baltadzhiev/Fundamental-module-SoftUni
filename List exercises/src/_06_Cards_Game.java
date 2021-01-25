

import java.util.Arrays;
        import java.util.List;
        import java.util.Scanner;
        import java.util.stream.Collectors;

public class _06_Cards_Game {


    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> playerOne = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> playerTwo = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (playerOne.size() > 0 && playerTwo.size() > 0) {

            if (playerOne.get(0) > playerTwo.get(0))         // one is bigger
                compareCards(playerOne, playerTwo, playerOne.get(0).equals(playerTwo.get(0)));

            else if (playerOne.get(0) < playerTwo.get(0))    // two is bigger
                compareCards(playerTwo, playerOne, playerOne.get(0).equals(playerTwo.get(0)));

            else if (playerOne.get(0).equals(playerTwo.get(0))) { // same values
                compareCards(playerOne, playerTwo, true);

            }
        }

        if (playerOne.size() > 0)
            sumAndPrint(playerOne, "First");
        else if (playerTwo.size() > 0)
            sumAndPrint(playerTwo, "Second");
    }

    private static void sumAndPrint(List<Integer> playerWiner, String player) {
        int sum = 0;
        for (int element : playerWiner)
            sum += element;
        System.out.println(player + " player wins! Sum: " + sum);
    }

    private static void compareCards(List<Integer> winnerList, List<Integer> loserList, boolean isCardSame) {
        if (!isCardSame) winnerList.add(winnerList.get(0));
        if (!isCardSame) winnerList.add(loserList.get(0));
        winnerList.remove(0);
        loserList.remove(0);
    }
}
