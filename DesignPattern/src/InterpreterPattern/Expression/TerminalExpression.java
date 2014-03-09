/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterpreterPattern.Expression;

/**
 *
 * @author nghiatc
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
