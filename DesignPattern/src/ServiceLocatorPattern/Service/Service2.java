/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceLocatorPattern.Service;

/**
 *
 * @author nghiatc
 */
public class Service2 implements Service{

    @Override
    public String getName() {
        return "Service2";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service2");
    }
    
}
