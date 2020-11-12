import java.applet.Applet;
import java.awt.*;

public class Hfd62 extends Applet {
int dag, jaar, minuut, seconden;




    public void init() {
dag = 24;
jaar = 365;
minuut = 60;
seconden = 60;

    }

    public void paint(Graphics g) {
g.drawString("Seconden in een uur : " + minuut * seconden ,50,50 );
g.drawString("Seconden in een dag : " + minuut * seconden * dag, 50, 70  );
g.drawString("Seconden in een jaar : " + minuut * seconden* dag* jaar, 50, 90 );














    }














}
