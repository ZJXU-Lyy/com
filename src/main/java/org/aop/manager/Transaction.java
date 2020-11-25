package org.aop.manager;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Program: com
 * @ClassName: Transaction
 * @Author: Young
 * @Date: 2020-11-21
 * @Time: 17:29
 * @Version: v1.0
 */
public interface Transaction {
    void beginTransaction();

    void commit();

    void rollback();
}
