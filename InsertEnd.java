package LinkedListPrograms;

	import java.util.*;

	public class InsertEnd {
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();

	        list.add("Red");
	        list.add("Blue");

	        list.offerLast("Pink"); // add at end

	        System.out.println(list);
	    }
	}

