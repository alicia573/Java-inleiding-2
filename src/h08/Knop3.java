package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;



public class Knop3 extends Applet implements ActionListener {
    Font f1, f2;
    TextField firstNum, resultNum;

    public Knop3() {
        setLayout (new GridLayout (8, 6, 2, 80));
        setBackground (Color.WHITE);

        firstNum = new TextField (0);

        resultNum = new TextField (0);

        firstNum.addActionListener (this);

        add (new Label (" "));
        add (firstNum);

        add (new Label (" "));
        add (resultNum);
    }

    public void actionPerformed(ActionEvent e) {
        String str1 = firstNum.getText ();
        double fn = Double.parseDouble (str1);


        resultNum.setText ("Het Antwoord is:    " + (fn/100*21 + fn));
    }

    public void init() {
        f1 = new Font ("Arial", Font.PLAIN, 25);
        f2 = new Font ("Arial", Font.PLAIN, 25);

    }

    public void paint(Graphics g) {


        g.setColor (Color.BLACK);
        g.setFont (f1);
        g.drawString ("Enter First Number", 50, 70);
        g.setColor (Color.BLACK);
        g.setFont (f2);
        g.drawString ("Result", 50, 300);

    }
}










