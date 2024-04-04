import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Testing getNonZeroLenString
        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("Your name is: " + name);

        // Testing getInt
        int age = SafeInput.getInt(in, "Enter your age");
        System.out.println("Your age is: " + age);

        // Testing getDouble
        double salary = SafeInput.getDouble(in, "Enter your salary");
        System.out.println("Your salary is: " + salary);

        // Testing getRangedInt
        int score = SafeInput.getRangedInt(in, "Enter your test score", 0, 100);
        System.out.println("Your test score is: " + score);

        // Testing getRangedDouble
        double temperature = SafeInput.getRangedDouble(in, "Enter the temperature", -50.0, 50.0);
        System.out.println("The temperature is: " + temperature);

        // Testing getYNConfirm
        boolean confirm = SafeInput.getYNConfirm(in, "Do you want to continue?");
        System.out.println("You have chosen: " + (confirm ? "Yes" : "No"));

        // Testing getRegExString


        in.close();
    }
}
