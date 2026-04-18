/* Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
and punctuation) using user defined function isPalindrome():*/


package StringOpertion;

public class STRINGEX4 {
	

	    public static boolean isPalindrome(String str) {
	        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	        String reversed = new StringBuilder(str).reverse().toString();
	        return str.equals(reversed);
	    }

	    public static void main(String[] args) {
	        String str = "Madam";
	        System.out.println("Is Palindrome: " + isPalindrome(str));
	    }
	}


