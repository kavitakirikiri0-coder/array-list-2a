//Write a java program for getting different colors through ArrayList interface and sort them
//using Collections.sort( ArrayListObj)

package ArrayList;

import java.util.*;

public class SubListExample {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        List<String> sub = colors.subList(0, 2);

        System.out.println(sub);
    }
}
