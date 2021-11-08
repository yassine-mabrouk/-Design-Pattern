package adapter.exemple1.standart;

public class Televiseur implements HDMI{
    @Override
    public void signal(String str) {
        System.out.println("====="+this.getClass().getSimpleName()+"=====");
        System.out.println(str.toUpperCase());
        System.out.println("========================");

    }
}
