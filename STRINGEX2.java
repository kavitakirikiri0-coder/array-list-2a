/*Q2. Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences()*/


package StringOpertion;

public class STRINGEX2 {
	

	    public static int countOccurrences(String mainStr, String subStr) {
	        int count = 0, index = 0;

	        while ((index = mainStr.indexOf(subStr, index)) != -1) {
	            count++;
	            index += subStr.length();
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        String mainStr = "java is fun java is powerful java";
	        String subStr = "java";

	        System.out.println("Occurrences: " + countOccurrences(mainStr, subStr));
	    }
	}

