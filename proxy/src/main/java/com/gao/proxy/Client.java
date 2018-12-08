package com.gao.proxy;

public class Client {

    public static void main(String[] args) {

        ISubject subject = new Proxy().bind(new RealSubject(), new Logger());

        subject.request("http://w3.huawei.com/psi");
    }
}
