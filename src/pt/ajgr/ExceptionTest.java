package pt.ajgr;

public class ExceptionTest {

    public static void main(String... args) {


        try {
            System.out.println("Hello");
            throw new NullPointerException();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            System.out.println("finally");
        }

        String result = new ExceptionTest().testMethod();
        System.out.println(result);

    }

    private String testMethod() {

        String result = "aaa";
        synchronized (result) {
            try {
//            throw new NullPointerException();
                System.out.println("System.exit(-1)");

                System.exit(-1);
            } catch (Exception ex) {
                result += "-catch";
            } finally {
                return result += "-finally";
            }
        }
    }
}
