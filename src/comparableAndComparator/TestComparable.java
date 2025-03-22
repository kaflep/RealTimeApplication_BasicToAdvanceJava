package comparableAndComparator;

import java.util.*;

public class TestComparable {
    public static void main(String[] args) {
        ArrayList<ComparableExamples> empDetails = new ArrayList<>();
        empDetails.add(new ComparableExamples(11,"pratik","123456"));
        empDetails.add(new ComparableExamples(2,"devon", "12345"));
        empDetails.add(new ComparableExamples(17,"ardian", "2345678"));

        System.out.println(empDetails);
        Collections.sort(empDetails);
        System.out.println(empDetails);

    }
}
