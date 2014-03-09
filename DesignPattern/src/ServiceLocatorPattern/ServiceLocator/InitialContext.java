/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceLocatorPattern.ServiceLocator;

import ServiceLocatorPattern.Service.Service1;
import ServiceLocatorPattern.Service.Service2;

/**
 *
 * @author nghiatc
 */
public class InitialContext {

    public Object lookup(String jndiName) {
        if (jndiName.equalsIgnoreCase("SERVICE1")) {
            System.out.println("Looking up and creating a new Service1 object");
            return new Service1();
        } else if (jndiName.equalsIgnoreCase("SERVICE2")) {
            System.out.println("Looking up and creating a new Service2 object");
            return new Service2();
        }
        return null;
    }
}
