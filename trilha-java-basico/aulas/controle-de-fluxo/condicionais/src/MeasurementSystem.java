public class MeasurementSystem {
    public static void main(String[] args) {
        String acronym = "M";

        switch (acronym) {
            case "S":{
                System.out.println("Small");
                break;
            }
            case "M": {
                System.out.println("Medium");
                break;
            }
            case "L": {
                System.out.println("Large");
                break;
            }
            default:
                System.out.println("Indefinite");
        }
    }
}
