package com.gfb.tmp_reg_helper.domain;

/**
 * Created by goforbroke on 12.06.17.
 */
public class PlaceOfBirth {
    private String county;
    private String city;

    public String getCounty() {
        return county;
    }

    public PlaceOfBirth setCounty(String county) {
        this.county = county;
        return this;
    }

    public String getCity() {
        return city;
    }

    public PlaceOfBirth setCity(String city) {
        this.city = city;
        return this;
    }
}
