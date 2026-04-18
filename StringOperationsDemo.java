
/*2 a. Develop a java program for performing various string operations with different string handling
functions directed as follows
/String Creation and Basic Operations, Length and Character Access, String Comparison, String Searching,
Substring Operations , String Modification, Whitespace Handling, String Concatenation, String
Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and startsWith() and
endsWith()*/

package StringOpertion;

	import java.util.*;

	public class StringOperationsDemo {

	    public static void main(String[] args) {

	        // 1. String Creation and Basic Operations
	        String str1 = "Hello";
	        String str2 = "World";
	        String str3 = "  Java Programming  ";

	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);

	        // 2. Length and Character Access
	        System.out.println("Length of str1: " + str1.length());
	        System.out.println("Character at index 1: " + str1.charAt(1));

	        // 3. String Comparison
	        String str4 = "hello";
	        System.out.println("str1 equals str4: " + str1.equals(str4));
	        System.out.println("str1 equalsIgnoreCase str4: " + str1.equalsIgnoreCase(str4));

	        // 4. String Searching
	        System.out.println("Index of 'o' in str1: " + str1.indexOf('o'));
	        System.out.println("Contains 'World': " + str2.contains("World"));

	        // 5. Substring Operations
	        System.out.println("Substring of str2 (0-3): " + str2.substring(0, 3));

	        // 6. String Modification
	        System.out.println("Replace 'l' with 'x' in str1: " + str1.replace('l', 'x'));
	        System.out.println("Uppercase str2: " + str2.toUpperCase());
	        System.out.println("Lowercase str2: " + str2.toLowerCase());

	        // 7. Whitespace Handling
	        System.out.println("Before trim: '" + str3 + "'");
	        System.out.println("After trim: '" + str3.trim() + "'");

	        // 8. String Concatenation
	        String result = str1 + " " + str2;
	        System.out.println("Concatenated String: " + result);

	        // 9. String Splitting
	        String sentence = "Java is fun to learn";
	        String[] words = sentence.split(" ");
	        System.out.println("Splitted words:");
	        for (String word : words) {
	            System.out.println(word);
	        }

	        // 10. StringBuilder Demo
	        StringBuilder sb = new StringBuilder("Java");
	        sb.append(" Programming");
	        sb.insert(4, " Language");
	        sb.replace(0, 4, "Advanced");
	        System.out.println("StringBuilder result: " + sb);

	        // 11. String Formatting
	        String name = "Amruta";
	        int age = 20;
	        String formatted = String.format("Name: %s, Age: %d", name, age);
	        System.out.println("Formatted String: " + formatted);

	        // 12. Validate Email
	        String email = "example@gmail.com";
	        boolean isValid = email.contains("@") &&
	                          email.startsWith("example") &&
	                          email.endsWith(".com");

	        System.out.println("Email: " + email);
	        System.out.println("Is valid email? " + isValid);
	    }
	}
	


