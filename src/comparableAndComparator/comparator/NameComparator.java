package comparableAndComparator.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<ComparatorExample> {
    @Override
    public int compare(ComparatorExample o1, ComparatorExample o2) {
        // we must use for string comparison .compareTo() method
        return o1.getName().compareTo(o2.getName());
    }
}
