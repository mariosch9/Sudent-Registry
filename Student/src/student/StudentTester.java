/*Marios Christodoulou, eeuab9
* Lab 2, Assessed Lab Work
* Object Oriented Programming in Java
 */
package student;

public class StudentTester {

    public static void main(String[] args) {
        Student Steve = new Student("Steve", "Marriott", "1001PG", "BSc Mathematics");
        Student Sean = new Student("Sean", "Crossan", "1002PG", "BSc Computer Science");
        Student Alan = new Student("Alan", "McLachlan", "1003PG", "BSc Computer Information Systems");

        //tests what should be printed
        System.out.println("Expected:");
        System.out.printf("%-5s %-15s %-15s %-10s", "Steve", "Marriott", "1001PG", "BSc Mathematics");
        System.out.println();
        System.out.printf("%-5s %-15s %-15s %-10s", "Sean", "Crossan", "1002PG", "BSc Computer Science");
        System.out.println();
        System.out.printf("%-5s %-15s %-15s %-10s", "Alan", "McLachlan", "1003PG", "BSc Computer Information Systems");
        System.out.println("\n");

        //Prints out the inputed students
        System.out.println("Actual:");

        System.out.printf(Steve.format());
        System.out.print("\n");
        System.out.print(Sean.format());
        System.out.print("\n");
        System.out.print(Alan.format());
        System.out.print("\n");
        System.out.println("\n");

        System.out.println("Testing getForename() Expecting to see Steve. Actual Output:");
        System.out.println(Steve.getForeName());
    }

}
