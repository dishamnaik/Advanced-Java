/* 5. Write a Java program that swaps two elements ( first and third elements ) in a linked list  ( using
 Collections.swap(l_list, 0, 2)) */

package linkedlist1c;

import java.util.Collections;
import java.util.LinkedList;

public class SwapElementsInLinkedList5c {
    public static void main(String[] args) {
        // Create a LinkedList and add elements
        LinkedList<String> l_list = new LinkedList<>();
        l_list.add("One");
        l_list.add("Two");
        l_list.add("Three");
        l_list.add("Four");

        // Print original list
        System.out.println("Original LinkedList: " + l_list);

        // Swap the first (index 0) and third (index 2) elements
        Collections.swap(l_list, 0, 2);

        // Print updated list
        System.out.println("LinkedList after swapping 1st and 3rd elements: " + l_list);
    }
}
