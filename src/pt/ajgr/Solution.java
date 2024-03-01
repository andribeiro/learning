package pt.ajgr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Created by ribeiro on 06-11-2016.
 */
public class Solution {

    public static void main(final String[] args) {

//        stairCase(44);

//        int numbers[] = {3,5,2,8,9,8,4,4,7,1};
//        sum(10, numbers);

        //1-Good
//        String a[] = { "", "a", "*_", "b", null, "c", "e"};
//        String b[] = {"e", "a", "c", null, "b", "", "*_",};
//        System.out.println(sameContents(a, b));

        //2-Good
        String[] input = {"car", "cheating", null, "dale", "deal", "lead", "listen", "silent", "teaching", "aaab", "baaa", "abaa", "abaa", "aaba"};
        friendlyWords(input);
    }

    private static String[] friendlyWords(String[] input) {

        if (input == null) {
            System.out.println("Wrong input !!");
            return null;
        }

        HashMap<String, List<String>> map = new HashMap<>();

        for (String strElemA : input) {
            for (String strElemB : input) {

                if (strElemA != null && strElemB != null
                        && !strElemA.equals(strElemB) && strElemA.length() == strElemB.length()) {

                    if (checkForFriendly(strElemA, strElemB)) {

                        List<String> listWordA = Arrays.asList(strElemA.split("")); //This could be refactor to avoid split twice (here and inside the method)
                        Collections.sort(listWordA);

                        String key = listWordA.toString(); // The map key will be a unique ordered word. This result should be improved...

                        List<String> list = map.get(key);
                        if (list == null) {
                            list = new ArrayList<>();
                            list.add(strElemA);
                            list.add(strElemB);
                            map.put(key, list);
                        }
                        else {
                            if (!list.contains(strElemA)) {
                                list.add(strElemA);
                            }
                            if (!list.contains(strElemB)) {
                                list.add(strElemB);
                            }
                        }
                    }
                }
            }
        }

        // Orders each List
        for (List<String> listElem : map.values()) {
            Collections.sort(listElem);
        }

        // Prints the result
        for (String strKeyElem : map.keySet()) {
            for (String strWordElem : map.get(strKeyElem)) {
                System.out.print(strWordElem + " ");
            }
            System.out.println();
        }

        return new String[]{}; // TODO: convert to array
    }

    /**
     * Check if two words are friendly. Null check must be done before the method call.
     * @param strElemA
     * @param strElemB
     * @return boolean
     */
    private static boolean checkForFriendly(String strElemA, String strElemB) {
        String[] aWordArray = strElemA.split("");
        String[] bWordArray = strElemB.split("");

        HashSet<String> set = new HashSet<>(Arrays.asList(aWordArray));
        Arrays.asList(bWordArray).forEach(set::remove);

        return set.isEmpty();
    }

    private static boolean sameContents(String[] arrayA, String[] arrayB) {

        if (arrayA == null || arrayB == null) {
            return false;
        }

        if (arrayA.length != arrayB.length) {
            return false;
        }

        HashSet<String> setA = new HashSet<>(Arrays.asList(arrayA));

        HashSet<String> setB = new HashSet<>(Arrays.asList(arrayB));

        return setA.equals(setB);
    }
//        for (int i = 0; i < arrayA.length; i++) {
//            if (arrayA[i] != arrayB[i])
//                return false;
//        }
//
//        return true;

    private static int sum(int numbers_size, int... numbers) {
        if (numbers_size < 1 || numbers_size > 100000) {
            System.out.println("Invalid numbers_size: "+numbers_size+" !!");
            return 0;
        }

        int check = 0;
        int total = 0;
        for (int elem : numbers) {
            if (elem > numbers_size) {
                System.out.println("Invalid numbers[] value: "+elem+" !!");
                return 0;
            }
            total = total + elem;
            check++;
        }

        if (check != numbers_size) {
            System.out.println("Invalid numbers[] size: "+numbers_size+" !!");
            return 0;
        }

        System.out.println("Total sum: " + total);
        return 1;
    }

    private static void stairCase(int n) {
        if (n < 1 || n > 100) {
            System.out.println("Invalid N !!!");
            return;
        }

        for (int i=1;i<=n;i++) {

            int spaces = n-i;
            StringBuilder str = new StringBuilder();

            for (int j=0;j<spaces;j++) {
                str.append(" ");
            }
            for (int k=0;k<i;k++) {
                str.append("#");
            }
            System.out.println(str.toString());
        }
    }
}
