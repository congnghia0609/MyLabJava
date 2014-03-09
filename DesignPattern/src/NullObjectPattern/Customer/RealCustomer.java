/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NullObjectPattern.Customer;

/**
 *
 * @author nghiatc
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
