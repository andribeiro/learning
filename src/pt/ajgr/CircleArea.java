package pt.ajgr;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CircleArea {


    public static void main(String[] args) {
        System.out.println("Result= " + calculateCircleArea(4.4444));
    }

    public static BigDecimal calculateCircleArea(double radius) {

        if (radius < 0) {
            throw new IllegalArgumentException("radius can not be less than zero");
        }

        // pi * r^2

        return BigDecimal.valueOf(Math.PI * Math.pow(radius, 2))
                .setScale(4, RoundingMode.HALF_DOWN);

        // { 1, 2, 3, 4 }

    }
}