public class Personne{
    protected String firstName;
    protected String lastName;
    protected int age;

    public Personne(String firstName,String lastName,int age) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void displayInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
    }
}
