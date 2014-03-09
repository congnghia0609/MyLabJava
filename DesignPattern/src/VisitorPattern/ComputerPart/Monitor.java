/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package VisitorPattern.ComputerPart;

import VisitorPattern.ComputerPartVisitor;

/**
 *
 * @author nghiatc
 */
public class Monitor implements ComputerPart{

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
    
}
