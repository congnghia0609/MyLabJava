/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessDelegatePattern.LookUpService;

import BusinessDelegatePattern.Service.EJBService;
import BusinessDelegatePattern.Service.JMSService;
import BusinessDelegatePattern.BusinessService.BusinessService;

/**
 *
 * @author nghiatc
 */
public class BusinessLookUp {

    public BusinessService getBusinessService(String serviceType) {
        if (serviceType.equalsIgnoreCase("EJB")) {
            return new EJBService();
        } else {
            return new JMSService();
        }
    }
}
