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