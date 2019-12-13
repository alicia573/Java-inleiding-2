
package h11;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class PraktijkOpdracht2 extends Applet {
    TextField tekst;
    String fout, tafels, error;
    Label label;
    Button okKnop;
    int getal, cijfer, y, x;
    boolean geklikt, foutmelding;


    public void init() {
        fout = "";
        geklikt = false;
        cijfer =1 ;
        getal = 0;
        setSize(600, 500);

        okKnop = new Button("Ok");
        okKnop.addActionListener(new OkListener());
        add(okKnop);
    }

    public void paint(Graphics g) {
        if (geklikt == true) {
            if (foutmelding == false ) {
                y = 60;
                x = 50;
                for (int i = 1; i <= 10; i++) {
                    y += 20;
                    tafels = cijfer*i + "";
                    g.drawString("Tafel van " + i + " X " + cijfer + " = " + tafels, x, y);
                }
            } else {
                g.drawString("" + error, x,y);
                foutmelding = false;
            }
        }
    }

    class OkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                cijfer = Integer.parseInt(tekst.getText());
                if (cijfer >= 1 && cijfer <= 10) {
                    tekst.setText("");
                }
                geklikt = true;
                repaint();
            } catch (NumberFormatException exc) {
                foutmelding = true;
                geklikt = true;
                error = "Verkeerde Tafel";
                tekst.setText("");
                repaint();
            }
        }
    }
}