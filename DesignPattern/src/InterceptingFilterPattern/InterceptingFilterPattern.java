/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterceptingFilterPattern;

import InterceptingFilterPattern.Filter.AuthenticationFilter;
import InterceptingFilterPattern.Filter.DebugFilter;
import InterceptingFilterPattern.Filter.FilterManager;
import InterceptingFilterPattern.Filter.Target;

/**
 *
 * @author nghiatc The intercepting filter design pattern is used when we want
 * to do some pre-processing / post-processing with request or response of the
 * application. Filters are defined and applied on the request before passing
 * the request to actual target application. Filters can do the authentication/
 * authorization/ logging or tracking of request and then pass the requests to
 * corresponding handlers.
 *
 * Filter - Filter which will perform certain task prior or after execution of
 * request by request handler.
 *
 * Filter Chain - Filter Chain carries multiple filters and help to execute them
 * in defined order on target.
 *
 * Target - Target object is the request handler.
 *
 * Filter Manager - Filter Manager manages the filters and Filter Chain.
 *
 * Client - Client is the object who sends request to the Target object.
 */
public class InterceptingFilterPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}







