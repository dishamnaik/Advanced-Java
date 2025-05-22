/*Write a Java program to display elements and their positions in a linked list ( using 
l_listobj.get(p) )*/

package linkedlist1c;

import java.util.LinkedList;

public class DisplayElementsWithPosition4c {
    public static void main(String[] args) {
        // Create a LinkedList and add elements
        LinkedList<String> l_listobj = new LinkedList<>();
        l_listobj.add("Apple");
        l_listobj.add("Banana");
        l_listobj.add("Cherry");
        l_listobj.add("Date");

        // Display elements with their positions
        System.out.println("Elements and their positions in the LinkedList:");
        for (int i = 0; i < l_listobj.size(); i++) {
            System.out.println("Position " + i + ": " + l_listobj.get(i));
        }
    }
}
