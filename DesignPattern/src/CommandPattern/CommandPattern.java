/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPattern;

import CommandPattern.Order.BuyStock;
import CommandPattern.Order.SellStock;

/**
 *
 * @author nghiatc 
 * Command pattern is a data driven design pattern and falls
 * under behavioral pattern category. A request is wrapped under a object as
 * command and passed to invoker object. Invoker object looks for the
 * appropriate object which can handle this command and pass the command to the
 * corresponding object and that object executes the command.
 */
public class CommandPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}



