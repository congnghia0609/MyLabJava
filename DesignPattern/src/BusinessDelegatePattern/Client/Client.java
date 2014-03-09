/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessDelegatePattern.Client;

import BusinessDelegatePattern.BusinessDelegate.BusinessDelegate;

/**
 *
 * @author nghiatc
 */
public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService) {
        this.businessService = businessService;
    }

    public void doTask() {
        businessService.doTask();
    }
}
