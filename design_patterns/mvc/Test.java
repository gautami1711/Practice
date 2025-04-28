package design_patterns.mvc;

public class Test {
    public static void main(String[] args) {
        Student model=new Student("John",1);
        StudentView view =new StudentView();
        StudentController controller=new StudentController(model,view);

        controller.updateView();
        controller.setStudentName("Alex");
        controller.updateView();
    }
}
