/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package VisitorPattern;

import VisitorPattern.ComputerPart.Computer;
import VisitorPattern.ComputerPart.ComputerPart;

/**
 *
 * @author nghiatc
 * In Visitor pattern, we use a visitor class which changes the executing algorithm of an element class.
 */
public class VisitorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}








