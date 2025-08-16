import java.awt.*;
public class FrameDimensions {
    public static void main(String[] args) {
        Frame frame = new Frame("Custom Sized Frame"); // Create frame with a title
        // Set the frame's dimensions to 500 pixels wide and 250 pixels tall.
        // This makes the window wider than it is tall.
        frame.setSize(500, 250);
        frame.setVisible(true); // Display the frame
        System.out.println("Frame with specific dimensions created and shown.");
    }
}
