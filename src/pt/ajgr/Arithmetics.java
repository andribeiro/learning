package pt.ajgr;

import java.math.BigInteger;

public class Arithmetics {

    public static void main(String[] args) {

        arithmetics();
    }

    private static void arithmetics() {

        System.out.println(Integer.MAX_VALUE);
        System.out.println();

        long start = System.currentTimeMillis();
        long jPrimitive = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            jPrimitive = jPrimitive + i;
        }
        long end = System.currentTimeMillis();

        System.out.println("long TimeMS: " + (end - start));
        System.out.println("long j: " + jPrimitive);

        System.out.println();

        start = System.currentTimeMillis();
        Long jLong = 0L;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            jLong = jLong + i;
        }
        end = System.currentTimeMillis();

        System.out.println("Long TimeMS: " + (end - start));
        System.out.println("Long j: " + jLong);

        System.out.println();

        start = System.currentTimeMillis();
        BigInteger jBig = BigInteger.ZERO;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            jBig = jBig.add(BigInteger.valueOf(i));
        }
        end = System.currentTimeMillis();

        System.out.println("BigInteger TimeMS: " + (end - start));
        System.out.println("BigInteger j: " + jBig);
    }
}
