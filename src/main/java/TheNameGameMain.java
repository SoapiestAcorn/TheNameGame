import java.util.Scanner;

public class TheNameGameMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            boolean playerHasWon = isWinningName(scanner);

            if (playerHasWon) {
                System.out.println("You win!");
                break;
            } else {
                System.out.println("You lose!");
            }

            if (!playAgainPrompt(scanner)) {
                break;
            }
        }

        scanner.close();
    }

    private static boolean isWinningName(Scanner scanner) {
        System.out.println("What is your name?");
        String inputtedName = scanner.nextLine();
        return inputtedName.equalsIgnoreCase("Alex");
    }

    private static boolean playAgainPrompt(Scanner scanner) {
        System.out.println("Do you want to play again? (Y/N)");

        while (true) {
            String playAgainResponse = scanner.nextLine().toUpperCase();

            if (playAgainResponse.equals("Y")) {
                return true;
            } else if (playAgainResponse.equals("N")) {
                return false;
            } else {
                System.out.println("Invalid input. Please enter Y or N");
            }
        }

    }

}
