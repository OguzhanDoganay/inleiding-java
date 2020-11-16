import java.applet.Applet;
import java.awt.*;

public class Praktijkhfd6 extends Applet {
double cijfer1, cijfer2, cijfer3, gemiddelde, eind;
int gemiddelde2;




    public void init() {
    cijfer1 = 5.9;
    cijfer2 = 6.3;
    cijfer3 = 6.9;
    gemiddelde = (cijfer1 + cijfer2 + cijfer3)/3*10;
    gemiddelde2 = (int) gemiddelde/10;
    eind = gemiddelde2;



    }


    public void paint(Graphics g) {

g.drawString("Het gemiddelde is " + eind, 50, 50);





    }
}
