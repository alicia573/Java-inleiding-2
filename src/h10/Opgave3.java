
package h10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opgave3 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst, tekst2;
    int maanden;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een nummer van een maand.");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        tekst2 = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
        g.drawString(tekst2, 50, 80 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            maanden = Integer.parseInt( s);
            switch(maanden) {
                case 1:
                    tekst = "January";
                    tekst2= "Aantal dagen: 31 Dagen";
                    break;
                case 2:
                    tekst = "Februari";
                    tekst2= "Aantal dagen: 28/29 Dagen ";
                    break;
                case 3:
                    tekst = "Maart";
                    tekst2= "Aantal dagen: 31 Dagen ";
                    break;
                case 4:
                    tekst = "April";
                    tekst2= "Aantal dagen: 30 Dagen ";
                    break;
                case 5:
                    tekst = "Mei";
                    tekst2= "Aantal dagen: 31 Dagen ";
                    break;
                case 6:
                    tekst = "Juni";
                    tekst2= "Aantal dagen: 30 Dagen ";
                    break;
                case 7:
                    tekst = "Juli";
                    tekst2= "Aantal dagen: 31 Dagen ";
                    break;
                case 8:
                    tekst = "Augustus";
                    tekst2= "Aantal dagen: 31 Dagen ";
                    break;
                case 9:
                    tekst = "September";
                    tekst2= "Aantal dagen: 30 Dagen ";
                    break;
                case 10:
                    tekst = "Oktober";
                    tekst2= "Aantal dagen: 31 Dagen ";
                    break;
                case 11:
                    tekst = "November";
                    tekst2= "Aantal dagen: 30 Dagen ";
                    break;
                case 12:
                    tekst = "December";
                    tekst2= "Aantal dagen: 31 Dagen ";
                    break;
                default:
                    tekst = "Verkeerd Nummer!  " + s ;
                    tekst2= " ";
                    break;
            }
            repaint();
        }
    }
}
