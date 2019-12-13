package h02;

//
import java.awt.*;
import java.applet.*;

public class NameApplet extends Applet {

    public void init() {
        setBackground(Color.blue);

    }



    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.yellow);

        g.drawString("Alicia Fernandes", 900, 500 );
    }
}






