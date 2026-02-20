package oscar.leapmonth;
import java.util.Scanner;

public class leapmonth {

    // Variable declarations
    int month;
    boolean isLeapMonth;

    // Constructor to initialize the month
    public leapmonth(int month) {
        this.month = month;
        this.isLeapMonth = false;
    }

    // Method to check if the month is a leap month
    public void checkLeapMonth() {

        // Boolean expressions as given in the question
        isLeapMonth = (month % 4 == 0);
        isLeapMonth = isLeapMonth && (month % 100 != 0);
        isLeapMonth = isLeapMonth || (month % 400 == 0);

        // Output the result
        if (isLeapMonth) {
            System.out.println(month + " is a Leap Month.");
        } else {
            System.out.println(month + " is NOT a Leap Month.");
        }
    }

    // Main method - entry point of the program
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a month
        System.out.print("Enter a month to check: ");
        int inputMonth = scanner.nextInt();

        // Create an object of leapmonth class
        leapmonth lm = new leapmonth(inputMonth);

        // Call the method to check and display result
        lm.checkLeapMonth();

        // Close the scanner
        scanner.close();
    }
}