 /* Q3. Write a Java Program for Reversing the characters in a string using user defined function
reverseString().*/

package StringOpertion;

public class STRINGEX3 {

	

	    public static String reverseString(String str) {
	        StringBuilder sb = new StringBuilder(str);
	        return sb.reverse().toString();
	    }

	    public static void main(String[] args) {
	        String str = "Java";
	        System.out.println("Reversed: " + reverseString(str));
	    }
	}

