import java.awt.*;
import java.awt.event.*;

public class MouseClickExample extends Frame implements MouseListener {

    MouseClickExample() {
        // Register mouse listener
        addMouseListener(this);

        // Frame settings
        setSize(300, 200);
        setTitle("Mouse Click Demo");
        setLayout(null); // Using absolute layout
        setVisible(true);
    }

    // When mouse is clicked
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    // Other methods (not used, but required to override)
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new MouseClickExample();
    }
}

class MyListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("Clicked!");
 }
}

button.addActionListener(new MyListener());

