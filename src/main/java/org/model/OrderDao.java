package org.model;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Program: com
 * @ClassName: OrderDao
 * @Author: Young
 * @Date: 2020-11-20
 * @Time: 16:28
 * @Version: v1.0
 */
public class OrderDao {
    private String response;

    public OrderDao(String response) {
        this.response = response;
    }

    public OrderDao() {
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
