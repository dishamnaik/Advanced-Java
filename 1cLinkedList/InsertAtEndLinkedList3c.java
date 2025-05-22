/* 3. Write a Java program to insert the specified element at the end of a linked list.( using 
l_listobj.offerLast("Pink"))*/

package linkedlist1c;

import java.util.LinkedList;

public class InsertAtEndLinkedList3c {
    public static void main(String[] args) {
        // Create a LinkedList and add initial elements
        LinkedList<String> l_listobj = new LinkedList<>();
        l_listobj.add("Red");
        l_listobj.add("Green");
        l_listobj.add("Blue");

        // Print original list
        System.out.println("Original LinkedList: " + l_listobj);

        // Insert "Pink" at the end using offerLast()
        l_listobj.offerLast("Pink");

        // Print updated list
        System.out.println("LinkedList after inserting 'Pink' at the end: " + l_listobj);
    }
}
