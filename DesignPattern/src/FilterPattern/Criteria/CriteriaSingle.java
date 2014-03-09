/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FilterPattern.Criteria;

import FilterPattern.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nghiatc
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
