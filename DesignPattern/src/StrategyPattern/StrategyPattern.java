/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyPattern;

import StrategyPattern.Strategy.OperationAdd;
import StrategyPattern.Strategy.OperationMultiply;
import StrategyPattern.Strategy.OperationSubstract;

/**
 *
 * @author nghiatc In Strategy pattern, a class behavior or its algorithm can be
 * changed at run time.
 */
public class StrategyPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
