/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package VisitorPattern;

import VisitorPattern.ComputerPart.Computer;
import VisitorPattern.ComputerPart.Keyboard;
import VisitorPattern.ComputerPart.Monitor;
import VisitorPattern.ComputerPart.Mouse;

/**
 *
 * @author nghiatc
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor{

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
    
}
