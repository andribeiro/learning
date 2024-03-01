package pt.ajgr;

import java.util.*;
import java.util.logging.Logger;

/**
 * Created by ribeiro on 05-11-2016.
 */
public class Exec {

    private static final Logger log = Logger.getLogger(Exec.class.getSimpleName());

    public static void main(final String[] args) {

        final int N_NUM = 49;
        final int N_EST = 13;

        HashSet<Integer> resultNum = new HashSet<>();
        resultNum.add(17);
        resultNum.add(22);
        resultNum.add(26);
        resultNum.add(42);
        resultNum.add(46);
        Integer resultEst = 3;

        int numero = 22;
        Integer inteiro = numero;
        System.out.println(inteiro);


        final HashMap<Integer, Integer> mapNumeros = new HashMap<>();
        final HashMap<Integer, Integer> mapEstrelas = new HashMap<>();

        for (int i = 1; i <= N_NUM; i++) {
            mapNumeros.put(i, 0);
        }

        for (int i = 1; i <= N_EST; i++) {
            mapEstrelas.put(i, 0);
        }

        int hit = 0;
        for (int i = 0; i < 100; i++) { //100000000
            final HashSet<Integer> chaveNumeros = new HashSet<>();
            final HashSet<Integer> chaveEstrelas = new HashSet<>();

            while (chaveNumeros.size() != 5) {
                final int n = (int) (Math.round(new Random().nextDouble() * (N_NUM - 1)) + 1); //0-48 + 1 = 1-49 Numero
                chaveNumeros.add(n);
            }

            while (chaveEstrelas.size() != 1) {
                final int e = (int) Math.round(new Random().nextDouble() * (N_EST - 1)) + 1; //0-11 + 1 = 1-12 Estrela
                chaveEstrelas.add(e);
            }
//
            if (chaveEstrelas.contains(resultEst) && chaveNumeros.containsAll(resultNum) ) {
                System.out.println("!!Bingo!! Num: " + chaveNumeros + " Est: " + resultEst + " Hit: " + ++hit);
                System.out.println("Num_i: " + i);
            }

//            if (System.currentTimeMillis() % 25000L == 0) {
//                System.out.println("Ion: " +i);
//            }

            final List<Integer> numerosList = new ArrayList<>(chaveNumeros);
            Collections.sort(numerosList);

            final List<Integer> estrelasList = new ArrayList<>(chaveEstrelas);
            Collections.sort(estrelasList);

//            System.out.print("N --> "); //6
//            log.info("N --> ");
            StringBuilder aux = new StringBuilder();
            for (final Integer elem : numerosList) {
//                System.out.print(elem + " " + (elem.toString().length() == 1 ? " " : ""));
                aux.append(elem).append(" ").append(elem.toString().length() == 1 ? " " : "");
                mapNumeros.put(elem, mapNumeros.get(elem) + 1);
            }
//            System.out.print("    E --> ");
            aux.append("    E --> ");
            for (final Integer elem : estrelasList) {
//                System.out.print(elem + " " + (elem.toString().length() == 1 ? " " : ""));
                aux.append(elem).append(" ").append(elem.toString().length() == 1 ? " " : "");
                mapEstrelas.put(elem, mapEstrelas.get(elem) + 1);
            }
//            System.out.println();
//            log.info(aux.toString());
        }

//        System.out.println();
//
//        Stack<String> s = new Stack<>();
//
//        s.add("André");
//        s.add("Marta");
//        System.out.println(s.pop());
//        s.push("Maria");
//        System.out.println(s.peek());
//        System.out.println(s.size() + " <> " + s.capacity());
    }
}
