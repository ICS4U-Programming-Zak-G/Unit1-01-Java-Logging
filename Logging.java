// Import scanner class to get input.
import java.util.Scanner;

/** .
* This program says how many of a certain log can fit on a truck.
*
* @author  Zak Goneau
* @version 1.0
* @since   2025-02-14
*/

// Creating class
public final class Logging {
    /**
     * This is a private constructor used to satisfy the style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private Logging() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */

    public static void main(final String[] args) {

        // Declare constants
        final float MAX_WEIGHT = 1100f;
        final float QUARTER_LENGTH = 0.25f;
        final float HALF_LENGTH = 0.5f;
        final float FULL_LENGTH = 1f;
        final float WEIGHT_PER_METER = 20f;

        // Welcome and get user input
        System.out.print("This program says how many of a certain");
        System.out.println(" log can fit on a truck");
        System.out.println("Enter a log size: 0.25, 0.5, 1 (m): ");

        // Using scanner to get user input
        final Scanner scanner = new Scanner(System.in);
        final String lengthString = scanner.nextLine();

        // Try to convert users input
        try {

            // Convert string to float // final float ...
            float lengthFloat = Float.parseFloat(lengthString);

            // Check if input is one of the lengths
            if (lengthFloat == QUARTER_LENGTH || lengthFloat == HALF_LENGTH
                || lengthFloat == FULL_LENGTH) {

                // Check if length is 0.25
                if (lengthFloat == QUARTER_LENGTH) {
                    // Calculate total logs for 0.25m
                    final double totalLogs = MAX_WEIGHT
                        / (WEIGHT_PER_METER * QUARTER_LENGTH);

                    // Print result to user
                    System.out.print("The total amount of 0.25m logs is: ");
                    System.out.println(totalLogs);

                    // Check if length is 0.5m
                } else if (lengthFloat == HALF_LENGTH) {
                    // Calculate total logs for 0.5m
                    final double totalLogs = MAX_WEIGHT
                        / (WEIGHT_PER_METER * HALF_LENGTH);

                    // Print result to user
                    System.out.print("The total amount of 0.5m logs is: ");
                    System.out.println(totalLogs);

                    // Otherwise length is 1m
                } else {
                    // Calculate total logs for 1m
                    final double totalLogs = MAX_WEIGHT / WEIGHT_PER_METER;

                    // Print result to user
                    System.out.print("The total amount of 1m logs is: ");
                    System.out.println(totalLogs);
                }

            } else {
                // If wrong length, tell user
                System.out.println(lengthFloat + " is not a valid length.");
            }

            // Catch invalid inputs and tell user
        } catch (NumberFormatException error) {
            System.out.println("Please enter a valid input. "
                    + error.getMessage());
        }

        // Close scanner
        scanner.close();
    }
}
