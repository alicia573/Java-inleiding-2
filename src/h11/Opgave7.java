package h11;

import java.applet.Applet;
import java.awt.*;

class Opgave7 extends Applet {

public void init() {
    setSize(800, 850);
}

public void paint(Graphics g) {
        int xCoordinaat = 500, yCoordinaat = 500, aantalCirkels = 50, lengte = 10, breedte = 10;
        for (int teller = 0; teller < aantalCirkels; teller++) {
            g.drawOval (xCoordinaat, yCoordinaat, breedte, lengte);
            lengte += 20;
            breedte += 20;
            xCoordinaat -= 10;
            yCoordinaat -= 10;

        }
    }
}