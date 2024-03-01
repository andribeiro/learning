package pt.ajgr;

import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class JavaExamples {

    public static void main(final String[] args) {

//        // 1.
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        for(int i=0;i<array.length;i++) {
//            shiftArrayBy(array, i);
//        }
//
//        // 2.
//        String[] tokens = new String[] {"2", "1", "+", "3", "*"};
////        String[] tokens = new String[] {"4", "13", "5", "/", "+"};
//        System.out.println(evalRPN(tokens));
//
//        // 3.
//        System.out.println(areStringsIsomorphic("abcdefg", "1234567"));

        // 6.
       
    }



    private static boolean areStringsIsomorphic(String s, String t) {
        Objects.requireNonNull(s, "s can not be null");
        Objects.requireNonNull(t, "t can not be null");
        if (s.length() != t.length()) {
            return false;
        }

        Map<String, String> charsMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            String sChar = String.valueOf(s.charAt(i));
            String tChar = String.valueOf(t.charAt(i));

            String tValue = charsMap.get(sChar);
            if (tValue != null && !tValue.equals(tChar)) {
                return false;
            }
            charsMap.put(sChar, tChar);
        }

        return true;
    }

    private static int evalRPN(String[] tokens) {
        Objects.requireNonNull(tokens, "token can not be null");

        final String oper = "+-*/";
        Deque<Integer> stack = new ArrayDeque<>();

        for (String t : tokens) {
            if (oper.contains(t)) {
                int a = stack.pop();
                int b = stack.pop();

                switch (t) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(b - a);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(b / a);
                        break;
                    default:
                        throw new IllegalArgumentException("???");
                }
            } else {
                stack.push(Integer.valueOf(t));
            }
        }

        return stack.pop();
    }

    private static void shiftArrayBy(int[] array, int k) {
        Objects.requireNonNull(array, "array can not be null");
        if (k < 0) {
            throw new IllegalArgumentException("k can not be lower than 0!");
        }

        int n = array.length;
        if (n < k) {
            throw new IllegalArgumentException("Order can not be bigger than array size!");
        }
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int offset = i + k;
            if (offset < n) {
                result[offset] = array[i];
            } else {
                //i=4
                result[offset - n] = array[i];
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
