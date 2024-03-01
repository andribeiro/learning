package pt.ajgr;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;

public class TesteAR {

    public TesteAR() {
    }

    public static void main(String[] args) {

        Calendar instance = Calendar.getInstance();
        System.out.println(instance);
        instance.add(Calendar.DAY_OF_MONTH, 60);
        System.out.println(instance.toInstant());

        LocalDateTime of = LocalDateTime.of(LocalDate.of(2022, 2, 29), LocalTime.of(1, 0, 0));
        ZonedDateTime zonedDateTime = of.atZone(ZoneId.systemDefault());

        System.out.println(zonedDateTime);


//		int[] numArray = new int[5];
//		numArray[0] = (int) Math.round(Math.random()*100);
//		numArray[1] = (int) Math.round(Math.random()*100);
//		numArray[2] = (int) Math.round(Math.random()*100);
//		numArray[3] = (int) Math.round(Math.random()*100);
//		numArray[4] = (int) Math.round(Math.random()*100);
//		System.out.println();
//
//		System.out.println();
//
//
//		int a = 0;
//		while (true) {
////			if (numArray[a] > 49) {
////				numArray[a] = (int) Math.round(Math.random() * 100);
//
//				System.out.println("Num: ?"); //  + (int) Math.round(Math.random() * 100) + a);
////			}
////			a++;
//		}

    }

}
