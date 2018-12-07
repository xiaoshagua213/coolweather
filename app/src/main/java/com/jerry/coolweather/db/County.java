package com.jerry.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by jerry on 2018/12/7.
 * County 县名
 */

public class County extends DataSupport {

    private int id;
    private int cityId;
    private String cityName;
    private String weatherId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
