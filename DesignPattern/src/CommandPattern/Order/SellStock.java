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
public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
