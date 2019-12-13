package h06;

import java.applet.Applet;
import java.awt.*;


public class PraktijkOpdracht extends Applet {
    double a,b,c,d,e, uitkomst;


    public void init () {
        a = 59;
        b = 63;
        c = 69;
        d = 3;
        e = 10;


        uitkomst = (a + b + c)/e/d;

    }

    public void paint(Graphics g) {
        g.drawString("uitkomst = "+ uitkomst, 50, 50);






    }

}
