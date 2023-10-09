public class ArrayFor {
    public static void main(String[] args) {
        String[] students;
        students = new String[]{"Felipe", "Julia", "Jonas", "Marcos"};

        for (int x=0; x < students.length; x++) {
            System.out.println("The student with x = " + x + " is " + students[x]);
        }
    }
}
