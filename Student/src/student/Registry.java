/*Marios Christodoulou, eeuab9
* Lab 2, Assessed Lab Work
* Object Oriented Programming in Java
 */
package student;

import java.util.*;

class Registry {
// Create linkedlist.

    LinkedList<Student> studentList;

    public Registry() {
// Initialise the linkedlist.
        studentList = new LinkedList<>();
    }

    /**
     * Adds a student to studentList
     */
    public void addStudent(Student aStudent) {
        studentList.add(aStudent);

    }

    /**
     * Find studentID with Iterator if found then delete
     */
    public void deleteStudent(String studentID) {
        Iterator<Student> itr = studentList.iterator();
        while (itr.hasNext()) {
            if (itr.next().getStudentID().equals(studentID)) {
                itr.remove();
                System.out.println("Student with ID " + studentID + " removed");
                break;
            }
            System.out.println("Student with ID " + studentID + " not found");
        }

    }

    /**
     * Override toString method
     */
    @Override
    public String toString() {
        return "[" + getClass().getName() + ", students=" + studentList + "]";

    }

    /**
     * String format for each student
     */
    public String format() {
        String s = "Registry\nCurrent Students of Bangor University:\n";
        for (Student st : studentList) {
            s = s + st.format() + "\n";
        }
        return s;
    }

}
