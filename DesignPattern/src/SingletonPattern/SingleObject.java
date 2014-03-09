/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonPattern;

/**
 *
 * @author nghiatc
 */
public class SingleObject {
    //create an object of SingleObject
    private static SingleObject instance = new SingleObject();
    private int count = 0;
    //make the constructor private so that this class cannot be
    //instantiated
    private SingleObject(){
        ++count;
    }
    
    //Get the only object available
    public static SingleObject getInstance(){
        if(instance == null){
            instance = new SingleObject();
        }
        return instance;
    }
    
    public void showMessage(String name){
        System.out.println("Hi! This is SingleObject times: " + count + " of " + name);
    }
}
