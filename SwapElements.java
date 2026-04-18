 // Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
//Collections.swap(l_list, 0, 2))
package LinkedListPrograms;    
import java.util.*;

public class SwapElements {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");

        // Swapping 1st and 3rd element
        Collections.swap(list, 0, 2);

        System.out.println(list);
    }
}



