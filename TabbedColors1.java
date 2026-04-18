/*5b. Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN and display
the concerned color whenever the specific tab is selected in the Pan.*/



package swings;

	import javax.swing.*;
	import java.awt.*;

	public class TabbedColors1 {
	    public static void main(String[] args) {
	        JFrame frame = new JFrame("RGB Tabs");
	        JTabbedPane tabbedPane = new JTabbedPane();

	        JPanel redPanel = new JPanel();
	        redPanel.setBackground(Color.RED);

	        JPanel bluePanel = new JPanel();
	        bluePanel.setBackground(Color.BLUE);

	        JPanel greenPanel = new JPanel();
	        greenPanel.setBackground(Color.GREEN);

	        tabbedPane.addTab("RED", redPanel);
	        tabbedPane.addTab("BLUE", bluePanel);
	        tabbedPane.addTab("GREEN", greenPanel);

	        frame.add(tabbedPane);
	        frame.setSize(400, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	}


