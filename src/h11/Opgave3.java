
package h11;

import java.applet.Applet;
import java.awt.*;

public class Opgave3 extends Applet {

    int maxNumber = 20;
    int previousNumber = 0;
    int nextNumber = 1;
    public void init() {
        setSize (1100,300);
    }

    public void paint(Graphics g) {
         int x = 10;

       g.drawString ("Fibonacci Series of "+maxNumber+" numbers:",100,50);
        for (int i = 1; i <= maxNumber; ++i)
        {


            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            g.drawString (previousNumber + "",x, 100);
            x+= 50;
                }

    }
            }
