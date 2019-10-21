/*Marios Christodoulou, eeuab9
* Lab 2, Assessed Lab Work
* Object Oriented Programming in Java
*/
package student;


import java.util.*;
public class RegistryCLI {

    LinkedList<Student> studentList;

    private Registry theRegistry;

// setup Scanner for input
    private final Scanner in = new Scanner(System.in);

    public RegistryCLI(Registry theRegistry) {
        this.theRegistry = theRegistry;

    }

    /**
     * Main menu user input from range 1 - 4
     */
    public void doMenu() {

        boolean flag = true;
//  Boolean flag, set to true to start, if false the break loop

        while (flag) {
            System.out.println("Registry Main Menu");
            System.out.printf("*******************\n");
            System.out.println("1. Add Student");
            System.out.println("2. Delete a Student");
            System.out.println("3. Print Registry");
            System.out.println("4. Quit");
            int choice = getValidInput(4);

            /**
             * Switch method to select different menu options
             */
            switch (choice) {
                case 1:
                    doAddStudent();
                    break;
                case 2:
                    doDeleteStudent();
                    break;
                case 3:
                    doPrintRegistry();
                    break;
                case 4:
                    flag = false;
                    break;
            }
        }
    }

    /**
     * add student with user input for each field required surname, studentID
     * and degree scheme. option to add another student
     */
    private void doAddStudent() {
        boolean shouldRun = true;
        while (shouldRun) {
            System.out.println("/n");
            System.out.println("Add New Student");
            System.out.println("**************\n");
            System.out.print("Enter forename      :> ");
            String foreName = in.nextLine();
            System.out.print("Enter surname       :> ");
            String surName = in.nextLine();
            System.out.print("Enter student ID    :> ");
            String studentID = in.nextLine();
            System.out.print("Enter degree scheme :> ");
            String degreeScheme = in.nextLine();
            theRegistry.addStudent(new Student(foreName, surName, studentID, degreeScheme));
            System.out.println("");
            System.out.print("Enter another? (Y/N):> ");
            if (in.nextLine().toLowerCase().equals("n")) {
                shouldRun = false;
            }
        }
    }

// Delete student if student ID matches
    private void doDeleteStudent() {
        System.out.println("Delete s Student");
        System.out.println("**************\n");
        System.out.printf("\n");
        System.out.println("Please enter the ID number of the student you wish to delete");
        String studentID = in.nextLine();
        theRegistry.deleteStudent(studentID);

    }

// print number of students in list
    private void doPrintRegistry() {
        System.out.println("These are the students:");
        System.out.println("\n");

        System.out.println(theRegistry.format());
    }

    /**
     * check for input in range from 1 - 4 if not in range then message user
     * with warning of invalid input
     */
    private int getValidInput(int maxVal) {
        boolean validInput = false;
        int choice = 0;
        while (!validInput) {
            System.out.print("Select option [1, 2, 3, 4] :> ");
            //System.out.println("");
            String input1 = in.nextLine();
            try {
                choice = Integer.parseInt(input1);
                if (choice < maxVal + 1) {
                    validInput = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("WARNING: INVALID INPUT!!!!");
                validInput = false;
            }
        }
        return choice;
    }

}
