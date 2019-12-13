package h11;


import java.applet.Applet;
import java.awt.*;

public class Opgave9 extends Applet {
    public void init(){
        setSize (300,300);

    }
    public void paint(Graphics g){
        int x,y = 50, breedte = 20, hoogte = 20;
        setBackground(Color.gray);
        for ( int a = 0; a < 4; a++){

            x = 50;
            y +=  hoogte;

            for (int kolom= 0; kolom < 8 ; kolom++){
                if (kolom == 0|| kolom == 2 || kolom == 4 || kolom == 6 || kolom == 8 ) {
                    g.setColor (Color.black);
                    g.fillRect (x, y, breedte, hoogte);
                } else {
                    g.setColor (Color.white);
                    g.fillRect (x, y, breedte, hoogte);

                }
                x += breedte;
                }
            x= 50;
            y+= hoogte;

            for (int kolom = 0; kolom < 8; kolom++ ){
                if (kolom == 0|| kolom == 2|| kolom == 4 || kolom == 6 || kolom == 8 ){
                    g.setColor (Color.white);
                    g.fillRect (x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.black);
                    g.fillRect(x ,y, breedte, hoogte);
                }
                x += breedte;
            }
        }
    }
}





















