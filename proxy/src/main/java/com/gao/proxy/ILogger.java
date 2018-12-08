package com.gao.proxy;

import java.lang.reflect.Method;

public interface ILogger {

    void start(Method method);

    void end(Method method);
}
