package h06;


import java.awt.*;
import java.applet.*;

public class Berekening3 extends Applet {
    int a;
    int b;

    int uitkomst;

    public void init () {

        a= 2000000000;
        b= 1000000000 ;

        uitkomst= (a+b);
    }
    public void paint(Graphics g) {
        g.drawString("Antwoord= "+uitkomst, 50, 50);



    }






}
