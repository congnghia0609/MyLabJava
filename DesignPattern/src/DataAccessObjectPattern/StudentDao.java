/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessObjectPattern;

import java.util.List;

/**
 *
 * @author nghiatc
 */
public interface StudentDao {

    public List<Student> getAllStudents();

    public Student getStudent(int rollNo);

    public void updateStudent(Student student);

    public void deleteStudent(Student student);
}
