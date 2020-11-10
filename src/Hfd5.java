import java.applet.Applet;
import java.awt.*;

public class Hfd5 extends Applet {

    public void init() {
    setBackground(Color.WHITE);



    }






    public void paint(Graphics g) {
g.drawString("lijn",90, 60);
g.drawLine(50, 40, 150, 40);
g.drawRect(50, 80, 100, 40);
g.drawString("Rechthoek", 75, 140 );
g.setColor(Color.magenta);
g.fillRect(175, 80, 100, 40);
g.setColor(Color.BLACK);
g.drawString("Gevulde rechthoek", 175, 140);
g.drawOval(175, 80, 100, 40);
g.setColor(Color.magenta);
g.fillArc(300, 80, 100, 40, 0, 45);
g.setColor(Color.BLACK);
g.drawOval(300, 80, 100, 40);
g.drawString("Fillarc gebruikt", 300, 140);
g.drawRoundRect(50, 160, 100, 40, 30, 30);
g.drawString("Ellips rechthoek", 55, 220);
g.setColor(Color.MAGENTA);
g.fillOval(175, 160, 100, 40);
g.setColor(Color.BLACK);
g.drawString("Gevulde ovaal", 185, 220);
g.drawRoundRect(325, 160, 50, 45, 90, 90);
g.drawString("Cirkel", 335, 225  );




    }
}
