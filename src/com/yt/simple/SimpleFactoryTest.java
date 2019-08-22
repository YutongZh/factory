package com.yt.simple;

/**
 * 简单工厂模式
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        ISimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.getMilk("telunsu");
    }
}
