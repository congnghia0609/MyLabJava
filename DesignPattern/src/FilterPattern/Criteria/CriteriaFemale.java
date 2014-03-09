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
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
