import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionJava {
    public static void main(String[] args) {

        List<String> students = Arrays.asList("Abhiraj Singh", "Ram Kumar",
                "Jay Ram", "Shivam Singh", "Pawan Singh", "Ajay Singh Solanki",
                "Vishal ", "Snehasish", " Amit Patel"
        );

        System.out.println("Original List:");
        students.forEach(System.out::println);

        //Sorting in Ascending Order
        Collections.sort(students);
        System.out.println("\nSorting in Ascending Order:");
        students.forEach(System.out::println);

        //Custom sorting Comparator by length
        Collections.sort(students,
                (o1, o2) -> o1.length() - o2.length());
        System.out.println("\nCustom sorting By Comparator ");
        students.forEach(System.out::println);


        //Sorting in Descending Order
        students.sort(Collections.reverseOrder());
        System.out.println("\nSorting in Descending Order");

        students.forEach(System.out::println);


        //Searching - binary search
        Collections.sort(students);

        int index = Collections.binarySearch(students, "Abhiraj Singh");
        System.out.println("\nSearching By Binary ");

        students.forEach(System.out::println);


        //Reversing
        Collections.reverse(students);
        System.out.println("\nAfter reversing Order");
        students.forEach(System.out::println);


        //Shuffling
        Collections.shuffle(students);
        System.out.println("\nAfter Shuffling");
        students.forEach(System.out::println);


        //Swapping
        Collections.swap(students, 0, students.size() - 1);
        System.out.println("\nAfter Swapping");

        students.forEach(System.out::println);


    }
}
