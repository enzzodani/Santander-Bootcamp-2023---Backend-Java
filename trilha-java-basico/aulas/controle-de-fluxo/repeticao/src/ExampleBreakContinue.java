public class ExampleBreakContinue {
    public static void main(String[] args) {
        for (int x = 1; x <= 5; x++) {
            if (x == 3) {
                continue;
            }
            System.out.println(x);
        }
    }
}
