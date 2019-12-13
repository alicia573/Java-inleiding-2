package h12;

import java.applet.Applet;
import java.awt.*;

public class Opgave1 extends Applet {

    int kledinggeld[], totaalKledinggeld, beginGetal, optellen, maand;
    double gemiddelde;

    public void init() {
        kledinggeld = new int[10];
        optellen = 5;
        beginGetal = 5;
        totaalKledinggeld = 0;
        for (maand = 0; maand < kledinggeld.length; maand++) {
            kledinggeld [maand] = optellen*maand + beginGetal;
            totaalKledinggeld += kledinggeld[maand];

        }
    }

        public void paint (Graphics g){
            gemiddelde = totaalKledinggeld / kledinggeld.length;
            for (maand = 0; maand < kledinggeld.length; maand++) {
                g.drawString ("" + kledinggeld[maand], 50, 20*maand + 20);
                g.drawString ("Het gemiddelde per maand is : " + gemiddelde, 50, 220);


            }
        }

    }
