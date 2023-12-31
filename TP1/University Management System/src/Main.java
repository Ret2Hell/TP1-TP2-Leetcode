public class Main {
    public static void main(String[] args) {

        Student student1=new Student(357,"Mohamed Yassine","Taieb");
        Student student2=new Student(214,"Lionel","Messi");
        Instructor instructor=new Instructor(15,"Kaabi","Mohamed");
        Course course=new Course(23,"Magnto",instructor);
        student1.enroll(course);
        student2.enroll(course);
        System.out.println("Student1 : "+student1.getFirstName()+" "+student1.getLastName());
        System.out.println("Student1 courses : "+student1.getCourses().get(0).getCourseName());
        System.out.println("Student2: "+student2.getFirstName()+" "+student2.getLastName());
        System.out.println("Student2 courses : " + student2.getCourses().get(0).getCourseName());
        System.out.println("Instructor: " + course.getInstructor().getFirstName() + " " + course.getInstructor().getLastName());
    }
}