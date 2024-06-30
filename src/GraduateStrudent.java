public class GraduateStrudent extends Student{
    public GraduateStrudent(String name, int age, String course) {
        super(name, age, course);
    }



    public double calculateGPA(int AllpresentDay, int AllabssentDay) {
        double credit=130;
        double grade=8;
        double gpa= credit /180 * grade;
        return gpa;
    }
}
