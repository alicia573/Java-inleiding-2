package h10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opgave4 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int jaar;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een jaar in en druk op Enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            jaar = Integer.parseInt( s);
            if ( (jaar % 4 == 0 && !( jaar % 100 == 0 ) || jaar % 400 == 0 )) {
                tekst = "Jaar "+ jaar + " is een schrikkeljaar ";
            }
            else {
                tekst = "Jaar "+ jaar + " is geen schrikkeljaar";
            }
            repaint();
        }
    }
}