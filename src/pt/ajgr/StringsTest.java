package pt.ajgr;

public class StringsTest {

    public static void main(String args[]) {


        Integer i = 70;
        String seventy = "70";
        String sevStr = i.toString().intern();

        System.out.println(seventy.equals(sevStr));
        System.out.println(seventy == sevStr);

    }
}
