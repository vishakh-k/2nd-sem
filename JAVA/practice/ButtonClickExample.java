import java.awt.*;
import java.awt.event.*;

public class ButtonClickExample extends Frame {
    Button btn;

    ButtonClickExample() {
        // Create a button
        btn = new Button("Click Me");

        // Set position and size (x, y, width, height)
        btn.setBounds(100, 80, 100, 30);

        // Add action when button is clicked
        btn.addActionListener(e -> System.out.println("Button was clicked!"));

        // Add button to the frame
        add(btn);

        // Frame settings
        setSize(300, 200);
        setLayout(null); // Absolute positioning
        setTitle("Button Click Demo");
        setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonClickExample();
    }
}
