package Excercise10;

public class Main {
  public static void main(String[] args) {
        Student student = new Student("Sai", "S101", "A");
        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        controller.updateView();

        controller.setStudentName("Varma Sai");
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}
