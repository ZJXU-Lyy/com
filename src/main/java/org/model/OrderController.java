package org.model;

import org.springframework.stereotype.Controller;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Program: com
 * @ClassName: OrderController
 * @Author: Young
 * @Date: 2020-11-20
 * @Time: 16:26
 * @Version: v1.0
 */
public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    public OrderController() {
    }

    public OrderService getOrderService() {
        return orderService;
    }

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }
}
