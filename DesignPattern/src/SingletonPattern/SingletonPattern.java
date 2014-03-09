/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonPattern;

/**
 *
 * @author nghiatc
 */
public class SingletonPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        SingleObject object0 = SingleObject.getInstance();
        SingleObject object1 = SingleObject.getInstance();
        SingleObject object2 = SingleObject.getInstance();
        //show the message
        object0.showMessage("object0");
        object1.showMessage("object1");
        object2.showMessage("object2");
    }
}
