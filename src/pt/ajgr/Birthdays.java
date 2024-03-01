package pt.ajgr;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import static java.time.Month.FEBRUARY;
import static java.time.Month.NOVEMBER;
import static java.time.Month.OCTOBER;
import static java.time.Month.SEPTEMBER;

public final class Birthdays {

    public static void main(final String[] args) {

        ageInTime("Marta de Almeida", LocalDateTime.of(1977, NOVEMBER, 11, 15, 0));
        ageInTime("André Ribeiro", LocalDateTime.of(1982, SEPTEMBER, 17, 15, 30));
        ageInTime("Maria de Almeida Ribeiro", LocalDateTime.of(2016, FEBRUARY, 2, 18, 58));
        ageInTime("Ana de Almeida Ribeiro", LocalDateTime.of(2019, OCTOBER, 19, 21, 50));

    }

    private static void ageInTime(final String name, final LocalDateTime birthDate) {

        final LocalDateTime now = LocalDateTime.now();
        final Duration duration = Duration.between(birthDate, now);

        long years = ChronoUnit.YEARS.between(now, now.plus(duration));
        long months = ChronoUnit.MONTHS.between(now, now.plus(duration) );

        System.out.println(name + " has: ");
        System.out.println(years + " years ");
        System.out.println(months + " months ");
        System.out.println(duration.toDays() + " days ");
        System.out.println(duration.toHours() + " hours ");
        System.out.println(duration.toMinutes() + " minutes ");
        System.out.println();
    }


}
