
/*5a. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark,
France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and display them on console
whenever the countries are selected on the list.*/


package swings;

	import javax.swing.*;
	import java.awt.*;
	import javax.swing.event.*;

	public class CountryListDemo {

	    public static void main(String[] args) {

	        JFrame frame = new JFrame("Country List");
	        frame.setSize(300, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        String countries[] = {
	            "USA", "India", "Vietnam", "Canada", "Denmark",
	            "France", "Great Britain", "Japan", "Africa",
	            "Greenland", "Singapore"
	        };

	        JList<String> list = new JList<>(countries);
	        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

	        // Event handling
	        list.addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    System.out.println("Selected Countries: " + list.getSelectedValuesList());
	                }
	            }
	        });

	        frame.add(new JScrollPane(list));
	        frame.setVisible(true);
	    }
	}


