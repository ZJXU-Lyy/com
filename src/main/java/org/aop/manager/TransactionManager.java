package org.aop.manager;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Program: com
 * @ClassName: TransactionManager
 * @Author: Young
 * @Date: 2020-11-21
 * @Time: 16:24
 * @Version: v1.0
 */
public class TransactionManager implements Transaction {
    public void beginTransaction() {
        System.out.println("【事务管理器】开始事务");
    }


    public void commit() {
        System.out.println("【事务管理器】提交事务");
    }


    public void rollback() {
        System.out.println("【事务管理器】回滚事务");
    }
}
