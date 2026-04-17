
//Write a java program for getting different colors through ArrayList interface and remove
// the 2nd element and color "Blue" from the ArrayList
package ArrayList;

import java.util.*;

public class RemoveColour {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        colors.remove(1); // remove 2nd element
        colors.remove("Blue"); // remove Blue if exists

        System.out.println(colors);
    }
}
