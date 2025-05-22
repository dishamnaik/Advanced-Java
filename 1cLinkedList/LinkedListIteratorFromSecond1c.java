/* 1c. Linked List Programs
 * 
 * 1. Write a Java program to iterate through all elements in a linked list starting at the 
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))*/

package linkedlist1c;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteratorFromSecond1c {
    public static void main(String[] args) {
        // Create a LinkedList and add some elements
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        // Start iterating from the 2nd element (index 1)
        ListIterator<String> iterator = list.listIterator(1);

        System.out.println("Iterating from the 2nd element:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
