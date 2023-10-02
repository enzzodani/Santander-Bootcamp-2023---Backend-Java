public class SchoolResult3 {
    public static void main(String[] args) {
        int note = 6;

        String result = note >= 7 ? "Approved" : note >= 5 && note < 7 ? "Retake Test" : "Reproved";
        System.out.println(result);
    }
}