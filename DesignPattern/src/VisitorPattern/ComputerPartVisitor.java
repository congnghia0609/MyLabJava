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
public interface ComputerPartVisitor {

    public void visit(Computer computer);

    public void visit(Mouse mouse);

    public void visit(Keyboard keyboard);

    public void visit(Monitor monitor);
}
