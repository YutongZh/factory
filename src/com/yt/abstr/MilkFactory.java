package com.yt.abstr;

import com.yt.Milk;
import com.yt.func.MengniuFactory;
import com.yt.func.TelunsuFactory;
import com.yt.func.YiliFactory;

public class MilkFactory extends AbstarctFactory {
    @Override
    Milk getMengniu() {
        return new MengniuFactory().getMilk();
    }

    @Override
    Milk getYili() {
        return new YiliFactory().getMilk();
    }

    @Override
    Milk getTelunsu() {
        return new TelunsuFactory().getMilk();
    }
}
