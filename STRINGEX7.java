/*Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()*/


package StringOpertion;

public class STRINGEX7 {
	

	    public static String truncate(String str, int maxLength) {
	        if (str.length() <= maxLength) {
	            return str;
	        }
	        return str.substring(0, maxLength) + "...";
	    }

	    public static void main(String[] args) {
	        String str = "Java is a powerful programming language";
	        System.out.println("Truncated: " + truncate(str, 15));
	    }
	}


