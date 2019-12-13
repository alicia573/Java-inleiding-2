
package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.*;



public class Opgave2 extends Applet {

    String[] cijfers = {"Aas", "Twee", "Drie", "Vier", "Vijf", "Zes", "Zeven", "Acht", "Negen", "Tien", "Boer", "Koningin", "Koning"};
    String[] kleuren = {"Ruiten", "Klaver", "Harten", "Schoppen"};
    String[] nieuwSpelers, deck = new String[52], speler1 = new String[13], speler2 = new String[13], speler3 = new String[13], speler4 = new String[13];
    int aantalRijen, aantalKaarten, speler, index, y;
    Button DelenKnop;
    boolean geklikt;


    public void init() {

        setSize(700, 400);
        index = 0;
        geklikt = false;
        aantalRijen = 4;
        aantalKaarten = 13;
        DelenKnop = new Button("Deel Kaart");
        DelenKnop.addActionListener(new DelenKnopListener());
        add(DelenKnop);
    }

    public String trekKaart() {
        int random = new Random().nextInt(deck.length);
        String getrokkenKaart = deck[random];
        nieuwSpelers = new String [deck.length - 1];
        int hulpindex = 0;
        for (int vulDeck = 0; vulDeck < deck.length; vulDeck++) {
            if (vulDeck != random) {
                nieuwSpelers[hulpindex] = deck[vulDeck];
                hulpindex++;
            }
        }
        deck = nieuwSpelers;
        return getrokkenKaart;
    }



    public void paint(Graphics g) {
        g.fillRect(20, 130, 100, 50);
        int x = 80;
        y = 80;
        speler = 1;
        if (geklikt == true) {
            for (int spelers = 0; spelers < 4; spelers++) {
                g.drawString("Speler" + speler, x, 60);
                speler++;
                x += 120;
            }
            for (int uitdelen = 0; uitdelen < aantalKaarten; uitdelen++) {
                g.drawString("" + speler1[uitdelen], 80, y);
                g.drawString("" + speler2[uitdelen], 200, y);
                g.drawString("" + speler3[uitdelen], 320, y);
                g.drawString("" + speler4[uitdelen], 440, y);
                y += 20;
            }
        }
    }
    class DelenKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            deck = new String[52];
            index = 0;
            for (int kleur = 0; kleur < kleuren.length; kleur++) {
                String kleurString = kleuren[kleur];
                for (int cijfer = 0; cijfer < cijfers.length; cijfer++) {
                    String cijferString = cijfers[cijfer];
                    String kaart = kleurString + " " + cijferString;
                    deck[index] = kaart;
                    index++;
                }
            }
            index = 0;
            geklikt = true;
            if (index < deck.length) {
                for (int verdelen = 0; verdelen < aantalKaarten; verdelen++) {
                    speler1[verdelen] = trekKaart();
                    speler2[verdelen] = trekKaart();
                    speler3[verdelen] = trekKaart();
                    speler4[verdelen] = trekKaart();
                    index++;
                }
            }
            repaint();
        }
    }

}

