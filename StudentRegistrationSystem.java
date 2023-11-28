import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
    class Student {
        private static int UID = 12500;
        private int registrationNumber;
        private String studentId;
        private String firstName;
        private String middleName;
        private String lastName;
        private String motherName;
        private String gender;
        private String DateOfBirth;
        private int age;
        private String nationality;
        private String regional;
        private String zone;
        private String woreda;
        private String kebele;
        private String BirthPlace;
        private String nameInDanger;
        private String economicStatus;
        private String phoneNumber;
        public Student(String studentId, String firstName,
                       String middleName, String lastName,
                       String motherName, String gender,String DateOfBirth,
                       int age, String nationality,
                       String regional, String zone,
                       String woreda, String kebele,
                       String BirthPlace, String nameInDanger,
                       String economicStatus, String phoneNumber)
        {
            this.registrationNumber = getUID();
            this.studentId = studentId;
            this.firstName = firstName;
            this.middleName = middleName;
            this.lastName = lastName;
            this.motherName = motherName;
            this.gender = gender;
            this.DateOfBirth = DateOfBirth;
            this.age = age;
            this.nationality = nationality;
            this.regional = regional;
            this.zone = zone;
            this.woreda = woreda;
            this.kebele = kebele;
            this.BirthPlace = BirthPlace;
            this.nameInDanger = nameInDanger;
            this.economicStatus = economicStatus;
            this.phoneNumber = phoneNumber;
        }
        public int getRegistrationNumber() {
            return registrationNumber;
        }
        public String getStudentId() {
            return studentId;
        }
        public String getFirstName() {
            return firstName;
        }
        public String getMiddleName() {
            return middleName;
        }
        public String getLastName() {
            return lastName;
        }
        public String getMotherName() {
            return motherName;
        }
        public String getGender() {return gender;}
        public String getDateOfBirth(){return DateOfBirth;}
        public int getAge() {
            return age;
        }
        public String getNationality() {
            return nationality;
        }
        public String getRegional() {
            return regional;
        }
        public String getZone() {
            return zone;
        }
        public String getWoreda() {
            return woreda;
        }
        public String getKebele() {
            return kebele;
        }
        public String getBirthPlace(){return BirthPlace;}
        public String getNameInDanger() {
            return nameInDanger;
        }
        public String getEconomicStatus() {
            return economicStatus;
        }
        public String getPhoneNumber() {
            return phoneNumber;
        }
        private static int getUID() {
            return UID++;
        }
    }

    class StudentRegistrationSystem {
        private List<Student> students; // to serve as a container to store a collection of Student objects.
        public StudentRegistrationSystem() {
            students = new ArrayList<>();
        }
        public void registerStudent(String studentId, String firstName,
                                    String middleName, String lastName,
                                    String motherName, String gender,String DateOfBirth,
                                    int age, String nationality,String regional,
                                    String zone, String woreda,
                                    String kebele,String BirthPlace,
                                    String nameInDanger,
                                    String economicStatus, String phoneNumber) {
            Student newStud = new Student(studentId, firstName,
                                              middleName, lastName,
                                              motherName, gender,DateOfBirth,age,
                                              nationality, regional,
                                              zone, woreda,
                                              kebele, regional,
                                              nameInDanger,
                                              economicStatus, phoneNumber);

            students.add(newStud);
            //This new student is then added to the students list using the add method of the List interface.
            System.out.println("     You are Successfully Registered\uD83D\uDC4D.");
            System.out.println();
        }
        public void displayAllStudents() {
            //The displayAllStudents method uses a for-each loop to iterate through the students list
            if (students.isEmpty()==true) {

                System.out.println("  No One Student is registered,Please REGISTER student first!");
                System.out.println();
            }
            else{

                System.out.println("    These is list of students successfully registered :   ");
                System.out.println();
            for (Student student : students) {
                System.out.println("|-------------------------------------|------------------------|");
                System.out.println("|UID:                                 | " + student.getRegistrationNumber());
                System.out.println("|-------------------------------------|------------------------|");
                System.out.println("|Student ID:                          |  " + student.getStudentId());
                System.out.println("|-------------------------------------|------------------------|");
                System.out.println("|FullName:                            |" + student.getFirstName() + " "
                                               + student.getMiddleName() + " "+student.getLastName());
                System.out.println("|-------------------------------------|------------------------|");
                System.out.println("|Mother's Name:                       |" + student.getMotherName());
                System.out.println("|-------------------------------------|------------------------|");
                System.out.println("|Gender:                              |" + student.getGender());
                System.out.println("|-------------------------------------|------------------------|");
                System.out.println("|DateOfBirth EC:                      |" + student.getDateOfBirth());
                System.out.println("|-------------------------------------|------------------------|");
                System.out.println("|Age:                                 |" + student.getAge());
                System.out.println("|-------------------------------------|------------------------|");
                System.out.println("|Nationality:                         | " + student.getNationality());
                System.out.println("|-------------------------------------|------------------------|");
                System.out.println("|Regional:                            |" + student.getRegional());
                System.out.println("|-------------------------------------|------------------------|");
                System.out.println("|Zone:                                |" + student.getZone());
                System.out.println("|-------------------------------------|------------------------|");
                System.out.println("|Woreda:                              |" + student.getWoreda());
                System.out.println("|-------------------------------------|------------------------|");
                System.out.println("|Kebele:                              | " + student.getKebele());
                System.out.println("|-------------------------------------|------------------------|");
                System.out.println("|Birth Place:                         | " + student.getBirthPlace());
                System.out.println("|-------------------------------------|------------------------|");
                System.out.println("|person called in times of emergency: |" + student.getNameInDanger());
                System.out.println("|-------------------------------------|------------------------|");
                System.out.println("|Economic Status:                     |" + student.getEconomicStatus());
                System.out.println("|-------------------------------------|------------------------|");
                System.out.println("|Phone Number:                        |" + student.getPhoneNumber());
                System.out.println("|-------------------------------------|------------------------|");
            }
                }
        }

        private static String getValidStringInput(Scanner input) {
            while (true) {
                String userInput = input.nextLine();
                if (userInput.matches("[a-zA-Z]+")) {
                    return userInput;  // Valid string input
                } else {
                    System.out.println("Invalid input should contain only letters. Please try again\n enter correct again");
                }
            }
        }

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            StudentRegistrationSystem RG = new StudentRegistrationSystem();

                try {


                    while (true) {
                        System.out.println();
                        System.out.println("         IF YOU WANT TO RIGISTER A NEW STUDENTS \uD83D\uDC47: ");
                        System.out.println("\u001B[35m|-----------------********************-----------------------------|");
                        System.out.println("\u001B[7m|\u001B[1m WELL COME TO HARAMAYA UNIVERSITY STUDENT REGISTRATION SYSTEMS    |");
                        System.out.println("|------------------------------------------------------------------|");
                        System.out.println("\u001B[31m|       \uD83D\uDC49To Register a new student press number 1                 |");
                        System.out.println("|------------------------------------------------------------------|");
                        System.out.println("\u001B[33m|       \uD83D\uDC49 Display all registered students press number 2          |");
                        System.out.println("|------------------------------------------------------------------|");
                        System.out.println("\u001B[36m|       \uD83D\uDC49 To Exit press number 3                                  |");
                        System.out.println("|------------------------------------------------------------------|");
                        System.out.print("       Enter your choice and follow above instruction \uD83D\uDC46: ");
                        System.out.println();

                        int choice = input.nextInt();
                        input.nextLine(); // consume the newline character
                        switch (choice) {

                            case 1:
                                while (true) {
                                    try {
                                        System.out.print("\nEnter student ID: \n\n\n\n\n");
                                        String studentId = input.nextLine();
                                        Integer.parseInt(studentId);
                                        System.out.print("Enter student first name: ");
                                        String firstName = getValidStringInput(input);
                                        System.out.print("Enter student middle name: ");
                                        String middleName = getValidStringInput(input);
                                        System.out.print("Enter student last name: ");
                                        String lastName = getValidStringInput(input);
                                        System.out.print("Enter mother's name: ");
                                        String motherName = getValidStringInput(input);
                                        System.out.print("Enter gender: ");
                                        String gender = getValidStringInput(input);
                                        System.out.println("Enter Date of Birth in EC");
                                        String DateOfBirth = input.nextLine();
                                        System.out.print("Enter age: ");
                                        int age = input.nextInt();
                                        input.nextLine();
                                        System.out.print("Enter nationality: ");
                                        String nationality = getValidStringInput(input);
                                        System.out.print("Enter regional: ");
                                        String regional = getValidStringInput(input);
                                        System.out.print("Enter zone: ");
                                        String zone = getValidStringInput(input);
                                        System.out.print("Enter woreda: ");
                                        String woreda = getValidStringInput(input);
                                        System.out.print("Enter kebele: ");
                                        String kebele = input.nextLine();
                                        System.out.println("Enter Birth Place: ");
                                        String BirthPlace = getValidStringInput(input);
                                        System.out.print("Enter name a person called in times of emergency: ");
                                        String nameInDanger = getValidStringInput(input);
                                        System.out.print("Enter economic status:\nlowLevel\nmiddleLevel\nhighLevel\n");
                                        String economicStatus = getValidStringInput(input);
                                        System.out.print("Enter phone number: ");
                                        String phoneNumber = input.nextLine();
                                        Integer.parseInt(phoneNumber);
                                        input.nextLine();

                                        RG.registerStudent(studentId, firstName,
                                                middleName, lastName,
                                                motherName, gender, DateOfBirth, age,
                                                nationality, regional,
                                                zone, woreda, kebele,
                                                BirthPlace, nameInDanger,
                                                economicStatus, phoneNumber);
                                        break;
                                    } catch (Exception e) {
                                        System.out.println("\nyou entered incorrect value please enter in correct way again!!!\n ");
                                    }
                                }
                            case 2:
                                RG.displayAllStudents();
                                break;
                            case 3:
                                System.out.println("Exiting Registration System. Goodbyeeeeeee!");
                                System.exit(0);

                            default:
                                System.out.println("Invalid choice. Please enter a valid option.");

                        }

                    }
                } catch (Exception e) {
                    System.out.println("Invalid choice. Please enter a valid option.\n please run again the code");
                }

            }

    }


