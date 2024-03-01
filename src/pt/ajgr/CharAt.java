package pt.ajgr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class CharAt {

    // WRITE GROUPANAGRAMS METHOD HERE //
    //                                 //
    //                                 //
    //                                 //
    //                                 //
    /////////////////////////////////////


    public static void main(String[] args) {
        System.out.println(removeDuplicates(List.of(1, 1, 2, 3, 3)));

    }

    public static List<List<String>> groupAnagrams(String[] strings) {

        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String str : strings) {

            char[] chars = str.toCharArray();

            Arrays.sort(chars);

            String canonical = String.join("", new String(chars));

            List<String> list = anagramGroups.get(canonical);
            if (list == null) {
                List<String> list2 = new ArrayList<>();
                list2.add(str);
                anagramGroups.put(canonical, list2);
            } else {
                list.add(str);
                anagramGroups.put(canonical, list);
            }
        }


        return null;
    }

    public static List<Integer> removeDuplicates(List<Integer> myList) {

        Set<Integer> set = new HashSet<>();
        set.addAll(myList);

        return set.stream().toList();
    }

}
