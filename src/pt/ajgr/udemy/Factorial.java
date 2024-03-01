package pt.ajgr.udemy;

import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {

//        long start = System.currentTimeMillis();
//        long fLongPrimitive = factorial(56L);
//        long end = System.currentTimeMillis();
//        System.out.println(fLongPrimitive + " :: " + (end - start) + " Ms");

        long startL = System.currentTimeMillis();
        BigInteger fLong = factorial(BigInteger.valueOf(69L));
        long endL = System.currentTimeMillis();
        System.out.println(fLong + " :: " + (endL - startL) + " Ms");

       }

//    private static long factorial(long n) {
//        if (n == 1) {
//            return 1;
//        }
//        return n * factorial(n - 1);
//    }

    private static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }
        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
}
