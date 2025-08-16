import java.awt.*;
import java.applet.*;
/*
<applet code="Arcs" width=300 height=200>
</applet>
*/
public class Arcs extends Applet {
    public void paint(Graphics g) {
        g.drawArc(20, 20, 100, 100, 0, 90);     // Quarter arc
        g.fillArc(140, 20, 100, 100, 0, 180);   // Filled arc
    }
}