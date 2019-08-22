package com.yt.func;

import com.yt.Milk;
import com.yt.Telunsu;

public class TelunsuFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Telunsu();
    }
}
