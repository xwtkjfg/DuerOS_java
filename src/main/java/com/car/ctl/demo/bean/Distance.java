package com.car.ctl.demo.bean;

import java.io.Serializable;

public class Distance implements Serializable {

    private Double length ;

    private String unit ;

    /**
     * 距离
     */
    //private String origin;

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }


   /* public String getDistance() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
    */


}
