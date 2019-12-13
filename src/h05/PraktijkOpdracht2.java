package h05;


import java.applet.Applet;
import java.awt.*;


public class PraktijkOpdracht2 extends Applet {

    private Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        //initialisatie.
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 300;
        hoogte = 125;
    }

    public void paint(Graphics g) {
        //
        g.setColor(opvulkleur);
        g.fillOval(425, 305, breedte, hoogte);
        g.fillRect(425, 130, breedte, hoogte);
        g.fillArc(750,130 , breedte, hoogte, 0, 40);

        g.setColor(lijnkleur);
        g.drawOval(425, 130, breedte,hoogte );
        g.drawArc(750,130 , breedte, hoogte, 360, 360);
        g.drawOval(825, 305, 125,hoogte );
        g.drawRoundRect(100, 300,breedte ,hoogte , 30, 30);
        g.drawRect(100, 130, breedte, hoogte);
        g.drawLine(100, 80, 400, 80);

        g.drawString("Lijn", 250, 100);
        g.drawString("Rechthoek", 220, 280);
        g.drawString("Afgeronde rechthoek",190 ,450 );
        g.drawString("Gevulde rechthoek met ovaal",500 ,280 );
        g.drawString("Taartpunt met ovaal eromheen",820 , 280);
        g.drawString("Gevulde ovaal",540 ,450 );
        g.drawString("Cirkel", 870,450 );

    }
}
