import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Teacher teacher10 = new FullTimeTeacher();
        Teacher teacher11 = new PartTimeTeacher();


        UniversityDB universityDB1 = new UniversityDB();

        universityDB1.universityDbInit();

        Scanner menu = new Scanner(System.in);
        Scanner operation = new Scanner(System.in);
        boolean exit = false;
        int opcion = 0;
        while (!exit) {
            System.out.println("Welcome select your option:");
            System.out.println("1. Print all the professors");
            System.out.println("2. Print all the classes");
            System.out.println("3. Create a new student");
            System.out.println("4. Create a new class");
            System.out.println("5. Search By student id");
            System.out.println("6. Exit");

            opcion = menu.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("Your current professor list is: ");
                    universityDB1.displayTeachers();
                    break;
                case 2:
                    universityDB1.displayMatters();
                    boolean exit2 = false;
                    int option2 = 0;
                    while (!exit2) {
                        System.out.println("Select your option:");
                        System.out.println("1. Select a class to view");
                        System.out.println("2. Exit");

                        option2 = menu.nextInt();

                        switch (option2) {
                            case 1:
                                String className = "";
                                do {
                                    System.out.println("Enter the class to review: ");
                                    className = operation.nextLine();
                                    universityDB1.displayMatterDetails(className);
                                } while (!universityDB1.validateMatter(className));

                                break;
                            case 2:
                                exit2 = true;
                                break;
                        }
                    }
                    break;
                case 3:
                    Student student20 = new Student();
                    System.out.println("Enter student name: ");
                    String StudentName = operation.nextLine();
                    student20.setName(StudentName);
                    System.out.println("Enter student ID: ");
                    int StudentId = Integer.parseInt(operation.nextLine());
                    student20.setId(StudentId);
                    System.out.println("Enter student age: ");
                    int StudentAge = Integer.parseInt(operation.nextLine());
                    student20.setAge(StudentAge);
                    universityDB1.addStudent(student20);
                    String studentClassName = "";
                    do {
                        System.out.println("Enter the class name: ");
                        studentClassName = operation.nextLine();
                    } while (!universityDB1.validateMatter(studentClassName));
                    universityDB1.addStudentToMatter(studentClassName, student20);
                    break;
                case 4:
                    Matter matter5 = new Matter();
                    System.out.println("Enter the class name");
                    String name = operation.nextLine();
                    matter5.setName(name);
                    System.out.println("Enter the class room");
                    int classRoom = Integer.parseInt(operation.nextLine());
                    matter5.setClassRoom(classRoom);
                    int professorId = -1;
                    while (universityDB1.validateTeacher(professorId) == null) {
                        System.out.println("Enter the professor id:");
                        professorId = Integer.parseInt(operation.nextLine());
                        matter5.setTeacher(universityDB1.newClassTeacher(professorId));
                    }

                    String validator = "y";
                    do {
                        System.out.println("Enter the student id:");
                        int studentId = Integer.parseInt(operation.nextLine());
                        matter5.setStudents(universityDB1.newStudentsList(studentId));
                        System.out.println("Do you want add a new student?");
                        validator = operation.nextLine();
                    } while (validator.contains("y"));
                    universityDB1.matterList.add(matter5);
                    break;
                case 5:
                    System.out.println("Enter the ID number to search");
                    int id = Integer.parseInt(operation.nextLine());
                    universityDB1.displayStudentInformation(id);
                    break;
                case 6:
                    exit = true;
                    break;


            }

        }
    }
}