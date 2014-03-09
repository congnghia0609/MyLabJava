/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterceptingFilterPattern.Filter;

/**
 *
 * @author nghiatc
 */
public class DebugFilter implements Filter{

    @Override
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
    
}
