//----------------------------------------------------
//Program Name: CriticalThinkingMod#6 Option 2
//Author: Michael C Krywanio
//Date: Nov 19 2023
//----------------------------------------------------
//Program Name: MergeSort.java
//Description: 4 programs that will sort inputed student information into a array; rollnum, name, address.
//----------------------------------------------------
//Start
//
//Class MergeSort
//    Method sort(students, comparator)
//        If list size is less than 2
//            Return
//        Calculate middle index of the list
//        Split list into two halves, left and right
//        Recursively sort left half
//        Recursively sort right half
//        Merge sorted halves

//    Method merge(students, left, right, comparator)
//        Initialize indices for iterating over left, right, and students
//        While both left and right have elements
//            Compare current elements of left and right
//            Add smaller element to the students list
//            Increment respective index
//        Copy any remaining elements from left and right to students
//End Class
//
//End
//-----------------------------------------------------
import java.util.ArrayList;
import java.util.Comparator;

public class MergeSort {
    public static void sort(ArrayList<Student> students, Comparator<Student> comparator) {
        if (students.size() < 2) {
            return;
        }
        int mid = students.size() / 2;
        ArrayList<Student> left = new ArrayList<>(students.subList(0, mid));
        ArrayList<Student> right = new ArrayList<>(students.subList(mid, students.size()));

        sort(left, comparator);
        sort(right, comparator);
        merge(students, left, right, comparator);
    }

    private static void merge(ArrayList<Student> students, ArrayList<Student> left, ArrayList<Student> right, Comparator<Student> comparator) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (comparator.compare(left.get(i), right.get(j)) <= 0) {
                students.set(k++, left.get(i++));
            } else {
                students.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) {
            students.set(k++, left.get(i++));
        }

        while (j < right.size()) {
            students.set(k++, right.get(j++));
        }
    }
}