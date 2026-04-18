
/*Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined
function isNumeric()*/


package StringOpertion;

public class STRINGEX8 {
	

	    public static boolean isNumeric(String str) {
	        if (str == null || str.isEmpty()) return false;

	        for (char c : str.toCharArray()) {
	            if (!Character.isDigit(c)) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        String str = "12345";
	        System.out.println("Is Numeric: " + isNumeric(str));
	    }
	}

