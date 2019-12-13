package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;


public class Opgave3 extends Applet {
    Button Okbutton;
    int[] numbers = new int[5];
    TextField[] textfields = new TextField[5];
    String[] Numbers = {"" };



    public void init() {
        setSize (600, 400);
        Arrays.sort (Numbers );
        textfields = new TextField[5];



        Okbutton = new Button ("OK");
        add (Okbutton);
        Okbutton.addActionListener(new Okbuttonlistener ());
        for (int tekstvak = 0; tekstvak < 5; tekstvak++) {
            textfields[tekstvak] = new TextField("");
            add(textfields[tekstvak]);
        }
    }

        class Okbuttonlistener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                String getal;
                for (int cijfer = 0; cijfer < textfields.length; cijfer++) {
                    getal = textfields [cijfer].getText ();
                    numbers[cijfer] = Integer.parseInt (getal);
                }
                Arrays.sort(numbers);
                repaint();
            }
    }
        public void paint (Graphics g){
        for (int sort = 0; sort < numbers.length; sort++) {
            g.drawString("" + numbers[sort], 50, 20 * sort + 20);
        }
    }
}

