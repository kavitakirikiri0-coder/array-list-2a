package ArrayList;

import java.util.*;

public class SearchColour {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        if (colors.contains("Red")) {
            System.out.println("Red is available");
        } else {
            System.out.println("Red is not available");
        }
    }
}