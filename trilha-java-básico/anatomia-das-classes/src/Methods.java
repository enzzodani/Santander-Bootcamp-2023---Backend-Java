public class Methods {
    public static void main(String[] args) {

        String firstName = "Enzo Daniel";
        String secondName = "Marinho";

        String completeName = completeName (firstName, secondName);
        System.out.println(completeName);
    }
    public static String completeName (String firstName, String secondName) {

        return "Result: " + firstName.concat(" ").concat(secondName);
    }

}
