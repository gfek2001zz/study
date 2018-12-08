package com.gao.proxy;

public class RealSubject implements ISubject {

    public void request(String url) {
        System.out.println("请求：" + url);
    }
}
