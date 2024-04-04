import java.util.Scanner;

public class BirthDateTime {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int year = getRangedInt(console, "Enter the birth year", 1950, 2015);
        int month = getRangedInt(console, "Enter the birth month", 1, 12);

        // Use a switch statement to limit the days based on the month
        int day = 0;
        switch (month) {
            case 2: // February
                day = getRangedInt(console, "Enter the birth day", 1, 29);
                break;
            case 4: case 6: case 9: case 11: // April, June, September, November
                day = getRangedInt(console, "Enter the birth day", 1, 30);
                break;
            default: // All other months
                day = getRangedInt(console, "Enter the birth day", 1, 31);
                break;
        }

        int hours = getRangedInt(console, "Enter the birth hour", 1, 24);
        int minutes = getRangedInt(console, "Enter the birth minute", 1, 59);

        console.close();

        // Assuming you would do something with these values,
        // perhaps creating a Date object or similar.
        System.out.println("Birthdate: " + year + "-" + month + "-" + day + " " + hours + ":" + minutes);
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int input = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                input = pipe.nextInt();
                if (input >= low && input <= high) {
                    isValid = true;
                } else {
                    System.out.println("Please enter a number between " + low + " and " + high + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                pipe.next(); // Read and discard the invalid input (i.e., "clear the pipe")
            }
        }
        return input;
    }
}
