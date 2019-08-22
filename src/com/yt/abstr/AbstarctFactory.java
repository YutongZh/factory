package com.yt.abstr;

import com.yt.Milk;

/**
 * 抽象工厂
 */
public abstract class AbstarctFactory {

    abstract Milk getMengniu();

    abstract Milk getYili();

    abstract Milk getTelunsu();
}
