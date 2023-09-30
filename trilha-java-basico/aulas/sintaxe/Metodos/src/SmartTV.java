public class SmartTV {
    /* Characteristics: on (boolean), chanel (int) and volume(int)
     * Our Tv can power on and power off and switch the power
     * Our TV can up and down the volume always in +1 or -1
     * Our Tv can change the chanel in 1 and 1 or choosing a correspondent number*/
    boolean powerOn=false;
    int chanel = 1;
    int volume = 25;

    public void setPowerOn(){
        powerOn=true;
    }
    public void setPowerOff(){
        powerOn = false;
    }
    public void upVolume(){
        volume++;
    }
    public void downVolume(){
        volume--;
    }
    public void upChanel(){
        chanel++;
    }
    public void downChanel(){
        chanel--;
    }
    public void changeCanal (int newChanel){
        chanel = newChanel;
    }
}
