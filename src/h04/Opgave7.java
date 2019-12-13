package h04;

import java.applet.Applet;
import java.awt.*;


  import java.awt.*;
  import java.applet.*;

    public class Opgave7 extends Applet {

        public void init() {

        }

        public void paint(Graphics g) {
            g.setColor(Color.black);
            g.fillArc(760, 300, 150, 150, 360, 360);
            g.setColor(Color.black);
            g.fillArc(760, 550, 150, 150, 360, 360);
            g.setColor(Color.black);
            g.fillArc(1000, 300, 150, 150, 360, 360);
            g.setColor(Color.black);
            g.fillArc(1000, 550, 150, 150, 360, 360);
            g.setColor(Color.black);

            g.drawRoundRect(700, 250,500 , 500, 10, 10);
        }
    }