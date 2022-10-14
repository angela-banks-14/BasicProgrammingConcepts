import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

    public static void main(String[] args) {

        // initialize random generator
        Random rand = new Random();

        // create array of dog breeds
        String[] dogBreeds = new String[] {"German Shepherd", "Siberian Husky", "Standard Poodle", "French Bulldog", "Labrador Retriever"};

        // generate
        int a = rand.nextInt(101);
        int b = rand.nextInt(101 - a);
        int c = rand.nextInt(101 - a - b);
        int d = rand.nextInt(101 - a - b - c);
        int e = 100 - a - b - c - d;

        // create array for percentages
        int[] randPercentages = {a, b, c, d, e};

        // initialize scanner and prompt user for dog's name
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your dog's name? ");
        String userInput = scan.nextLine();

        // print out info for user
        System.out.println("Well then, I have a highly reliable report on " + userInput + "'s prestigious background right here.\n");
        System.out.println(userInput + " is:\n");

        // iterate through dogBreeds array and assign random percentage to each breed
        for (int i = 0; i < 5; i++) {
            System.out.println(randPercentages[i] + "% " + dogBreeds[i]);
        }
        System.out.println("\nWow, that's QUITE the dog!");
    }
}
