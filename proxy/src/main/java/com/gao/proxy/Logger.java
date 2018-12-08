package com.gao.proxy;

import java.lang.reflect.Method;
import java.util.Date;

public class Logger implements ILogger {

    public void start(Method method) {
        System.out.println(new Date() + " "  + method.getName() + "() start");
    }


    public void end(Method method) {
        System.out.println(new Date() + " " + method.getName() + "() end");
    }
}
