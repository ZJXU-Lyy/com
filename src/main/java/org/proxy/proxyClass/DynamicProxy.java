package org.proxy.proxyClass;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Program: com
 * @ClassName: DynamicProxy
 * @Author: Young
 * @Date: 2020-11-21
 * @Time: 15:37
 * @Version: v1.0
 */
public class DynamicProxy implements InvocationHandler {
    private Object object;

    public Object bind(Object object) {
        this.object = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        try {
            validateUser();
            result = method.invoke(object, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public void validateUser() {
        System.out.println("验证用户");
    }
}
