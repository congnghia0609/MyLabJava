/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NullObjectPattern;

import NullObjectPattern.Customer.AbstractCustomer;
import NullObjectPattern.Customer.NullCustomer;
import NullObjectPattern.Customer.RealCustomer;

/**
 *
 * @author nghiatc
 */
public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
