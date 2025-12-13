TASK 01 – New subclass using inheritance & encapsulation (25 marks)



You will extend the system to support tracking of former students: Alumni.



Create a new Java class called Alumni within the package universityenrollmentsystem.

(2 marks)



Ensure the Alumni class inherits from the Person class and correctly applies inheritance.

(4 marks)



The Alumni class should have the following instance variables:

name, surname, dob, ID inherited from Person.
Additionally, include:
int graduationYear;
String degreeTitle;
String currentEmployer;
(4 marks)



Implement a constructor in the Alumni class that takes String name and String surname as parameters and calls the parent constructor.

(4 marks)



Provide public setter and getter methods for all new instance variables (graduationYear, degreeTitle, currentEmployer) to follow encapsulation (validation not required).

(8 marks)



Override the toString() method to return a String that clearly identifies this as an Alumni record and includes the graduation year, degree title and current employer, appended to the information from Person.

(3 marks)

Answer
true

Question 2
2
Essay
TASK 02 – Interface method & search by ID prefix (24 marks)



You will extend the interface and manager to search for people using an ID prefix.



In the EnrollmentManager interface, add an abstract method with the following signature:

void searchPeopleByIDPrefix();

(2 marks)



In the WestminsterEnrollmentManager class, override the searchPeopleByIDPrefix() method.

(2 marks)



The method searchPeopleByIDPrefix() should:

Prompt the user to enter a text prefix that will be matched against the beginning of each person’s ID (for example, entering "STU" should match IDs like "STU00123").
(3 marks)
Treat the comparison as case-insensitive, and find all people whose ID starts with that prefix. You should iterate over personList and select all Person objects where the ID (converted to a common case, e.g. upper case) begins with the user-entered prefix.
(7 marks)
If one or more matches are found, print each matching person using toString().
(6 marks)
If no matches are found, print an appropriate message indicating that no people were found with a matching ID prefix.
(3 marks)


Add a new menu option in runMenu() (for example "4 – Search people by ID prefix") that calls searchPeopleByIDPrefix() and handle it correctly in the switch statement.

(4 marks)

Answer


Question 3
3
Essay
TASK 03 – Sorting and dedicated print by ID (17 marks)



You will add a separate print function that sorts by ID only.



Create a method in WestminsterEnrollmentManager called printListSortedByID(). This method should:

create a copy of personList,
sort the copy by the ID field in ascending lexicographical order,
print all entries from the sorted copy using toString().
(9 marks)


Use the Java Collections API (for example, a Comparator<Person> comparing getID() with String.compareTo, and Collections.sort or list.sort) to implement the sorting.

(5 marks)



Add a menu option in runMenu() (for example "5 – Print list sorted by ID") that calls printListSortedByID() so the user can select this behaviour from the console menu.

(3 marks)

Answer


Question 4
4
Essay
TASK 04 – Modifying the Table Model (MVC) – Year of Birth column (10 marks)



You will extend the table model so that the year of birth of each person is visible in the GUI.



Modify the UniversityTableModel.java class so that the table includes an additional column "Year of Birth" where:

if a person’s dob is not null, show the 4-digit year (for example 1998),
if dob is null, display "N/A".


You must:

update the columnNames array to include "Year of Birth" at a sensible position,
ensure getColumnCount() returns the correct number of columns after your change,
extend getValueAt(int rowIndex, int columnIndex) to return the appropriate year or "N/A" for the "Year of Birth" column.
(10 marks)
Answer

Question 5
5
Essay
TASK 05 – Event handling in the GUI (Reset Table) (15 marks)



You will add a new button that restores the full, unfiltered view of the table.



In the UniversityTableGUI.java class:

Create a new JButton labelled "Reset Table" and add it to the frame (for example, in the same panel as the Statisticsbutton).
(4 marks)
Add an ActionListener to this button so that when it is clicked:
a new UniversityTableModel is created using the original full ArrayList<Person> passed to the GUI constructor,
this model is set on the JTable, restoring the original list of all people (including any new subclasses such as Alumni).
(8 marks)

Ensure the program does not crash or behave incorrectly if the table is already showing the full list when “Reset Table” is clicked (for example, simply recreating and resetting the model is acceptable).
(3 marks)
Answer

Question 6
6
Essay
TASK 06 – JUnit testing (9 marks)

You will write unit tests to check key aspects of the existing Person, Student and Lecturer classes.



Create a JUnit test class named PersonStudentLecturerTest in the appropriate test source folder.

(1 mark)



Write a test method that verifies the constructor behaviour of Student:

create a Student object with a known name and surname (for example, "Alice", "Brown"),
use assertEquals to verify that getName() and getSurname() return "Alice" and "Brown" respectively.
(3 marks)


Write a test method that checks updating the modulesEnrolled field in Student:

create a Student object,
use the setter to assign an initial number of modules (e.g. 4),
then call the setter again to change it to a different value (e.g. 6),
use assertEquals to verify that getModulesEnrolled() returns the final value (6).
(3 marks)


Write a test method that checks that the Lecturer’s office number getter and setter work as expected:

create a Lecturer object with a known name and surname,
set the office number to a known value (e.g. 210) using the appropriate setter method,
use assertEquals to verify that getOfficeNumber() returns the expected value.
(2 marks)
Answer
