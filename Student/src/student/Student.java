/*Marios Christodoulou, eeuab9
* Lab 2, Assessed Lab Work
* Object Oriented Programming in Java
*/
package student;

//declaring private methods in the main class
public class Student {

    private String foreName;
    private String surName;
    private String studentID;
    private String degreeScheme;

   //The default values of each subclass
    public Student() {
        foreName = null;
        surName = null;
        studentID = null;
        degreeScheme = null;
    }

    /**
     *
     * @param foreName holds the forename of the student
     * @param surName holds the surname of the student
     * @param studentID holds the ID of the student
     * @param degreeScheme holds the degreeScheme of the student
     */
    public Student(String foreName, String surName, String studentID, String degreeScheme) {
        this.foreName = foreName;
        this.surName = surName;
        this.studentID = studentID;
        this.degreeScheme = degreeScheme;
    }

    /**
     * gets forename
     * @return and returns it
     */
    public String getForeName() {
        return foreName;
    }

    /**
     * gets the surname
     * @return and returns it
     */
    public String getSurName() {
        return surName;
    }

    /**
     * gets the studentID
     * @return and returns it
     */
    public String getStudentID() {
        return studentID;
    }

    /**
     * gets the degreeScheme
     * @return and returns it
     */
    public String getDegreeScheme() {
        return degreeScheme;
    }

    public String toString() {
        return format();
    }

    /**
     * 
     * @return returns the output in the below formated way with the appropriate spacing
     */
    public String format() {

        return String.format("%-5s %-15s %-15s %-10s ", getForeName(), getSurName(), getStudentID(), getDegreeScheme());
    }

}
