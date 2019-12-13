package h06;


import java.awt.*;
import java.applet.*;

public class Berekening2 extends Applet {
    int a;
    int b;
    int c;


    int uitkomst;
    int uitkomst1;
    int uitkomst2;


    public void init() {

        a = 60;
        b = 24;
        c = 365;

        uitkomst = (a*a);
        uitkomst1= (a*a*b);
        uitkomst2=(c*b*a*a);
    }

    public void paint(Graphics g) {
        g.drawString("Hoeveel secondes gaan er in een uur?: " + uitkomst, 20, 20);
        g.drawString("Hoeveel secondes gaan er in een dag?: " + uitkomst1, 20, 60);
        g.drawString("Hoeveel secondes gaan er in een jaar?: " + uitkomst2, 20, 100);
    }
}













