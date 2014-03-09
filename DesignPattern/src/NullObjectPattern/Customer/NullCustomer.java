/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NullObjectPattern.Customer;

/**
 *
 * @author nghiatc
 */
public class NullCustomer extends AbstractCustomer{

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
    
}
