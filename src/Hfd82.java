import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hfd82 extends Applet {
    Button knop1, knop2, knop3, knop4;
    Label label;
    int counter;

    public void init() {
        setSize(300, 300);
        add(knop1);
        add(knop2);
        add(knop3);
        add(knop4);
knop1 = new Button("");
knop2 = new Button("");
knop3 = new Button("");
knop4 = new Button("");
counter = 0;

add(label);
label = new Label("Hier komt de aantal te staan!");
knop1.addActionListener(new Luisteraar());
knop2.addActionListener(new Luisteraar());
knop3.addActionListener(new Luisteraar());
knop4.addActionListener(new Luisteraar());

    }


    public void paint(Graphics g) {
        knop1.setLabel("man" + counter);
        knop1.setLocation(50,50);
        knop1.setSize(50,20);

        knop2.setLabel("Vrouw" + counter);
        knop2.setLocation(50, 80);
        knop2.setSize(50,20);

        knop3.setLabel("man leerling" + counter);
        knop3.setLocation(50, 110);
        knop3.setSize(50,20);

        knop4.setLabel("Vrouw leerling " + counter);
        knop4.setLocation(50, 140);
        knop4.setSize(50,20);
    }

    class Luisteraar implements ActionListener{


        public void actionPerformed(ActionEvent e) {

            counter++;





        }
    }

}
