package com.car.ctl.demo.bean;

public class Distance {

    private Integer length;

    private String unit;

    /**
     * 距离
     */
    private String origin;

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getDistance() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }


}
