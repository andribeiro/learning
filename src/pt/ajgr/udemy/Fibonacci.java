package pt.ajgr.udemy;

public class Fibonacci {

    static int counter = 0;
    static Integer[] memo = new Integer[500];

    public static void main(String[] args) {

        System.out.println("Fib=" + fib(100));
        System.out.println("counter=" + counter);
    }

    public static int fib(int n) {
        counter++;

        if (n == 0 || n == 1) {
            return n;
        }
        if (memo[n - 1] != null) {
            return memo[n];
        }

        memo[n] = fib(n - 1) + fib(n - 2);
        return memo[n];
    }
}
