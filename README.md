Student Registration System
Overview
This is a simple Student Registration System implemented in Java. 
The system uses an ArrayList to manage student information dynamically. 
It allows users to register new students, display all registered students, and exit the system.

Key Features:
Dynamic Array (ArrayList): The program uses ArrayList, 
a dynamic array implementation of the List interface, 
which allows for automatic resizing as elements are added or removed.

Random Access: Supports fast random access to student elements using their index.

Resizable: Unlike traditional arrays, ArrayList does not require the size to be defined in advance, making it more flexible.

Components
1. Student Registration System Class (StudentRegistrationSystem)
Manages a list of students using List<Student> from the java.util package.

Provides methods to register a new student and display all registered students.


2. Student Class (Student)
Represents a student with attributes such as:
ID (unique for each student)
Name
Gender
Date of Birth
And more.

Each student is assigned a unique registration number using a static counter (UID).

3. Main Method
The entry point of the program.

Uses a Scanner for user input and provides an interactive interface for users.
Runs in an infinite loop, allowing the user to perform actions until they choose to exit.

Menu Options
The program presents the following options:
Register a New Student: Allows the user to enter details for a new student and adds them to the list.
Display All Registered Students: Displays a list of all registered students, showing their details.

Exit the System: Terminates the program.
User Input Handling
The program ensures valid user input with the following features:
getValidStringInput(): Ensures that names contain only letters.
Exception handling for invalid inputs (e.g., NumberFormatException), preventing crashes and guiding the user to input correct values.

Exception Handling
The program handles various exceptions to ensure a smooth user experience, such as invalid inputs when entering student details.
Ensures that invalid choices or incorrect data formats do not cause the program to crash.
Infinite Loop
The program runs continuously until the user chooses to exit (option 3). Invalid choices are handled, and the user is prompted to try again.

Example Usage
Run the Program:
Register a New Student:
The user is prompted to enter the student's details like name, gender, ID, and date of birth.
Display All Registered Students:
Displays a list of all registered students with their details.


Exit:
Terminates the program.
Conclusion
This Student Registration System allows users to manage a list of students efficiently using an ArrayList. 
Exception handling and user input validation are implemented to ensure a smooth experience, and the program continues running until the user chooses to exit.
