// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        calculateGPA(2,5);
    }
    public static double calculateGPA(int AllpresentDay, int AllabssentDay) {
        double credit=130;
        double grade=8;
        double gpa= credit /180 * grade;
        System.out.println(gpa);
        return gpa;
    }
}