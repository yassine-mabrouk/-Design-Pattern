package adapter.exemple1.adapter;

import adapter.exemple1.noStandart.VGA;
import adapter.exemple1.standart.HDMI;

public class AdapterHdmiVGA implements HDMI {
    // utilisation de autre cote par composition
    private VGA vga;

    public void setVga(VGA vga) {
        this.vga = vga;
    }

    @Override
    public void signal(String str) {
        //byte[] data =str.toByteArray();
        this.vga.view(str.getBytes());
    }
}
