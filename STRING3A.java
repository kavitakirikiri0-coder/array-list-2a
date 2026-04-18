
/*3a. Develop a java program for performing various string operations with different string handling
functions directed as follows:
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation,
String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
startsWith() and endsWith()*/

package StringOpertion;
import java.util.*;

public class STRING3A {
	

	

	    public static void main(String[] args) {

	        // 1. String Creation
	        String str1 = "Hello";
	        String str2 = "World";
	        String str3 = "  Java Programming  ";

	        // 2. Length and Character Access
	        System.out.println("Length: " + str1.length());
	        System.out.println("Character at index 1: " + str1.charAt(1));

	        // 3. String Comparison
	        System.out.println("Equals: " + str1.equals("hello"));
	        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase("hello"));

	        // 4. String Searching
	        System.out.println("Index of 'l': " + str1.indexOf('l'));
	        System.out.println("Contains 'or': " + str2.contains("or"));

	        // 5. Substring
	        System.out.println("Substring: " + str2.substring(1, 4));

	        // 6. Modification
	        System.out.println("Replace: " + str1.replace('l', 'x'));
	        System.out.println("Uppercase: " + str2.toUpperCase());

	        // 7. Whitespace Handling
	        System.out.println("Before trim: '" + str3 + "'");
	        System.out.println("After trim: '" + str3.trim() + "'");

	        // 8. Concatenation
	        String result = str1 + " " + str2;
	        System.out.println("Concatenated: " + result);

	        // 9. Splitting
	        String sentence = "Java is easy";
	        String[] words = sentence.split(" ");
	        for (String word : words) {
	            System.out.println(word);
	        }

	        // 10. StringBuilder Demo
	        StringBuilder sb = new StringBuilder("Java");
	        sb.append(" Programming");
	        System.out.println("StringBuilder: " + sb);

	        // 11. Formatting
	        String formatted = String.format("Name: %s, Age: %d", "Amruta", 20);
	        System.out.println(formatted);

	        // 12. Email Validation
	        String email = "example@gmail.com";
	        boolean valid = email.contains("@") &&
	                        email.startsWith("example") &&
	                        email.endsWith(".com");

	        System.out.println("Email valid: " + valid);
	    }
	}
	
	


