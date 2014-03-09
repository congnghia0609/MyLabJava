/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyPattern.Strategy;

/**
 *
 * @author nghiatc
 */
public class OperationMultiply implements Strategy{

    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
    
}
