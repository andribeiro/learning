package pt.ajgr;

import java.util.LinkedList;

public class Task3 {

    public static void main(String[] args) {

        String s = "abc";
        String t = "def";
        String u = "badcef";

        System.out.println("Solution task3 is " + solution(s, t, u));
    }

    public static boolean solution(String s, String t, String u) {

        if (s == null || t == null || u == null) {
            System.out.println("String can not be null");
            return false;
        }

        int sSize = s.length();
        int tSize = t.length();
        int uSize = u.length();

        if (sSize + tSize != uSize) {
            System.out.println("String S+T must be EQUAL to U");
            return false;
        }

        // Create a Linked List with all final word U
        LinkedList<String> uLinkedList = new LinkedList<>();
        for(String elem : u.split("")) {
            uLinkedList.add(elem);
        }



        //for each of 2 words, we remove letter by letter from the Linked List
        for(String elem : s.split("")) {
            uLinkedList.remove(elem);
        }
        for(String elem : t.split("")) {
            uLinkedList.remove(elem);
        }

        // If the Linked List is empty, then we're able to remove all chars, one-by-one, then there's a match
        return uLinkedList.isEmpty();
    }

}
