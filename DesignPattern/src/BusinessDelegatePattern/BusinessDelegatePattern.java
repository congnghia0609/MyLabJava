/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessDelegatePattern;

import BusinessDelegatePattern.BusinessDelegate.BusinessDelegate;
import BusinessDelegatePattern.Client.Client;

/**
 *
 * @author nghiatc Business Delegate Pattern is used to decouple presentation
 * tier and business tier.
 *
 * Client - Presentation tier code may be JSP, servlet or UI java code.
 *
 * Business Delegate - A single entry point class for client entities to provide
 * access to Business Service methods.
 *
 * LookUp Service - Lookup service object is responsible to get relative
 * business implementation and provide business object access to business
 * delegate object.
 *
 * Business Service - Business Service interface. Concrete classes implements
 * this business service to provide actual business implementation logic.
 */
public class BusinessDelegatePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}












