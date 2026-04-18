
/*Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function
capitalizeWords() */

package StringOpertion;

public class STRINEX6 {
	

	    public static String capitalizeWords(String str) {
	        String[] words = str.split(" ");
	        StringBuilder result = new StringBuilder();

	        for (String word : words) {
	            if (word.length() > 0) {
	                result.append(Character.toUpperCase(word.charAt(0)))
	                      .append(word.substring(1).toLowerCase())
	                      .append(" ");
	            }
	        }
	        return result.toString().trim();
	    }

	    public static void main(String[] args) {
	        String str = "java programming language";
	        System.out.println("Capitalized: " + capitalizeWords(str));
	    }
	}
	


