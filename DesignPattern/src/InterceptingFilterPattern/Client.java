/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterceptingFilterPattern;

import InterceptingFilterPattern.Filter.FilterManager;

/**
 *
 * @author nghiatc
 */
public class Client {

    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request) {
        filterManager.filterRequest(request);
    }
}
