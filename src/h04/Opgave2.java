package h04;

import java.awt.*;
import java.applet.*;

public class Opgave2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.orange);
        g.fillArc(400, -295, 1200, 800, 240, 60);
        g.setColor(Color.black);
        g.fillRect(700, 450, 600, 500);
        g.setColor(Color.red);
        g.fillRect(750, 470, 100, 100);
        g.fillRect(1150, 470, 100, 100);
        g.setColor(Color.blue);
        g.fillRect(1000, 650, 150, 300);
        g.setColor(Color.black);
        g.fillRect(750, 810, 100, 5);
        g.setColor(Color.green);
        g.fillRect(750, 470, 100, 100);



    }
}

