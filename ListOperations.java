//1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList and a
//LinkedList to perform the following operations with different functions directed as follows
//1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4. Accessing
//elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List size, 9. Iterating
//over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list




package ArrayList;

import java.util.*;

public class ListOperations {
    public static void main(String[] args) {

        // Creating ArrayList and LinkedList
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // 1. Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 2. Adding element at specific index
        arrayList.add(1, "Mango");
        linkedList.add(1, "Mango");

        // 3. Adding multiple elements
        List<String> moreFruits = Arrays.asList("Grapes", "Pineapple");
        arrayList.addAll(moreFruits);
        linkedList.addAll(moreFruits);

        // 4. Accessing elements
        System.out.println("Access element: " + arrayList.get(2));

        // 5. Updating elements
        arrayList.set(0, "Green Apple");
        linkedList.set(0, "Green Apple");

        // 6. Removing elements
        arrayList.remove("Banana");
        linkedList.remove("Banana");

        // 7. Searching elements
        System.out.println("Contains Apple? " + arrayList.contains("Apple"));

        // 8. List size
        System.out.println("Size: " + arrayList.size());

        // 9. Iterating using for-each
        System.out.println("Iterating ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // 10. Using Iterator
        System.out.println("Using Iterator:");
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 11. Sorting
        Collections.sort(arrayList);
        System.out.println("Sorted ArrayList: " + arrayList);

        // 12. Sublist
        System.out.println("Sublist: " + arrayList.subList(0, 2));

        // 13. Clearing the list
        arrayList.clear();
        linkedList.clear();

        System.out.println("After clear ArrayList: " + arrayList);
        System.out.println("After clear LinkedList: " + linkedList);
    }
}
