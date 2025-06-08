import java.awt.*; // Import the AWT package
public class BasicFrame {
    public static void main(String[] args) {
        // Step 1: Create a new Frame object.
        // The constructor can take a String argument for the window's title.
        Frame myFrame = new Frame("My First AWT Frame");

        // Step 2: Set the size of the frame.
        // setSize(width, height) defines the dimensions in pixels.
        myFrame.setSize(400, 300);
        // Step 3: Make the frame visible.
        // By default, frames are not visible. This method makes them appear on screen.
        myFrame.setVisible(true);
        System.out.println("Frame successfully created and displayed.");
    }
}
