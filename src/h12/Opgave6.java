package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opgave6 extends Applet{
    boolean found  ;
    int [] salary = {100,400,200,300,200,500,300,100,100,200,};
    int amount, find;
    Button okButton;
    TextField text;
    public void init(){
        setSize (500,300);
        find = 0;
        amount = 0;
        found = false;
        okButton = new Button ("OK");
        add (okButton);
        okButton.addActionListener (new okButtonListener());
        text = new TextField ("",10);
        add(text);

    }
    public void paint (Graphics g){
        if (found){
            g.drawString (" The value " + amount + " was found "+ find +" time. ", 20,60);
            found = false;
            find = 0;
        } else{
            g.drawString (" the value " + amount + " was not found." , 20, 60);
        }
        g.drawString ("Monthly salary |100 |400 |200 |300 |200 |500 |300 |100 |100 |200", 50, 100);
        g.drawString ("_________________________________________________", 50, 100);

    }
    class okButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String number = text.getText ();
            amount = Integer.parseInt (number);
            int index = 0;
            while (index < salary.length){
                if (salary[index] == amount ){
                    found = true;
                    find ++;
                }
                index++;
            }
          text.setText ("");
            repaint ();
        }
    }
}