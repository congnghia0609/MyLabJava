/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessDelegatePattern.Service;

import BusinessDelegatePattern.BusinessService.BusinessService;

/**
 *
 * @author nghiatc
 */
public class EJBService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
