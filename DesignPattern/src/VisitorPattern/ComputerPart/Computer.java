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
public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
