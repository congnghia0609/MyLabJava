/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceLocatorPattern;

import ServiceLocatorPattern.Service.Service;
import ServiceLocatorPattern.ServiceLocator.ServiceLocator;

/**
 *
 * @author nghiatc 
 * The service locator design pattern is used when we want to
 * locate various services using JNDI lookup.
 *
 * Considering high cost of looking up JNDI for a service, Service Locator
 * pattern makes use of caching technique.
 *
 * For the first time a service is required, Service Locator looks up in JNDI
 * and caches the service object.
 *
 * Further lookup or same service via Service Locator is done in its cache which
 * improves the performance of application to great extent.
 *
 *
 * Service - Actual Service which will process the request. Reference of such
 * service is to be looked upon in JNDI server.
 *
 * Context / Initial Context - JNDI Context, carries the reference to service
 * used for lookup purpose.
 *
 * Service Locator - Service Locator is a single point of contact to get
 * services by JNDI lookup, caching the services.
 *
 * Cache - Cache to store references of services to reuse them.
 *
 * Client - Client is the object who invokes the services via ServiceLocator.
 */
public class ServiceLocatorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}










