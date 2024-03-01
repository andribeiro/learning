package pt.ajgr;

public class SoftLxTest {

    public static void main(final String[] args) {

        final int[] array = new int[]{1, 2, -7, -2, 7, 2, -2};

        /*
        Calculates number of pairs in array.
        Pair is two numbers which when added together result in zero.
        Ex.:
          2 and -2
          -7 and 7
         */
        final ArrayCounter counter = new PairsInArrayCounter(array);

        System.out.println(counter.getCount()); //should print 2
    }


    static final class PairsInArrayCounter implements ArrayCounter {

        final int[] array;

        public PairsInArrayCounter(final int[] array) {
            this.array = array;
        }

        @Override
        public int getCount() {

            if (array == null) {
                throw new IllegalArgumentException("array can't be null");
            }

            // Key: positive number in the array - Value: The sum of the same abs value
            java.util.Map<Integer, java.util.List<Integer>> result = new java.util.HashMap<>();
            int counter = 0;

            java.util.HashSet<String> stringSet = new java.util.HashSet<>();
            stringSet.add("André");
            boolean leo = stringSet.add("Leo2");

            for (int i=0;i<array.length;i++) {

                int positiveNum = Math.abs(array[i]);

                java.util.List<Integer> numValueList = result.get(positiveNum);
                if (numValueList == null) {
                    java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
                    list.add(array[i]);
                    result.put(positiveNum, list);
                } else {
                    numValueList.add(array[i]);
                    result.put(positiveNum, numValueList);

                    counter++;
                    result.remove(positiveNum);
                }
            }


            for (java.util.List<Integer> num : result.values()) {
                counter = counter + Math.round(num.size() / 2);
            }

            return counter;
        }


    }

    interface ArrayCounter {
        int getCount();
    }

    interface ArrayCounterExt extends ArrayCounter {
        int getDupes();
    }
}
