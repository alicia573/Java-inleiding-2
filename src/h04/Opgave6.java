package h04;
import java.awt.*;
import java.applet.*;

public class Opgave6 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRoundRect(850, 200, 150, 400, 10, 10);
        g.setColor(Color.red);
        g.fillArc(876, 210, 100, 100, 360, 360);
        g.setColor(Color.orange);
        g.fillArc(876, 340, 100, 100, 360, 360);
        g.setColor(Color.green);
        g.fillArc(876, 470, 100, 100, 360, 360);
        g.setColor(Color.black);
        g.fillRoundRect(915, 595, 25, 300, 10, 10);
    }


}
