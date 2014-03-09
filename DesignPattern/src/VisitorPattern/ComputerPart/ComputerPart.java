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
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
