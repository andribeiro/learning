package pt.ajgr;

public class Task2 {

    public static void main(String[] args) {

        String  test = "dsfkjsfhewiuhdwkbfdkfewfewfefsdsfsfds";

        System.out.println("Solution task2 is " + solution(test));
    }

    public static int solution(String S) {

        // Implement your solution here
        String aaa = "aaa";

        if (S.contains(aaa)) {
            return -1;
        }

        int total = 0;
        int aNum = 0;
        for(String elem : S.split("")) {
            if ("a".equals(elem)) {
                aNum++;
            } else {
                total = total + (2 - aNum);
                aNum = 0;
            }
        }

        total = total + (2 - aNum);

        return total;
    }

}
