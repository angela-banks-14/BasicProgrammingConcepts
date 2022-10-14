import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        // fields
        int userChoice;
        int computerChoice;
        int tie = 0;
        int userWins = 0;
        int computerWins = 0;

        // initialize scanner and random generator
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int random = rand.nextInt(100);

        // ask user how many rounds they want to play
        System.out.println("How many rounds would you like to play? (1-10) ");
        int numOfRounds = scan.nextInt();

        if (numOfRounds < 0 || numOfRounds > 10) {
            System.out.println("Error: Invalid input. Number must be between 1-10.");
            System.exit(0);
        }

        // outcomes for the game
        while (numOfRounds > 0) {
            computerChoice = random % 3;

            // ask user for choice
            System.out.println("Pick your choice: 1 = Rock, 2 = Paper, or 3 = Scissors ");
            userChoice = scan.nextInt();

            if ((computerChoice == 1 && userChoice == 3) || (computerChoice == 2 && userChoice == 1) || (computerChoice == 3 && userChoice == 2)) {
                System.out.println("Computer wins!");
                computerWins++;
            } else if ((computerChoice == 1 && userChoice == 1) || (computerChoice == 2 && userChoice == 2) || (computerChoice == 3 && userChoice == 3)) {
                System.out.println("It's a tie!");
                tie++;
            } else {
                System.out.println("You win!");
                userWins++;
            }
            // decrement numOfRounds so game can end and tally up score
            numOfRounds--;
        }

        // displaying results
        System.out.println("Number of ties: " + tie);
        System.out.println("User wins: " + userWins);
        System.out.println("Computer Wins: " + computerWins);

        if (userWins > computerWins) {
            System.out.println("Winner of the round: User");
        } else if (computerWins > userWins) {
            System.out.println("Winner of the round: Computer");
        } else {
            System.out.println("It was a tie!");
        }

        // ask user if they want to play again
        System.out.println("Do you want to play again? 1 = Yes or 2 = No");
        int choice = scan.nextInt();
        if (choice == 1) {
            main(null);
        } else {
            System.out.println("Thanks for playing!");
        }
    }
}
