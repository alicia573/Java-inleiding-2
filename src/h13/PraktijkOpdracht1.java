package h13;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht1 extends Applet {

    public void init(){

        setSize(600,300);
    }
    public void paint(Graphics g) {
        int y1=100, y2=70, x1=100, x2=75;
        for (int i = 0; i < 4; i++) {
            bomen (g,  y1,  y2, x1, x2 );
            y1++;
            y2--;
            x1+=100;
            x2+=100;
        }
        bomen  (g, y1, y2, x1, x2);
    }
        void bomen ( Graphics g,  int y1,int y2, int x1, int x2){
        g.setColor(new Color(127, 51, 0));
        g.fillRect (x1,y1,20,100);
        g.setColor(Color.GREEN);
        g.fillOval (x2, y2 ,70, 70);



    }
}
