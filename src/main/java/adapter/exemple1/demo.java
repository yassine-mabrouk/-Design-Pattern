package adapter.exemple1;


import adapter.exemple1.adapter.AdapterHdmiVGA;
import adapter.exemple1.client.Ordinateur;
import adapter.exemple1.noStandart.VideoProjecteur;
import adapter.exemple1.standart.Televiseur;

/*
* Description  du probelem
* un probelem simple il s'agit brancher un ordinateur avec les different interface
* (interface HDMI , interface VGA ) en ultilisant un adapter
* ordinater |HDMI=>   |HDMI====Adapter=====VGA|  <=VGA| Equipement
*
* */
public class demo {
    public static void main(String[] args) {
        // user mu pc
        Ordinateur pc = new Ordinateur();
        // braoncher pc to televiseur pas de probelem ils ont les meme port "hdmi"
        pc.setHdmi(new Televiseur());
        pc.afficher("running Televiseur ...");
        // maintenent je veut brancher mon pc to videoProjecteur qui un port VGA donc
        // un probelem pc et videoProjecteur ont pas le meme port
        // donc je vais utiliser un adapter

        // creer un adapter
        AdapterHdmiVGA adapter=new AdapterHdmiVGA();
        adapter.setVga(new VideoProjecteur());

        //maintenet c'est coll
        // brancher pc to adapter
        pc.setHdmi(adapter);
        pc.afficher("running video projecteur ");

    }
}
