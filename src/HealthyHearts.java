import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        // initialize scanner
        Scanner scan = new Scanner(System.in);
        // ask user their age
        System.out.print("What is your age? ");
        int userAge = scan.nextInt();

        // calculate max heart rate
        int maxHeartRate = 220 - userAge;

        // calculate target heart rate zone
        double lower = 0.50 * maxHeartRate;
        double upper = 0.85 * maxHeartRate;

        // print results
        System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute");
        System.out.println("Your target HR Zone is " + lower + " - " + upper + " beats per minute");
    }
}
