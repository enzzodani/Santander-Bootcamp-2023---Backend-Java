import java.util.InputMismatchException;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {
//        Create Scanner object
            Scanner scanner = new Scanner(System.in);

            System.out.println("Write your name: ");
            String name = scanner.next();

            System.out.println("Write your last name: ");
            String lastName = scanner.next();

            System.out.println("Write your age: ");
            int age = scanner.nextInt();

            System.out.println("Write your height: ");
            double height = scanner.nextDouble();

//        Print data
            System.out.println("Hello, my name is " + name.toUpperCase() + " " + lastName.toUpperCase());
            System.out.println("I have " + age + " years old");
            System.out.println("My height is " + height + " m");
            scanner.close();
        }
        catch (InputMismatchException e) {
            System.out.println("Age and Height was completed incorrectly");
            System.out.println("Age need to be numeric and Height to be write with point");
        }
    }
}