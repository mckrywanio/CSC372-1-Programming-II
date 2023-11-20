//----------------------------------------------------
//Program Name: CriticalThinkingMod#6 Option 2
//Author: Michael C Krywanio
//Date: Nov 19 2023
//----------------------------------------------------
//Program Name: Student.java
//Description: 4 programs that will sort inputed student information into a array; rollnum, name, address.
//----------------------------------------------------
//Start
//Class Student
//    Define properties:
//        rollno as Integer
//        name as String
//        address as String

//    Constructor(rollno, name, address)
//        Initialize rollno, name, address with provided values

//    Method getRollno
//        Return rollno

//    Method getName
//        Return name

//    Method getAddress
//        Return address

//    Method toString
//        Return string representation of Student object
//End Class
//End
//-----------------------------------------------------
public class Student {
    int rollno;
    String name;
    String address;

    // Constructor
    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Getter methods for rollno, name, and address
    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    // To string method for easy printing
    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}