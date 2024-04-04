import java.util.ArrayList;
import java.util.Scanner;

public class CheckOut
{
    // main method
    public static void main(String[] args)
    {
        // creating scanner object
        Scanner pipe = new Scanner(System.in);
        // prompting strings
        String prompt1 = "Enter price of the item [.50 cents to $10 dollars] : ";
        String prompt2 = "Do you want to enter another price> (Y/N) : ";

        // arraylist for storing prices
        ArrayList<Double> prices = new ArrayList<>();
        double price, totalPrice = 0.0;

        // taking price from user until user wants to quit by calling created methods
        do {
            price = getRangedDouble(pipe, prompt1, 0.005, 10);
            prices.add(price);
            totalPrice += price;
        }while (getYNConfirm(pipe, prompt2));

        // printing stored prices
        System.out.println("\nItem\t Price");
        for (int i=0;i<prices.size();i++)
            System.out.printf("  %-2d \t $%.2f\n",i+1,prices.get(i));

        // printing total and average cost
        System.out.printf("\nTotal cost of the items : $%.2f\n", totalPrice);
        System.out.printf("Average cost : $%.2f\n", totalPrice/prices.size());
    }

    // getRangedDouble method
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double val = 0;
        do
        {
            //Printing prompt
            System.out.print(prompt);

            if(pipe.hasNext())
            {
                //Reading value
                val = pipe.nextDouble();
            }

            //Reading trash
            pipe.nextLine();
        }while(val<low || val>high);

        return val;
    }

    // getYNConfirm method
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        boolean choice;
        char ch;

        do {
            // prompting user
            System.out.print(prompt);
            ch = pipe.next().charAt(0);

        } while (ch != 'Y' && ch != 'y' && ch != 'N' && ch != 'n');

        // if ch is Y or y then choice is true else false
        choice = ch == 'Y' || ch == 'y';

        return choice;
    }
}