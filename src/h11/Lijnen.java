package h11;

import java.applet.Applet;
import java.awt.*;

public class Lijnen extends Applet{
    int lijn, aantalLijnen, lengteLijn, afstandLijnen;

    public void init(){
        aantalLijnen= 10;
        setSize (600,400);
    }


    public void paint(Graphics g) {
        afstandLijnen = 20;
        for(lijn=1; lijn<=aantalLijnen; lijn++) {
            lengteLijn += 20;
            afstandLijnen += 20;
            g.drawLine (afstandLijnen, 300, afstandLijnen, 50);
            g.drawString ("" + lijn,afstandLijnen , 315);

        }

    }








}























