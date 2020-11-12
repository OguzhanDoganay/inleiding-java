import java.applet.Applet;
import java.awt.*;

public class Hfd52 extends Applet {


    double uitkomst,werkers, bedrag;
    public void init() {
werkers = 4;
bedrag = 113;
uitkomst = (bedrag/werkers)    ;

    }

    public void paint(Graphics g) {
g.drawString("Oguzhan : " + uitkomst,50, 50);
g.drawString("Jan : " + uitkomst, 50, 70);
g.drawString("Jeanette : " + uitkomst, 50, 90);
g.drawString("Ali : " + uitkomst, 50, 110);








    }
}
