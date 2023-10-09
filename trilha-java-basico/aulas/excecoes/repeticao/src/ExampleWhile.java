import java.util.concurrent.ThreadLocalRandom;
public class ExampleWhile {
    public static void main(String[] args) {
        double allowance = 50.0;

            while (allowance > 0) {
                double candyValue = valueRandom();

                if (candyValue > allowance)
                    candyValue = allowance;
                System.out.println("Candy's value: " + candyValue + "add to cart");
                allowance = allowance - candyValue;
            }
        System.out.println("Allowance: " + allowance);
        System.out.println("John spent all his allowance in candies");
    }

    private static double valueRandom() {
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
