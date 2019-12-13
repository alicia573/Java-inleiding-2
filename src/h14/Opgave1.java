package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opgave1 extends Applet {
    String[] numbers = {"Aas", "Twee", "Drie", "Vier", "Vijf", "Zes", "Zeven", "Acht", "Negen", "Tien", "Boer", "Koningin", "Koning", "Joker"};
    String[] colors= {"Ruiten", "Klaver", "Harten", "Schoppen"};
    int  randomNumber, randomColor;
    double  randomNumbers, randomColors;
    Button DeelButton;
    public void init(){
        setSize (500,300);
        DeelButton= new Button("Deel kaart");
        DeelButton.addActionListener (new DeelButtonListener ());
        add(DeelButton);

    }
    public void paint(Graphics g) {
        if (randomNumber == 13) {
            g.drawString ("" + numbers[13], 20, 20);
        } else {
            g.drawString ("" +colors [randomColor]+ "  " + numbers [randomNumber] , 215, 150);
        }
    }


    class DeelButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            randomNumbers = Math.random();
            randomNumber =  (int)(randomNumbers * 14);
            randomColors = Math.random ();
            randomColor = (int) (randomColors *4);

            repaint();

        }
    }
}
