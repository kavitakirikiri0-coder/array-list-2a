package swings;   // REMOVE this line if your file is NOT inside "swings" folder

import javax.swing.*;
import java.awt.*;

public class HELLOWSWING {

    // Constructor
    HELLOWSWING() {
        JFrame frame = new JFrame("Hello Swing");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello! VI B, Welcome to Swing Programming", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 32));
        label.setForeground(Color.BLUE);

        frame.add(label);
        frame.setVisible(true);
    }

    // MAIN METHOD (VERY IMPORTANT)
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new HELLOWSWING());
    }
}
	
	


  



	    
	


