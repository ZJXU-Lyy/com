package org.model;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Program: com
 * @ClassName: OrderService
 * @Author: Young
 * @Date: 2020-11-20
 * @Time: 16:28
 * @Version: v1.0
 */
public class OrderService {
    private OrderDao orderDao;

    public OrderService(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public OrderService() {
    }

    public OrderDao getOrderDao() {
        return orderDao;
    }

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }
}
