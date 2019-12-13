package h04;

import java.awt.*;
import java.applet.*;

public class Opgave4 extends Applet {
    Font f1, f2,f3,f4,f5,f6,f7,f8,f9;
    public void init() {
        setBackground(Color.white);
        f1= new Font("Arial",Font.PLAIN,40);
        f2= new Font("Arial",Font.PLAIN,40);
        f3= new Font("Arial",Font.PLAIN,40);
        f4= new Font("Arial",Font.PLAIN,40);
        f5= new Font("Arial",Font.PLAIN,40);
        f6= new Font("Arial",Font.PLAIN,40);
        f7= new Font("Arial",Font.PLAIN,20);
        f8= new Font("Arial",Font.PLAIN,20);
        f9= new Font("Arial",Font.PLAIN,20);
    }

    public void paint(Graphics g) {

      g.setColor(Color.black);
        g.setColor(Color.BLACK);
        g.setFont(f1);
        g.drawString("0",50,660);
        g.setColor(Color.blue);
        g.setFont(f2);
        g.drawString("20",30,520);
        g.setColor(Color.blue);
        g.setFont(f3);
        g.drawString("40",30,420);
        g.setColor(Color.blue);
        g.setFont(f4);
        g.drawString("60",30,320);
        g.setColor(Color.blue);
        g.setFont(f5);
        g.drawString("80",30,220);
        g.setColor(Color.blue);
        g.setFont(f6);
        g.drawString("100",7,120);

        g.setColor(Color.black);
        g.drawRect(80, 20, 1, 600);
        g.drawRect(80,620 , 620, 1);

        g.setColor(Color.black);
        g.fillRect(500, 200, 200, 420);
        g.setColor(Color.blue);
        g.fillRect(295, 100, 200, 520);
        g.setColor(Color.red);
        g.fillRect(90, 400, 200, 220);

        g.setColor(Color.red);
        g.setFont(f7);
        g.drawString("Valerie",140,650);
        g.setColor(Color.blue);
        g.setFont(f8);
        g.drawString("Jeroen",330,650);
        g.setColor(Color.BLACK);
        g.setFont(f9);
        g.drawString("Hans",570,650);



    }


}