import java.applet.*;
import java.awt.*;

/*
<applet code="MultiLine" width=300 height=100>
</applet>
*/

public class MultiLine extends Applet {
    int curY = 0; // current Y position
    int appletWidth;

    public void init() {
        Font f = new Font("SansSerif", Font.PLAIN, 12);
        setFont(f);
        appletWidth = getSize().width; // get the width of the applet
    }

    public void paint(Graphics g) {
        FontMetrics fm = g.getFontMetrics();
        nextLine("This is on line one.", g, fm);
        nextLine("This is on line two. This is on same line. This, too.", g, fm); // combined sameLine
        nextLine("This is on line three.", g, fm);
    }

    // Advance to next line and align text right
    void nextLine(String s, Graphics g, FontMetrics fm) {
        curY += fm.getHeight(); // move to next line
        int textWidth = fm.stringWidth(s);
        int startX = appletWidth - textWidth; // align right
        g.drawString(s, startX, curY);
    }
}
