package pt.ajgr;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TaskTest {

    public static void main(String[] args) {

        SecureRandom random;
        try {
            random = SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        int size = random.nextInt(1000000);
        Integer[] integerList = new Integer[size];
        IntStream.range(0, size)
                .forEach(i -> integerList[i] = random.nextInt(-100000, 100000));
        int[] test = {-1, 5, 3};

        System.out.println("Solution TaskTest is " + solution(integerList));
    }

    public static int solution(Integer[] A) {
        // Implement your solution here
        if (A == null || A.length == 0) {
            throw new IllegalArgumentException("Array provided can not be null");
        }

        //we will get the highest value from array in the first place
        int max = Arrays.stream(A).reduce(Integer::max).orElse(0);

        final Set<Integer> arraySet =
                Arrays.stream(A)
//                        .boxed()
                        .collect(Collectors.toSet());

        if (max<0) {
            return 1;
        }

        for (int i = 1; i < max; i++) {
            if (!arraySet.contains(i)) {
                return i;
            }
        }

        return max + 1;
    }
}
