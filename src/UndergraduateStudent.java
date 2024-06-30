public class UndergraduateStudent extends Student{

    public UndergraduateStudent(String name, int age, String course) {
        super(name, age, course);
    }



    @Override
    public double calculateGPA(int AllpresentDay, int AllabssentDay) {
int credit=30;
int grade=8;
  double gpa= (credit*grade)/60;
        return gpa;
    }

}
