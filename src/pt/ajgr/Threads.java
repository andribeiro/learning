package pt.ajgr;

public class Threads implements Runnable {

    public static void main(String[] args) {
        System.out.println("Main: " + Thread.currentThread().getId());

        Thread thread = new Thread(new Threads());

        thread.start();
    }

    private void printAny() {
        System.out.println("PrintAny: " + Thread.currentThread().getId());
    }

    @Override
    public void run() {
        new Threads().printAny();
    }
}
