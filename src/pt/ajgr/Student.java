package pt.ajgr;

import java.util.Collections;
import java.util.Map;

final class Student {
    private final String firstname;
    private final String lastname;
    private final String major;
    private final Map<String, Integer> grades;

    public Student(String firstname, String lastname, String major, Map<String, Integer> grades) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.major = major;
        this.grades = Collections.unmodifiableMap(grades);
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getMajor() {
        return major;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }
}
