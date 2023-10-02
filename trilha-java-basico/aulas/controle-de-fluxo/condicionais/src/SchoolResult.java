public class SchoolResult {
    public static void main(String[] args) {
        int note = 6;

        if (note >= 7) {
            System.out.println("Approved");
        }

        else if (note >=5) {
            System.out.println("Retake Test");
        }

        else {
            System.out.println("Reproved");
        }
    }
}
