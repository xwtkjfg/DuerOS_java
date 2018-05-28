package com.car.ctl.demo.bean;

import com.intellij.ui.RightAlignedLabelUI;

public enum LightsEnums {
    TURN_ON("turn_on", "打开"),
    TURN_OFF("turn_off", "关闭");

    private String order;
    private String orderWord;

    LightsEnums(String order, String orderWord) {
        this.order = order;
        this.orderWord = orderWord;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getOrderWord() {
        return orderWord;
    }

    public void setOrderWord(String orderWord) {
        this.orderWord = orderWord;
    }
}
