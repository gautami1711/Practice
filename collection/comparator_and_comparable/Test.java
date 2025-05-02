package collection.comparator_and_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 25));
        students.add(new Student("Bob", 20));
        students.add(new Student("Charlie", 23));

        //sorting using comparable(natural order -by age)
        Collections.sort(students);
        for (Student s:students){
            System.out.println(s);
        }
        System.out.println("Sorted by name (Comparator):");

        //sorting using comparator- using name
        Collections.sort(students,new StudentComparator());
        for (Student s:students){
            System.out.println(s);
        }
    }
}
