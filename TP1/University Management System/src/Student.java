import java.util.ArrayList;

class Student {
    private int studentId;
    private String firstName,lastName;
    private ArrayList<Course> courses;

    public Student(int studentId,String firstName,String lastName) {
        this.studentId=studentId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.courses=new ArrayList<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void enroll(Course course) {
        courses.add(course);
    }
}