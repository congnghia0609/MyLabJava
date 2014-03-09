/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FilterPattern;

import FilterPattern.Criteria.AndCriteria;
import FilterPattern.Criteria.Criteria;
import FilterPattern.Criteria.CriteriaFemale;
import FilterPattern.Criteria.CriteriaMale;
import FilterPattern.Criteria.CriteriaSingle;
import FilterPattern.Criteria.OrCriteria;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nghiatc Filter pattern or Criteria pattern is a design pattern that
 * enables developers to filter a set of objects, using different criteria,
 * chaining them in a decoupled way through logical operations.
 */
public class FilterPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    + ", Gender : " + person.getGender()
                    + ", Marital Status : " + person.getMaritalStatus()
                    + " ]");
        }
    }
}
