package comparableAndComparator.comparator;


import java.util.Comparator;

public class IdComparator implements Comparator<ComparatorExample> {

    @Override
    public int compare(ComparatorExample o1, ComparatorExample o2) {

//        compare to o1 and o2
       return o1.getEmpId() - o2.getEmpId();
        // o1.getEmpId() is greater return +ve, o2.getEmpId is greater return -ve


//        if(o1.getEmpId() > o2.getEmpId()){ // swaps
//            return +1;
//        }
//        else if (o1.getEmpId() < o2.getEmpId()){ // no swap
//            return -1;
//        }
//        else{ // no swap
//            return 0;
//        }
    }
}
