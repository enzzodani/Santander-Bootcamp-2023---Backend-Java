public class rel {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;

        boolean yesNo = num1 == num2;

        System.out.println("Are num1 and num2 equal?" + yesNo);

        yesNo = num1 != num2;

        System.out.println("Are num1 and num2 different?" + yesNo);

        yesNo = num1 > num2;

        System.out.println("Are num1 bigger than num2?" + yesNo);
    }
}
