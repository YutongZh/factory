package com.yt.simple;

import com.yt.Mengniu;
import com.yt.Milk;
import com.yt.Telunsu;
import com.yt.Yili;

public class SimpleFactory implements ISimpleFactory {

    @Override
    public Milk getMilk(String milk) {
        if ("telunsu".equals(milk)){
            return new Telunsu();
        } else if ("yili".equals(milk)){
            return new Yili();
        } else if ("mengniu".equals(milk)){
            return new Mengniu();
        }
        return null;
    }
}
