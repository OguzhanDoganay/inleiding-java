package h01;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by piet on 31-08-16.
 */

public class HalloRocDev extends Applet {

    public void init() {
        setBackground(Color.WHITE);



    }






    public void paint(Graphics g) {
        g.drawString("lijn",50, 50);
        g.drawLine(50, 40, 100, 40);




    }
}
