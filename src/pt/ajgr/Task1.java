package pt.ajgr;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task1 {


    public static void main(String[] args) {

        String test = "PPPPRRSSSSS";

        System.out.println("Solution task1 is " + solution(test));

    }

    public static int solution(String giovanni) {
        // Implement your solution here

        int turns = giovanni.length();


        String fGestureR = buildFrancosSequence(turns, "R");
        String fGestureS = buildFrancosSequence(turns, "S");
        String fGestureP = buildFrancosSequence(turns, "P");

        int[] frankScores = {
                calculateFrancoScore(turns, fGestureR, giovanni),
                calculateFrancoScore(turns, fGestureS, giovanni),
                calculateFrancoScore(turns, fGestureP, giovanni)
        };

        return  Arrays.stream(frankScores).reduce(Integer::max).orElse(0);
    }

    private static int calculateFrancoScore(int turns, String franco, String giovanni) {

        int fScore = 0;
        for (int i = 0; i < turns; i++) {
            char fCard = franco.charAt(i);
            char gCard = giovanni.charAt(i);

            Card fTurn = Card.fromChar(fCard);
            Card gTurn = Card.fromChar(gCard);

            if (fTurn.win == gTurn.value) {
                fScore = fScore + 2;
            }

            if (fTurn == gTurn) {
                fScore++;
            }
        }

        return fScore;
    }

    private static String buildFrancosSequence(int turns, String gest) {
        StringBuilder result = new StringBuilder();
        IntStream.range(0, turns).forEach(t -> result.append(gest));
        return result.toString();
    }

    public enum Card {
        R('R', 'S'),
        S('S', 'P'),
        P('P', 'R');

        final char value;
        final char win;

        Card(char value, char win) {
            this.value = value;
            this.win = win;
        }

        public static Card fromChar(char ex) {
            for (Card c : Card.values()) {
                if (c.value == ex) {
                    return c;
                }
            }
            return null;
        }
    }

    //R<->S
    //S<->P
    //P<->R
}
