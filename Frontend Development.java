import javax.swing.*;

public class FrontendDevelopmentExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Simple Frontend Example");
        frame.setSize(400, 300); // Set size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation
        
        // Create a JPanel
        JPanel panel = new JPanel();
        
        // Create a JLabel
        JLabel label = new JLabel("Welcome to Java Frontend Development");
        
        // Add label to panel
        panel.add(label);
        
        // Add panel to frame
        frame.add(panel);
        
        // Set frame visibility
        frame.setVisible(true);
    }
}
