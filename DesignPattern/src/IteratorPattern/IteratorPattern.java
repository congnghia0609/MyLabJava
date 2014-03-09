/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IteratorPattern;

/**
 *
 * @author nghiatc Iterator pattern is very commonly used design pattern in Java
 * and .Net programming environment. This pattern is used to get a way to access
 * the elements of a collection object in sequential manner without any need to
 * know its underlying representation.
 */
public class IteratorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NameRepository namesRepository = new NameRepository();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}
