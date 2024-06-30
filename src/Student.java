abstract class Student implements GPA{
    String name;
    int age;
    String course;
    int AllpresentDay;
    int AllabsentDay;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.AllpresentDay=0;
        this.AllabsentDay=0;
    }




    public void Attendance(int presentDay,int absentDay){
        AllpresentDay+=presentDay;
        AllabsentDay+=absentDay;

    }
    public void displayReport() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Total Days Present: " + AllpresentDay);
        System.out.println("Total Days Absent: " + AllabsentDay);
        System.out.println("GPA: " + calculateGPA(AllpresentDay, AllabsentDay));

    }

}
