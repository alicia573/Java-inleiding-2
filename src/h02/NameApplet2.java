package h02;

import java.awt.*;
import java.applet.*;

public class NameApplet2 extends Applet
  {
      Font f1, f2;


    public void init() {
        setBackground(Color.white);
        f1= new Font("Arial",Font.BOLD,50);
        f2= new Font("Arial",Font.BOLD,50);
    }
      //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g){

        g.setColor(Color.blue);
        g.setFont(f1);
        g.drawString("Alicia",910,465);
        g.setColor(Color.red);
        g.setFont(f2);
        g.drawString("Fernandes",860,500);


    }
  }




