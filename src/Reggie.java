import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ssn = SafeInput.getRegExString(scanner, "Enter a valid SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        String studentNumber = SafeInput.getRegExString(scanner, "Enter a UC Student M number", "^(M|m)\\d{5}$");
        String menuChoice = SafeInput.getRegExString(scanner, "Enter your menu choice [OoSsVvQq]", "^[OoSsVvQq]$");

        System.out.println("Your SSN: " + ssn);
        System.out.println("Your Student Number: " + studentNumber);
        System.out.println("Your Menu Choice: " + menuChoice);
    }
}