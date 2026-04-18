
//2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for appending
//the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify your answer which
//one is better.

package StringOpertion;

public class StringPerformanceTest {
	

	    public static void main(String[] args) {

	        int iterations = 10000;

	        // 1. StringBuffer Test (Thread-safe, synchronized)
	        StringBuffer sbuffer = new StringBuffer();
	        long startTimeBuffer = System.nanoTime();

	        for (int i = 0; i < iterations; i++) {
	            sbuffer.append("AIET");
	        }

	        long endTimeBuffer = System.nanoTime();
	        long timeBuffer = endTimeBuffer - startTimeBuffer;

	        System.out.println("StringBuffer Time: " + timeBuffer + " ns");

	        // 2. StringBuilder Test (Not synchronized, faster)
	        StringBuilder sbuilder = new StringBuilder();
	        long startTimeBuilder = System.nanoTime();

	        for (int i = 0; i < iterations; i++) {
	            sbuilder.append("AIET");
	        }

	        long endTimeBuilder = System.nanoTime();
	        long timeBuilder = endTimeBuilder - startTimeBuilder;

	        System.out.println("StringBuilder Time: " + timeBuilder + " ns");

	        // Comparison
	        if (timeBuilder < timeBuffer) {
	            System.out.println("StringBuilder is faster than StringBuffer.");
	        } else {
	            System.out.println("StringBuffer is faster than StringBuilder.");
	        }
	    }
	}


