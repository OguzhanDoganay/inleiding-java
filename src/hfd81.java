import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class hfd81 extends Applet {
Button knop, knop2;
TextField tekst;
Label stickertje;


    public void init() {

   knop = new Button("");
   tekst = new TextField("",30);
   knop2 = new Button("");
   stickertje = new Label();
   add(knop);
   add(knop2);
   add(tekst);
   add(stickertje);
   knop.addActionListener(new Listener());
   knop2.addActionListener(new Listener());

    }


    public void paint(Graphics g) {
    knop.setLabel("ok");
    knop.setSize(100, 40);
    knop.setLocation(50,30);


    tekst.setSize(210,40);
    tekst.setLocation(50,80);


    knop2.setSize(100,40);
    knop2.setLocation(160,30);
    knop2.setLabel("reset");


    stickertje.setSize(210,40);
    stickertje.setLocation(50,130);



    }

class Listener implements ActionListener{


    public void actionPerformed(ActionEvent e) {
    String message = tekst.getText();
    stickertje.setText(message);









    }
}




}
