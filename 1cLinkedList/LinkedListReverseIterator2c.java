/*2.Write a Java program to iterate a linked list in reverse order (using 
objlist.descendingIterator()) */
package linkedlist1c;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListReverseIterator2c {
    public static void main(String[] args) {
        // Create a LinkedList and add elements
        LinkedList<String> objlist = new LinkedList<>();
        objlist.add("Monday");
        objlist.add("Tuesday");
        objlist.add("Wednesday");
        objlist.add("Thursday");
        objlist.add("Friday");

        // Use descendingIterator() to iterate in reverse
        Iterator<String> reverseIterator = objlist.descendingIterator();

        System.out.println("Iterating in reverse order:");

        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}
