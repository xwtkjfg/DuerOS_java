package com.car.ctl.demo.bean;


/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/3/5 0005
 * Time: 9:51
 * To change this template use File | Settings | File Templates.
 * Description:
 */

public class CarAction {
    /**
     * 编号
     */
    private String code;

    /**
     * 方向
     */
    private String direction;

    /**
     * 距离
     */
    private Distance distance = null;

    /**
     * 速度
     */
    private Integer speed = 25;

    /**
     * 车灯
     */
    private String lights ;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Distance getDistance() {
        return distance;
    }

    public void setDistance(Distance distance) {
        this.distance = distance;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public String getLights() {
        return lights;
    }

    public void setLights(String lights) { this.lights = lights;
    }
}