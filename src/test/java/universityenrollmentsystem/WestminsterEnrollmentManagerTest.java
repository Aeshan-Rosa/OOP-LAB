package universityenrollmentsystem;

import static org.junit.jupiter.api.Assertions.*;

class WestminsterEnrollmentManagerTest {

    @org.junit.jupiter.api.Test
    void ConstructorBehaviour() {
        Student student = new Student("Alice","Brown");

        assertEquals("Alice", student.getName());
        assertEquals("Brown", student.getSurname());
    }

    @org.junit.jupiter.api.Test
    void modulesEnrolledtest() {
        Student student = new Student("Alice","Brown");
        student.setModulesEnrolled(3);
        student.setModulesEnrolled(4);

        assertEquals(4, student.getModulesEnrolled());

    }

    @org.junit.jupiter.api.Test
    void lecturertest() {
        Lecturer lecturer01 = new Lecturer("Aeshan","Rosa");
        lecturer01.setOfficeNumber(210);

        assertEquals(210, lecturer01.getOfficeNumber());

    }
}