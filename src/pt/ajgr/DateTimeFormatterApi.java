package pt.ajgr;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Map;

public class DateTimeFormatterApi {

    static Map<TextStyle, Locale> map = Map.of(
            TextStyle.FULL, Locale.US,
            TextStyle.SHORT, Locale.FRENCH,
            TextStyle.NARROW, Locale.GERMAN
    );

    public static void main(String[] args) {

        for (Map.Entry<TextStyle, Locale> entry : map.entrySet()) {

            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                    .appendPattern("yyyy-MM-dd hh:mm ")
                    .appendDayPeriodText(entry.getKey())    // at night, du soir, abends, etc.
                    .toFormatter(entry.getValue());

            String formattedDateTime = now.format(formatter);
            System.out.println(formattedDateTime);
        }
    }
}
