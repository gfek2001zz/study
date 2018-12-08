package com.gao.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Proxy implements InvocationHandler {
    private Object target;

    private Object logger;

    public <T> T bind(Object target, Object logger) {
        this.target = target;
        this.logger = logger;

        return (T) java.lang.reflect.Proxy.newProxyInstance(
                this.target.getClass().getClassLoader(), this.target.getClass().getInterfaces(), this);
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = null;

        Class loggerClass = logger.getClass();

        Method start = loggerClass.getDeclaredMethod("start", new Class[] {Method.class});
        start.invoke(logger, new Object[] {method});

        method.invoke(target, args);

        Method end = loggerClass.getDeclaredMethod("end", new Class[]{Method.class});
        end.invoke(logger, new Object[]{method});


        return result;
    }
}
