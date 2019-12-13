package h11;

import java.applet.Applet;
import java.awt.*;

 public class Opgave8 extends Applet {
    public void init() {
        setSize(1200, 1000);
    }



    public void paint(Graphics g) {
        int xCoordinaat = 0, yCoordinaat = 0, aantalCirkels = 100, lengte = 10, breedte = 10;
        for (int teller = 0; teller < aantalCirkels; teller++){
            g.drawOval(xCoordinaat, yCoordinaat, breedte, lengte);
            lengte += 10;
            breedte += 10;
        }
    }

}