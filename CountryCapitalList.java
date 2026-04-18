package swings;


	import javax.swing.*;
	import java.awt.*;
	import javax.swing.event.*;
	import java.util.HashMap;

	public class CountryCapitalList {
	    public static void main(String[] args) {

	        JFrame frame = new JFrame("Country List");

	        String[] countries = {
	            "USA", "India", "Vietnam", "Canada", "Denmark",
	            "France", "Great Britain", "Japan", "Africa",
	            "Greenland", "Singapore"
	        };

	        // Capital mapping
	        HashMap<String, String> capitals = new HashMap<>();
	        capitals.put("USA", "Washington D.C.");
	        capitals.put("India", "New Delhi");
	        capitals.put("Vietnam", "Hanoi");
	        capitals.put("Canada", "Ottawa");
	        capitals.put("Denmark", "Copenhagen");
	        capitals.put("France", "Paris");
	        capitals.put("Great Britain", "London");
	        capitals.put("Japan", "Tokyo");
	        capitals.put("Africa", "No single capital"); // continent
	        capitals.put("Greenland", "Nuuk");
	        capitals.put("Singapore", "Singapore");

	        JList<String> list = new JList<>(countries);
	        JScrollPane scrollPane = new JScrollPane(list);

	        list.addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    String selected = list.getSelectedValue();
	                    System.out.println("Country: " + selected +
	                            " | Capital: " + capitals.get(selected));
	                }
	            }
	        });

	        frame.add(scrollPane, BorderLayout.CENTER);
	        frame.setSize(300, 250);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	}


