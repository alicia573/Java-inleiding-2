package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class PraktijkOpdracht extends Applet {
    Button maal, plus, delen, aftrekken;
    TextField invoerVak1, invoerVak2, resultaat;
    double invoerGetal1, invoerGetal2, resultaatGetal;



    public void init() {
        invoerVak1 = new TextField( 12 );
        invoerVak2 = new TextField( 12 );
        resultaat = new TextField( 12 );

        delen = new Button("/");
        delen.addActionListener( new delenHandler () );

        maal = new Button("*");
        maal.addActionListener( new maalHandler () );

        aftrekken = new Button("-");
        aftrekken.addActionListener( new aftrekkenHandler ());

        plus = new Button("+");
        plus.addActionListener( new plusHandler () );

        add(delen);
        add(maal);
        add(aftrekken);
        add(plus);
        add( invoerVak1 );
        add( invoerVak2 );
        add (resultaat);

    }
    class maalHandler implements ActionListener {
        public void actionPerformed( ActionEvent e )
        {
            String invoer1 = invoerVak1.getText();
            invoerGetal1 = Double.parseDouble( invoer1 );

            String invoer2 = invoerVak2.getText();
            invoerGetal2 = Double.parseDouble( invoer2 );

            resultaatGetal = invoerGetal1 * invoerGetal2;
            resultaat.setText( "" + resultaatGetal );
        }
    }
    class plusHandler implements ActionListener {
        public void actionPerformed( ActionEvent e )
        {
            String invoer1 = invoerVak1.getText();
            invoerGetal1 = Double.parseDouble( invoer1 );

            String invoer2 = invoerVak2.getText();
            invoerGetal2 = Double.parseDouble( invoer2 );

            resultaatGetal = invoerGetal1 + invoerGetal2;
            resultaat.setText( "" + resultaatGetal );
        }

    }
    class delenHandler implements ActionListener {
        public void actionPerformed( ActionEvent e )
        {
            String invoer1 = invoerVak1.getText();
            invoerGetal1 = Double.parseDouble( invoer1 );

            String invoer2 = invoerVak2.getText();
            invoerGetal2 = Double.parseDouble( invoer2 );

            resultaatGetal = invoerGetal1 / invoerGetal2;
            resultaat.setText( "" + resultaatGetal );
        }

    }
    class aftrekkenHandler implements ActionListener {
        public void actionPerformed( ActionEvent e )
        {
            String invoer1 = invoerVak1.getText();
            invoerGetal1 = Double.parseDouble( invoer1 );

            String invoer2 = invoerVak2.getText();
            invoerGetal2 = Double.parseDouble( invoer2 );

            resultaatGetal = invoerGetal1 - invoerGetal2;
            resultaat.setText( "" + resultaatGetal );
        }

    }
}


