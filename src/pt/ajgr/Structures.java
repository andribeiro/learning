package pt.ajgr;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Vector;

public class Structures {

    public static Structures structures = new Structures();

    public static void main(String[] args) {
//        structures.priorityQueue();
//        structures.vector_arrayList();
//        structures.stack();
//        structures.set();
//        structures.hashCollision();
        structures.switche(3);
    }

    private void switche(int dayOfWeek) {

        String dayType = switch (dayOfWeek) {
            case 1, 2, 3, 4, 5 -> {
                System.out.println("Working day");
                yield "Weekday-y";
            }
            case 6, 7 -> {
                System.out.println("Weekend day");
                yield "Weekend-y";
            }
            default -> throw new IllegalArgumentException("Invalid day of the week: " + dayOfWeek);
        };
        System.out.println(dayType);

        int name = 55;
        String result = switch (name) {
            case 2, 3 -> {
                System.out.println("Parent: " + name);
                yield "1";
            }
            default -> {
                System.out.println("default!!");
                yield "555";
            }
        };
        System.out.println("Res: " + result);


        System.out.println("******** JSON Block ********");
        String text = """
                {
                  "name": "John Doe",
                  "age": 45,
                  "address": "Doe Street, 23, Java Town"
                }
                """; // <-- no indentation if char is aligned with first "
        System.out.println(text);
    }

    private void priorityQueue() {

        // Creating empty priority queue
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);

        // Printing the top element of PriorityQueue
        System.out.println(pQueue.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQueue.poll());

        // Printing the top element again
        System.out.println(pQueue.peek());
    }

    private void stack() {
        Stack<String> stack = new Stack<>();

        stack.push("BMW");
        stack.push("Audi");
        stack.push("Ferrari");
        stack.push("Bugatti");
        stack.push("Jaguar");
        stack.pop();

        if (stack.isEmpty() == false) {
            System.out.println("The length of the array: " + stack.search(stack.peek()));
        }

        Iterator iterator = stack.iterator();
        while (iterator.hasNext()) {
            Object values = iterator.next();
            System.out.println(values);
        }
    }

    private void set() {
        HashSet<String> cars = new HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");

        System.out.println(cars.contains("BMW"));
        System.out.println(cars.remove("Volvos"));
        cars.clear();
    }

    private void vector_arrayList() {

        List<String> vector = new Vector<>();
        vector.add("vector");
        List<String> arrayList = new ArrayList<>();
        arrayList.add("arrayList");

        System.out.println(vector + " " + arrayList);
    }

    private void hashCollision() {
        System.out.println("lies".hashCode());
        System.out.println("foes".hashCode());

    }
}
