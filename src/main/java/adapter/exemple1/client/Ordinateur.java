package adapter.exemple1.client;

import adapter.exemple1.standart.HDMI;

public class Ordinateur {
    private HDMI hdmi;

    public void setHdmi(HDMI hdmi) {
        this.hdmi = hdmi;
    }
    public void afficher( String str ){
        this.hdmi.signal(str);
    }
}
