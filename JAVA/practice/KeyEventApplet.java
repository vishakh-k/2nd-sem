import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="KeyEventApplet" width=300 height=200></applet>
*/

public class KeyEventApplet extends Applet implements KeyListener {
    String msg = "";

    public void init() {
        addKeyListener(this);
        setBackground(Color.white);
        requestFocus();
    }

    public void keyPressed(KeyEvent ke) {
        msg = "Key Pressed: " + ke.getKeyChar();
        repaint();
    }

    public void keyReleased(KeyEvent ke) {
    }

    public void keyTyped(KeyEvent ke) {
    }

    public void paint(Graphics g) {
        g.drawString(msg, 20, 100);
    }
}
