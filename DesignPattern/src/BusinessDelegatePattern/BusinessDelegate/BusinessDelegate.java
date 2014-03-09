/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessDelegatePattern.BusinessDelegate;

import BusinessDelegatePattern.BusinessService.BusinessService;
import BusinessDelegatePattern.LookUpService.BusinessLookUp;

/**
 *
 * @author nghiatc
 */
public class BusinessDelegate {

    private BusinessLookUp lookupService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
