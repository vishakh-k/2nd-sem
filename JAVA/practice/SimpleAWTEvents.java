import java.awt.*;
import java.awt.event.*;

public class SimpleAWTEvents extends Frame implements KeyListener, MouseListener {

    String msg = "";
    int x = 50, y = 100;

    SimpleAWTEvents() {
        addKeyListener(this);       // Key event
        addMouseListener(this);     // Mouse event

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose(); // Close window
            }
        });

        setSize(300, 200);
        setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawString(msg, x, y);
    }

    // KeyListener methods
    public void keyTyped(KeyEvent e) {
        msg = "Key Typed: " + e.getKeyChar();
        repaint();
    }
    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}

    // MouseListener methods
    public void mouseClicked(MouseEvent e) {
        msg = "Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new SimpleAWTEvents();
    }
}
