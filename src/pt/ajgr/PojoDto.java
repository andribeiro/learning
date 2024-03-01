package pt.ajgr;

import java.io.Serializable;

public record PojoDto(String firstName,
                      String lastName,
                      int age,
                      int heightCm)
        implements Serializable {

    public static String country = "PRT";

    String getFullName() {
        return String.format("%s %s", firstName, lastName);
    }

    String getCountry() {
        return country;
    }

    public PojoDto {
        if (age < 0) {
            throw new IllegalArgumentException("age can't be less than 0");
        }
        if (heightCm < 0) {
            throw new IllegalArgumentException();
        }
    }
}

