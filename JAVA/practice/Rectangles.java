import java.applet.*;
import java.awt.*;

/*
<applet code="Rectangles" width=300 height=200>
</applet>
*/

public class Rectangles extends Applet {
    public void paint(Graphics g) {
        g.drawRect(20, 20, 100, 60);
        g.fillRect(140, 20, 100, 60);
    }
}
