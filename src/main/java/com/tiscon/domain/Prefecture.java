package com.tiscon.domain;

import java.io.Serializable;

public class Prefecture implements Serializable {
    private Integer prefectureId;

    private String prefectureName;

    public Integer getPrefectureId() {
        return prefectureId;
    }

    public void setPrefectureId(Integer prefectureId) {
        this.prefectureId = prefectureId;
    }

    public String getPrefectureName() {
        return prefectureName;
    }

    public void setPrefectureName(String prefectureName) {
        this.prefectureName = prefectureName;
    }
}
