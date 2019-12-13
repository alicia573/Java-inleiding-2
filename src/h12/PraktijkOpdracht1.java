package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class PraktijkOpdracht1 extends Applet {
    TextField nameField, numberField;
    Button okKnop;
    String nameArray[], numberArray[], error;
    Label nameLabel, numberLabel;
    boolean errormessage;
    int index , i;



    public void init(){
        setSize(800, 300);
        error = "";
        errormessage = false;
        index = 0;
        i = 0;
        nameArray = new String [10];
        numberArray = new String [10];

        nameLabel = new Label (" Enter here a name:");
        add (nameLabel);
        nameField = new TextField ("", 20);
        add (nameField);

        numberLabel = new Label (" Enter here a phone number:");
        add(numberLabel);
        numberField = new TextField ("", 20);
        add(numberField);

        okKnop = new Button ("Ok");
        add (okKnop);
        okKnop.addActionListener (new okKnopListener());

    }



    class okKnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            nameArray[index] = nameField.getText ();
            numberArray[index] = numberField.getText ();
            if (!nameArray[index].equals ("") && !numberArray[index].equals ("")) {
                if (index == 10) {
                    for (i =0; i < nameArray.length; i++) {
                        nameArray[i] = "";
                    }
                    for (i = 0; i < numberArray.length; i ++){
                        nameArray[i] = "";
                    }
                }
                index++;
            }
            else {
                errormessage = true;
                error = "Enter first name and phone number. ";
            }
            nameField.setText("");
            numberField.setText("");
            repaint ();
        }
    }
    public void paint(Graphics g){
        int y = 30;
        if (errormessage == false) {
            if (index < 10) {
                g.drawString ("Number entered: " + index + "/10", 50, 50);
            }
            if (index == 10) {
                for (int i = 0; i < index; i++) {
                    y += 20;
                    g.drawString ("First name:  " + nameArray[i] + "     " + "Phone number:  " + numberArray[i], 55, y);
                }
                index = 0;

            }
        } else {
            g.drawString ("Number entered: " + index + "/10",50   ,50 );
            g.drawString ("" + error, 50, 80);
            errormessage = false;
        }
    }
}
