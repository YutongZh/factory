package com.yt.simple;

import com.yt.Milk;

/**
 * 简单工厂
 */
public interface ISimpleFactory {

    Milk getMilk(String milk);
}
