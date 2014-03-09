/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CompositePattern;

import java.util.*;

/**
 *
 * @author nghiatc
 */
public class Employee {

    private String name;
    private String dept;
    private int salary;
    private int costs;
    private List<Employee> subordinates;

    // constructor
    public Employee(String name, String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        this.costs = 0;
        subordinates = new ArrayList<Employee>();
    }

    public int getCosts() {
        return costs;
    }

    public void setCosts(int costs) {
        this.costs = costs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setSubordinates(List<Employee> subordinates) {
        this.subordinates = subordinates;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getSalary() {
        return salary;
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return ("Employee :[ Name : " + name
                + ", dept : " + dept + ", salary :"
                + salary + " ]");
    }

    public int totalCost() {
        costs = salary;
        if (subordinates != null && subordinates.size() > 0) {
            for (Employee e : subordinates) {
                costs += e.totalCost();
            }
        }
        return costs;
    }
}
