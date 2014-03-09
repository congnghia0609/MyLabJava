/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MVCPattern;

/**
 *
 * @author nghiatc MVC Pattern stands for Model-View-Controller Pattern.
 *
 * Model - Model represents an object or JAVA POJO carrying data. It can also
 * have logic to update controller if its data changes.
 *
 * View - View represents the visualization of the data that model contains.
 *
 * Controller - Controller acts on both Model and view. It controls the data
 * flow into model object and updates the view whenever data changes. It keeps
 * View and Model separate.
 */
public class MVCPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //fetch student record based on his roll no from the database
        Student model = retriveStudentFromDatabase();

        //Create a view : to write student details on console
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        //update model data
        controller.setStudentName("John");

        controller.updateView();
    }

    private static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
