package com.tiscon.domain;

import java.io.Serializable;

public class PrefectureDistance implements Serializable {
    private Integer prefectureIdFrom;

    private Integer prefectureIdTo;

    private double distance;

    public Integer getPrefectureIdFrom() {
        return prefectureIdFrom;
    }

    public void setPrefectureIdFrom(Integer prefectureIdFrom) {
        this.prefectureIdFrom = prefectureIdFrom;
    }

    public Integer getPrefectureIdTo() {
        return prefectureIdTo;
    }

    public void setPrefectureIdTo(Integer prefectureIdTo) {
        this.prefectureIdTo = prefectureIdTo;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
