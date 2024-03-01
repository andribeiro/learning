package pt.ajgr;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Write your answer here, and then test your code.
// Your job is to implement the findAnswer() method.

class Answer {

    // Change these boolean values to control whether you see
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    // Return the highest grade for the students with a specific major
    static int findAnswer(List<Student> students, String major) {

        // Your code goes here.
        Optional<Integer> maxInt = students.stream()
                .filter(s -> major.equals(s.getMajor()))
                .map(Student::getGrades)
                .flatMap(map -> map.values().stream())
                .max(Comparator.naturalOrder());

        return maxInt.orElse(0);
    }

}








