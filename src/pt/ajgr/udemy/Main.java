package pt.ajgr.udemy;

import java.util.HashSet;
import java.util.Set;

public class Main {

//    public static void main(final String[] args) {
//
//        LinkedList myLinkedList = new LinkedList(1);
//        myLinkedList.makeEmpty();
//        myLinkedList.append(1);
//        myLinkedList.append(2);
//
//        myLinkedList.printAll();
//    }

    public static void main(String[] args) {

        int a = 33;
        Set<Integer> values = new HashSet<>();
        values.add(a);



        // Create a new LinkedList and append values to it
        LinkedList2 ll = new LinkedList2(3);
        ll.append(5);
        ll.append(8);
        ll.append(10);
        ll.append(2);
        ll.append(1);

        // Print the list before partitioning
        System.out.println("LL before partitionList:");
        ll.printList(); // Output: 3 5 8 10 2 1

        // Call the partitionList method with x = 5
        ll.partitionList(8);

        // Print the list after partitioning
        System.out.println("LL after partitionList:");
        ll.printList(); // Output: 3 2 1 5 8 10

        /*
            EXPECTED OUTPUT:
            ----------------
            LL before partition_list:
            3
            5
            8
            10
            2
            1
            LL after partition_list:
            3
            2
            1
            5
            8
            10

        */

    }
}
