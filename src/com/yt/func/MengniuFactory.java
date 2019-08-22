package com.yt.func;

import com.yt.Mengniu;
import com.yt.Milk;

public class MengniuFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Mengniu();
    }
}
