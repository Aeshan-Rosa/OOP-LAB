package universityenrollmentsystem;

public class CourseCoordinator extends Person{

    //the attributes
    private String facultyName;
    private String mainProgramme;
    private int maxAdvisees;

    //constructor
    public CourseCoordinator(String name, String surname) {
        super(name, surname);
    }

    //getters and setters
    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getMainProgramme() {
        return mainProgramme;
    }

    public void setMainProgramme(String mainProgramme) {
        this.mainProgramme = mainProgramme;
    }

    public int getMaxAdvisees() {
        return maxAdvisees;
    }

    public void setMaxAdvisees(int maxAdvisees) {
        this.maxAdvisees = maxAdvisees;
    }

    //overriding the toString Method
    @Override
    public String toString(){
        return super.toString() + "Faculty Name - " + facultyName + "Main Programme -" + mainProgramme
                + "Max Advisees - " + maxAdvisees;
    }
}
