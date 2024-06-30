public class Phd extends Student{
    public Phd(String name, int age, String course) {
        super(name, age, course);
    }

    public double calculateGPA(int AllpresentDay, int AllabssentDay) {
        double credit=30;
        double grade=8;
        double gpa= credit /90 * grade;
        return gpa;
    }
}
