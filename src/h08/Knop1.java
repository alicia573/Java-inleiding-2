package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Knop1 extends Applet{
    public Button resetButton, okButton;
    public TextField tekstvak;
    public String Ok;
    String schermtekst;
    public void init() {
        tekstvak = new TextField("OK ", 40);
        resetButton = new Button("Reset");
        resetButton.addActionListener( new ResetKnopListener() );
        okButton = new Button("Ok");
        okButton.addActionListener( new OkKnopListener() );
        add(resetButton);
        add(okButton);

        tekstvak = new TextField("Type ", 20);
        add(tekstvak);

    }

    public void paint(Graphics g) {
        g.drawString (""+Ok, 100, 100);
    }

    class OkKnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            Ok =tekstvak.getText ();
            tekstvak.setText("");
            repaint();
        }
    }
    class ResetKnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
           tekstvak.getText();
           tekstvak.setText ("");
            repaint();
        }
    }


}