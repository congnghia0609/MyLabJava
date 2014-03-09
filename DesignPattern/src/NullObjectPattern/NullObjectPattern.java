/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NullObjectPattern;

import NullObjectPattern.Customer.AbstractCustomer;

/**
 *
 * @author nghiatc 
 * In Null Object pattern, a null object replaces check of NULL object instance.
 * Instead of putting if check for a null value, Null Object
 * reflects a do nothing relationship. Such Null object can also be used to
 * provide default behaviour in case data is not available.
 */
public class NullObjectPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
}






