public class CtoFTableDisplay {
    public static void main(String[] args) {
        System.out.println("Celsius\tFahrenheit");
        for (double c = -100; c <= 100; c++) {
            System.out.printf("%7.2f\t%10.2f%n", c, CtoF(c));
        }
    }

    public static double CtoF(double Celsius) {
        return (Celsius * 9 / 5) + 32;
    }
}