package collection.comparator_and_comparable;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.toString().compareTo(toString().toString());
    }
}
