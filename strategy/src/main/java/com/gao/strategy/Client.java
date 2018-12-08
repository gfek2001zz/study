package com.gao.strategy;

public class Client {

    public static void main(String[] args) {

        Context context = new Context("算法A");
        context.contextInterface();

        context = new Context("算法B");
        context.contextInterface();


        context = new Context("算法C");
        context.contextInterface();

    }
}
