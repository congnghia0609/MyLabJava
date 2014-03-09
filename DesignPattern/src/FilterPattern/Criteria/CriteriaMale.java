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
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
