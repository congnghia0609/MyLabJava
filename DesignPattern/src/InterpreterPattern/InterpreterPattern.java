/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterpreterPattern;

import InterpreterPattern.Expression.AndExpression;
import InterpreterPattern.Expression.Expression;
import InterpreterPattern.Expression.OrExpression;
import InterpreterPattern.Expression.TerminalExpression;

/**
 *
 * @author nghiatc Interpreter pattern provides way to evaluate language grammar
 * or expression. This pattern is used in SQL parsing, symbol processing engine
 * etc.
 */
public class InterpreterPattern {

    //Rule: Robert and John are male
    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //Rule: Julie is a married women
    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
    }
}



