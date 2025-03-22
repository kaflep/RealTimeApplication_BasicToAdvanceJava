package comparableAndComparator.comparator;

import comparableAndComparator.ComparableExamples;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparator {
    public static void main(String[] args) {

        ArrayList<ComparatorExample> empDetails = new ArrayList<>();
        empDetails.add(new ComparatorExample(11,"pratik","123456"));
        empDetails.add(new ComparatorExample(2,"devon", "12345"));
        empDetails.add(new ComparatorExample(17,"ardian", "2345678"));
        empDetails.add(new ComparatorExample(22,"jhumpa","234432"));

        System.out.println(empDetails);
        Collections.sort(empDetails,new IdComparator());
        // or  that way
        System.out.println(empDetails);
        //empDetails.sort(new IdComparator());
       // System.out.println(empDetails);

//        ArrayList<ComparatorExample> studentName = new ArrayList<>(empDetails);
//        studentName.sort(new NameComparator());
//        System.out.println(studentName);
    }
}
