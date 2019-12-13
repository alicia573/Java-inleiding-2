package h04;


import java.awt.*;
import java.applet.*;

public class Opgave3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        setBackground(Color.black);
        g.setColor(Color.blue);
        g.fillRect(700, 200, 400, 100);
        g.setColor(Color.white);
        g.fillRect(700, 300, 400, 100);
        g.setColor(Color.red);
        g.fillRect(700, 400, 400, 100);
        g.setColor(Color.white);
        g.fillRect(700, 200 , 20, 700);
    }


}