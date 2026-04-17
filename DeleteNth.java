//Write a java program for getting different colors through ArrayList interface and delete
//nth element from the ArrayList object by using remove by index


package ArrayList;


import java.util.*;

public class DeleteNth {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        int n = 1; // deleting 2nd element
        colors.remove(n);

        System.out.println(colors);
    }
}
