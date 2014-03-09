/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FilterPattern.Criteria;

import FilterPattern.Person;
import java.util.List;

/**
 *
 * @author nghiatc
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
