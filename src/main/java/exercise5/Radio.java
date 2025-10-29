package exercise5;

public class Radio {

    public Boolean isOn;
    public int volume;
    public double frequenzy;




    public Radio(Boolean isOn, int volume,  double frequenzy) {
        this.isOn = isOn;
        this.volume = volume;
        this.frequenzy = frequenzy;
    }

    public boolean isOn() {
        if (isOn == null || !isOn ) {
            isOn = true;
            System.out.println("on");

        }else {
            System.out.println("off");
        }
        return isOn;
    }
    public void off(){
        if (isOn == null || !isOn ) {
            isOn = false;
            System.out.println("off");
        }else {
            System.out.println("on");
        }
    }

    public boolean increaseVolume() {
        if (isOn != null && isOn ) {
            if (volume < 100) {
                volume++;
                System.out.println("Lautstärke wird erhöht: " + volume);
            } else {
                System.out.println("Maximallautstärke:");
            }
        } else {
            System.out.println("Radio aus.");
        }
        return isOn != null && isOn;

    }

    public void decreaseVolume() {
        if (isOn != null && isOn ) {
            if (volume > 0) {
                volume--;
                System.out.println("Lautstärke weniger: " + volume);
            } else {
                System.out.println("Lautstärke ist aus");
            }
        }
    }
    public void selectChannel(double frequenzy) {
        if (isOn != null && isOn) {
            if (frequenzy >= 80.0 && frequenzy <= 110.0) {
                this.frequenzy = frequenzy;
                System.out.println("Kanal gewechselt zu: " + frequenzy + " MHz");
            } else {
                System.out.println("Ungültige Frequenz. Bitte zwischen 80.0 und 110.0 MHz wählen.");
            }
        } else {
            System.out.println("Radio ist aus. Kanal kann nicht gewechselt werden.");
        }
    }

    public String toString() {
        return "Radio{" +
                "isOn=" + isOn +
                ", volume=" + volume +
                ", frequenzy=" + frequenzy +
                '}';
    }



    public int getVolume() {
        return volume;
    }
    public double getFrequenzy() {
        return frequenzy;
    }



}
