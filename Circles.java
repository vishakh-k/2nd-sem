import java.awt.*;
import java.applet.*;
/*
<applet code="Circles" width=300 height=150>
</applet>
*/
public class Circles extends Applet {
    public void paint(Graphics g) {
        g.drawOval(20, 20, 80, 80);     // Circle
        g.drawOval(120, 20, 120, 60);   // Ellipse
    }
}