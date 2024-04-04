import java.util.Scanner;

public class SafeInput {
    // Part A: getNonZeroLenString
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String input;
        do {
            System.out.print(prompt + ": ");
            input = pipe.nextLine();
        } while (input.trim().isEmpty());
        return input;
    }

    // Part B: getInt
    public static int getInt(Scanner pipe, String prompt) {
        int input = 0;
        while (true) {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                input = pipe.nextInt();
                pipe.nextLine(); // clears the buffer
                break;
            } else {
                pipe.nextLine(); // clears the buffer
                System.out.println("Error: Please enter an integer.");
            }
        }
        return input;
    }

    // Part C: getDouble
    public static double getDouble(Scanner pipe, String prompt) {
        double input = 0;
        while (true) {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble()) {
                input = pipe.nextDouble();
                pipe.nextLine(); // clears the buffer
                break;
            } else {
                pipe.nextLine(); // clears the buffer
                System.out.println("Error: Please enter a double.");
            }
        }
        return input;
    }

    // Part D: getRangedInt
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int input;
        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            input = getInt(pipe, "");
        } while (input < low || input > high);
        return input;
    }

    // Part E: getRangedDouble
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double input;
        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            input = getDouble(pipe, "");
        } while (input < low || input > high);
        return input;
    }

    // Part F: getYNConfirm
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String input;
        do {
            System.out.print(prompt + " [Y/N]: ");
            input = pipe.nextLine().trim().toUpperCase();
        } while (!input.equals("Y") && !input.equals("N"));
        return input.equals("Y");
    }

    //Part G: getRegExString
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String input;
        System.out.print(prompt + ": ");
        input = pipe.nextLine();
        while (!input.matches(regEx)) {
            System.out.println("Invalid input!");
            System.out.print(prompt + ": ");
            input = pipe.nextLine();
        }
        return input;
    }

    //Part K: prettyHeader
    public static void prettyHeader(String msg) {
        int starCount = 60;
        int msgPadding = (starCount - msg.length() - 6) / 2;
        String stars = "*".repeat(starCount);
        String paddedMsg = "*".repeat(3) + " ".repeat(msgPadding) + msg + " ".repeat(msgPadding) + "*".repeat(3);

        System.out.println(stars);
        System.out.println(paddedMsg);
        System.out.println(stars);
    }
}




