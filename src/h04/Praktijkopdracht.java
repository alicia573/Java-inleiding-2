package h04;

import java.awt.*;
import java.applet.*;
import java.awt.color.*;

public class Praktijkopdracht extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        g.drawRoundRect(100, 300,300 ,125 , 30, 30);
        g.drawRect(100, 130, 300, 125);
        g.drawLine(100, 80, 400, 80);
        g.setColor(Color.magenta);
        g.fillOval(425, 305, 300, 125);
        g.fillRect(425, 130, 300, 125);
        g.fillArc(750,130 , 300, 125, 0, 40);

        g.setColor(Color.black);
        g.drawOval(425, 130, 300,125 );
        g.drawArc(750,130 , 300, 125, 360, 360);
        g.drawOval(825, 305, 125,125 );
        g.drawString("Lijn", 250, 100);
        g.drawString("Rechthoek", 220, 280);
        g.drawString("Afgeronde rechthoek",190 ,450 );
        g.drawString("Gevulde rechthoek met ovaal",500 ,280 );
        g.drawString("Taartpunt met ovaal eromheen",820 , 280);
        g.drawString("Gevulde ovaal",540 ,450 );
        g.drawString("Cirkel", 870,450 );







    }
}