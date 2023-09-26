public class User {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();

        System.out.println("Is the Tv on? "+smartTV.powerOn);
        System.out.println("Current chanel: "+smartTV.chanel);
        System.out.println("Current volume: "+smartTV.volume);

        smartTV.setPowerOn();
        System.out.println("New Status -> Is the Tv on? "+smartTV.powerOn);

        smartTV.setPowerOff();
        System.out.println("New Status 2 -> Is the Tv on? "+smartTV.powerOn);

        smartTV.upVolume();
        System.out.println("New Status -> Current volume: "+smartTV.volume);

        smartTV.downVolume();
        smartTV.downVolume();
        smartTV.downVolume();
        System.out.println("New Status 2-> Current volume: "+smartTV.volume);

        smartTV.changeCanal(13);
        System.out.println("New Status -> Current chanel: "+smartTV.chanel);
        smartTV.upChanel();
        System.out.println("New Status 2-> Current chanel: "+smartTV.chanel);
        smartTV.downChanel();
        System.out.println("New Status 3-> Current chanel: "+smartTV.chanel);
    }
}
