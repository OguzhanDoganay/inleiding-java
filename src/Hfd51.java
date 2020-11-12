import java.applet.Applet;
import java.awt.*;

public class Hfd51 extends Applet {
Color vulkleur;
int breedte;
int hoogte;
Color lijnkleur;



    public void init() {
setBackground(Color.white);
vulkleur = Color.MAGENTA;
breedte = 100;
hoogte = 40;
lijnkleur = Color.black;



    }

    public void paint(Graphics g) {
        g.drawString("lijn",90, 60);
        g.drawLine(50, 40, 150, 40);
        g.drawRect(50, 80, breedte, hoogte);
        g.drawString("Rechthoek", 75, 140 );
        g.setColor(vulkleur);
        g.fillRect(175, 80, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawString("Gevulde rechthoek", 175, 140);
        g.drawOval(175, 80, breedte, hoogte);
        g.setColor(Color.magenta);
        g.fillArc(300, 80, breedte, hoogte, 0, 45);
        g.setColor(lijnkleur);
        g.drawOval(300, 80, breedte, hoogte);
        g.drawString("Fillarc gebruikt", 300, 140);
        g.drawRoundRect(50, 160, breedte, hoogte, 30, 30);
        g.drawString("Ellips rechthoek", 55, 220);
        g.setColor(vulkleur);
        g.fillOval(175, 160, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawString("Gevulde ovaal", 185, 220);
        g.drawRoundRect(325, 160, 50, 45, 90, 90);
        g.drawString("Cirkel", 335, 225  );










    }
}
