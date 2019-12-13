package h11;

import java.applet.Applet;
import java.awt.*;

public class Opgave6 extends Applet {



    public void init(){


    }


    public void paint(Graphics g) {
        int xCoordinaat = 100, yCoordinaat = 100, aantalCirkels = 5, lengte = 40, breedte = 40;
        for (int teller = 0; teller < aantalCirkels; teller++) {
            g.drawOval (xCoordinaat, yCoordinaat, breedte, lengte);
            lengte += 20;
            breedte += 20;
            xCoordinaat -= 10;
            yCoordinaat -= 10;

        }
    }



}
