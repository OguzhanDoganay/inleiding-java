import java.applet.Applet;
import java.awt.*;

public class Hfd63 extends Applet {
int tien, twaalf, mingetal;

    public void init() {

tien =  2147483647;
twaalf =  2147483647;
mingetal = (tien + twaalf);


    }

    public void paint(Graphics g) {
g.drawString("Mingetal int = " + mingetal, 50,50);




    }
}
