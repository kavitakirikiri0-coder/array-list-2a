//4b. Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is pressed”
//depending upon the Jbutton either Srilanka or India is pressed by implementing the event handling
//mechanism with addActionListener( ).

package swings;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CountryButtonDemo {

	
	

	    public static void main(String[] args) {

	        // Create Frame
	        JFrame frame = new JFrame("Country Button Demo");
	        frame.setLayout(new FlowLayout());
	        frame.setSize(300, 150);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Create Label
	        JLabel label = new JLabel("Press a button");

	        // Create Buttons
	        JButton indiaBtn = new JButton("India");
	        JButton srilankaBtn = new JButton("Srilanka");

	        // Add ActionListener for India Button
	        indiaBtn.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                label.setText("India is pressed");
	            }
	        });

	        // Add ActionListener for Srilanka Button
	        srilankaBtn.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                label.setText("Srilanka is pressed");
	            }
	        });

	        // Add components to frame
	        frame.add(indiaBtn);
	        frame.add(srilankaBtn);
	        frame.add(label);

	        // Make visible
	        frame.setVisible(true);
	    }
	}

