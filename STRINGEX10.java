
/*Q10. Write a Java Program for Counting the number of words in a string using user defined function
countWords()*/

package StringOpertion;

public class STRINGEX10 {
	

	    public static int countWords(String str) {
	        if (str == null || str.trim().isEmpty()) {
	            return 0;
	        }
	        String[] words = str.trim().split("\\s+");
	        return words.length;
	    }

	    public static void main(String[] args) {
	        String str = "Java is easy to learn";
	        System.out.println("Word Count: " + countWords(str));
	    }
	}
	


