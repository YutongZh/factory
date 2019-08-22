package com.yt.func;

import com.yt.Milk;
import com.yt.Yili;

public class YiliFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Yili();
    }
}
