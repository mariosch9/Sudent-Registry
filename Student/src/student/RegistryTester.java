/*Marios Christodoulou, eeuab9
* Lab 2, Assessed Lab Work
* Object Oriented Programming in Java
 */
package student;

public class RegistryTester {

    public static void main(String[] args) {

//  Print main heading.
        System.out.print("Registry Tester");
        System.out.print("\n");
        System.out.print("***************");
        System.out.print("\n");

// testing the 3 studens
        Registry r = new Registry();
        Student Steve = new Student("Steve", "Marriott", "1001PG", "BSc Mathematics");
        Student Sean = new Student("Sean", "Crossan", "1002UG", "BSc Computer Science");
        Student Alan = new Student("Alan", "McLachlan", "1003UG", "BSc Computer Information Systems");

//  Prints out each student.
        r.addStudent(Steve);
        r.addStudent(Sean);
        r.addStudent(Alan);

//Prints out all the stored students.
        System.out.print(r.format());

    }
}
