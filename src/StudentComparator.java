//----------------------------------------------------
//Program Name: CriticalThinkingMod#6 Option 2
//Author: Michael C Krywanio
//Date: Nov 19 2023
//----------------------------------------------------
//Program Name: StudentComparator.java
//Description: 4 programs that will sort inputed student information into a array; rollnum, name, address.
//----------------------------------------------------
//Start
//
//Class StudentComparator
//    Method compare(student1, student2)
//        Compare student1's rollno with student2's rollno
//        Return comparison result
//End Class
//End
//-----------------------------------------------------
import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getRollno(), s2.getRollno());
    }
}