package h13;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht2 extends Applet {

    public void init(){

        setSize(600,600);
    }
    public void paint(Graphics g) {
        int y1=100, y2=70, x1=100, x2=75, height2= 100 , height= 70, width= 20, width2=70;
        for (int i = 0; i < 5; i++) {
            bomen (g,  y1,  y2, x1, x2, height2, height, width, width2 );
            y1++;
            y2--;
            x1+=100;
            x2+=100;

        }

    }
    private void bomen(Graphics g, int y1, int y2, int x1, int x2, int height2,
                       int height, int width, int width2){
        g.setColor(new Color(127, 51, 0));
        g.fillRect (x1,y1,width,height2);
        g.setColor(Color.GREEN);
        g.fillOval (x2, y2 ,width2, height);

        g.setColor(new Color(127, 51, 0));
        g.fillRect (x1,300,width,height2);
        g.setColor(Color.GREEN);
        g.fillOval (x2, 270,width2, height);



    }
}
