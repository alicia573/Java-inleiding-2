package h12;

import java.applet.Applet;
import java.awt.*;


public class Opgave2 extends Applet {

    Button[] buttons = new Button[25];

    public void init() {
        setSize (300, 400);
        add (buttons);
        for (int Button = 0; Button < 25; Button++) {
            buttons[Button] = new Button ("Button");
            add (buttons[Button]);


        }
    }

   public void add(Button[] buttons) {
    }
}