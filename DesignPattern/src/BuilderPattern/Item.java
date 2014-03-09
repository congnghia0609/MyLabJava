/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern;

import BuilderPattern.Pack.Packing;

/**
 *
 * @author nghiatc
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
