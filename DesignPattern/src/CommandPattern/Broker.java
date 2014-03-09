/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPattern;

import CommandPattern.Order.Order;
import java.util.*;

/**
 *
 * @author nghiatc
 */
public class Broker {

    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
