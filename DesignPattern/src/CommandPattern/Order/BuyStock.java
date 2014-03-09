/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPattern.Order;

import CommandPattern.Stock;

/**
 *
 * @author nghiatc
 */
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
