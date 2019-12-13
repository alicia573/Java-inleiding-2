package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class Opgave4 extends Applet implements ActionListener {
    Font f1, f2;
    TextField firstNum, resultaatNum;

    public void init() {
        setSize (900,900);
        setLayout (new GridLayout (8, 6, 2, 80));
        setBackground (Color.WHITE);

        firstNum = new TextField (0);

        resultaatNum = new TextField (0);

        firstNum.addActionListener (this);

        add (new Label (" "));
        add (firstNum);


        add (resultaatNum);
        f1 = new Font ("Arial", Font.PLAIN, 25);
        f2 = new Font ("Arial", Font.PLAIN, 25);

    }

    public void actionPerformed(ActionEvent e) {
        String str1 = firstNum.getText ();
        double fn = Double.parseDouble (str1);


        resultaatNum.setText ("Het Antwoord is:    " + (fn *3));
    }



    public void paint(Graphics g) {


        g.setColor (Color.BLACK);
        g.setFont (f1);
        g.drawString ("Type a Number", 50, 70);
        g.setColor (Color.BLACK);
        g.setFont (f2);
        g.drawString ("Resultaat", 50, 220);



    }
}










