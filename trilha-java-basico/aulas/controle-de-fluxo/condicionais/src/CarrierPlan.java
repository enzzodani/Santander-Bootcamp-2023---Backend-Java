public class CarrierPlan {
    public static void main(String[] args) {
        String plan = "M";

        switch (plan) {
            case "B": {
                System.out.println("100 minutes");
                break;
            }
            case "M": {
                System.out.println("100 minutes + WhatsApp & Instagram free");
                break;
            }
            case "T": {
                System.out.println("100 minutes + WhatsApp & Instagram free + 5GB Youtube");
                break;
            }
        }
    }
}
