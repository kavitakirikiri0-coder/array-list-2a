
/*Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user
defined function isNullOrEmpty().*/

package StringOpertion;

public class STRINGEX1 {
	

	    public static boolean isNullOrEmpty(String str) {
	        return str == null || str.trim().isEmpty();
	    }

	    public static void main(String[] args) {
	        String str = "   ";
	        System.out.println("Is Null or Empty: " + isNullOrEmpty(str));
	    }
	}
	


