package h11;

import java.applet.Applet;
import java.awt.*;

public class Opgave2 extends Applet {
    int y=20;

    public void paint(Graphics g){
       for(int i=0; i<=10; i=i+1)
       {
           g.drawString (""+i, 20, y);
           y=y+20;
       }
    }
}
