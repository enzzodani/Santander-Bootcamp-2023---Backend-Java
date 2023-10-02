public class ATM {
    public static void main(String[] args) {
        double balance = 25.0;
        double requestValue = 17.0;

        if (requestValue < balance) {
            balance = balance - requestValue;
            System.out.println("New balance: $ " + balance);
        }
        else {
            System.out.println("No money");
        }
    }
}
