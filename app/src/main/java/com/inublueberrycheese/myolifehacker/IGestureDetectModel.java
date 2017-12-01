package com.inublueberrycheese.myolifehacker;

/**
 * Created by Seongho on 2017-12-01.
 */

public interface IGestureDetectModel {
    public void event(long eventTime,byte[] data);
    public void setAction(IGestureDetectAction action);
    public void action();
}
