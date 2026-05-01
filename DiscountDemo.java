@FunctionalInterface
interface DiscountCalculator {

    double calculate(double x);

}


public class DiscountDemo {
    public static void main(String[] args) {
        DiscountCalculator discount10 = (x) -> x * 0.9;
        DiscountCalculator discount25 = (x) -> x * 0.75;

        double price = 100;

        System.out.println("10% discount: " + discount10.calculate(price));
        System.out.println("25% discount: " + discount25.calculate(price));

    }
}
