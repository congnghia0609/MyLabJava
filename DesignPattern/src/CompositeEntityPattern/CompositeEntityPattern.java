/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CompositeEntityPattern;

/**
 *
 * @author nghiatc Composite Entity pattern is used in EJB persistence
 * mechanism. A Composite entity is an EJB entity bean which represents a graph
 * of objects. When a composite entity is updated, internally dependent objects
 * beans get updated automatically as being managed by EJB entity bean.
 *
 * Composite Entity - It is primary entity bean. It can be coarse grained or can
 * contain a coarse grained object to be used for persistence purpose.
 *
 * Coarse-Grained Object -This object contains dependent objects. It has its own
 * life cycle and also manages life cycle of dependent objects.
 *
 * Dependent Object - Dependent objects is an object which depends on
 * Coarse-Grained object for its persistence lifecycle.
 *
 * Strategies - Strategies represents how to implement a Composite Entity.
 */
public class CompositeEntityPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}



