package h06;

import java.awt.*;
import java.applet.*;


public class Berekening1 extends Applet {
    int a;
    int b;

    int uitkomst;

    public void init() {

        a = 113;
        b = 4;

        uitkomst = (a / b);
    }

    public void paint(Graphics g) {
        g.drawString("Jan: " + uitkomst, 20, 20);
        g.drawString("Ali: " + uitkomst, 20, 60);
        g.drawString("Jeannette: " + uitkomst, 20, 100);
        g.drawString("Alicia: " + uitkomst, 20, 140);
    }
}

